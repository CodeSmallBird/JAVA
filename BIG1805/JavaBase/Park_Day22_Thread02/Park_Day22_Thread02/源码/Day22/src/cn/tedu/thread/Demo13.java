package cn.tedu.thread;

import java.util.LinkedList;

/**
 * 利用多线程等待唤醒机制 实现 多线程队列
 */

class ThreadQueue{
	//1.创建队列 作为内部存储 LinkedList本身线程不安全 需要考虑并发安全问题
	private LinkedList<Integer> queue = new LinkedList<>();
	//2.限定队列的最大大小
	private int len  = 5;
	
	/**
	 * 向当前队列中增加元素
	 * 优于内部的LinkedList线程不安全 操作此队列 需要考虑多线程并发安全问题 所以将方法设置为 同步方法
	 * @param num
	 */
	public synchronized void add(Integer num){
		if(queue.size()<len){
			//有空间 直接往里加
			queue.add(num);
			//唤醒 又可能存在的等待取数据 但是因为队列是空的而被挂起的线程
			this.notify();
		}else{
			//没有空间 则挂起当前线程 等待有空间释放
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//当被唤醒 说明空间释放了出来 则将数据加入队列
			queue.add(num);
		}
	}
	
	public synchronized Integer poll(){
		if(queue.size()>0){
			//有元素 直接获取返回
			Integer num = queue.poll();
			//唤醒 有可能存在的等待存入但因为队列满了而被挂起的线程
			this.notify();
			return num;
		}else{
			//没有元素 则挂起当前线程 等待有新元素加入
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//被唤醒 说明有元素被加入了 从队列中取出元素返回
			return queue.poll();
		}
	}
	
}

public class Demo13 {
	public static void main(String[] args) {
		ThreadQueue tq = new ThreadQueue();
		
		new Thread(new producer(tq)).start();
		new Thread(new consumer(tq)).start();
	}
}

/**
 * 消费者
 * 不停的从队列中消费数据
 */
class consumer implements Runnable{
	private ThreadQueue tq = null;
	public consumer(ThreadQueue tq) {
		this.tq = tq;
	}
	
	//--每隔3秒钟从队列中消费一个数据
	@Override
	public void run() {
		while(true){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			int num = tq.poll();
			System.out.println(Thread.currentThread().getName()+"从队列中消费数据。。"+num);
		}
	}
}

/**
 * 生产者
 * 不停的向队列中写入数据
 */
class producer implements Runnable{
	private ThreadQueue tq = null;
	
	public producer(ThreadQueue tq) {
		this.tq = tq;
	}
	
	//--每个两秒向队列中写入数据
	int num = 0;
	@Override
	public void run() {
		while(true){
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			tq.add(num);
			System.out.println(Thread.currentThread().getName()+"向队列加入数据。。"+num);
			num++;
		}
	}
}

