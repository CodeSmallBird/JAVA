package cn.tedu.thread;

import java.util.LinkedList;

/**
 * ���ö��̵߳ȴ����ѻ��� ʵ�� ���̶߳���
 */

class ThreadQueue{
	//1.�������� ��Ϊ�ڲ��洢 LinkedList�����̲߳���ȫ ��Ҫ���ǲ�����ȫ����
	private LinkedList<Integer> queue = new LinkedList<>();
	//2.�޶����е�����С
	private int len  = 5;
	
	/**
	 * ��ǰ����������Ԫ��
	 * �����ڲ���LinkedList�̲߳���ȫ �����˶��� ��Ҫ���Ƕ��̲߳�����ȫ���� ���Խ���������Ϊ ͬ������
	 * @param num
	 */
	public synchronized void add(Integer num){
		if(queue.size()<len){
			//�пռ� ֱ�������
			queue.add(num);
			//���� �ֿ��ܴ��ڵĵȴ�ȡ���� ������Ϊ�����ǿյĶ���������߳�
			this.notify();
		}else{
			//û�пռ� �����ǰ�߳� �ȴ��пռ��ͷ�
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//�������� ˵���ռ��ͷ��˳��� �����ݼ������
			queue.add(num);
		}
	}
	
	public synchronized Integer poll(){
		if(queue.size()>0){
			//��Ԫ�� ֱ�ӻ�ȡ����
			Integer num = queue.poll();
			//���� �п��ܴ��ڵĵȴ����뵫��Ϊ�������˶���������߳�
			this.notify();
			return num;
		}else{
			//û��Ԫ�� �����ǰ�߳� �ȴ�����Ԫ�ؼ���
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//������ ˵����Ԫ�ر������� �Ӷ�����ȡ��Ԫ�ط���
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
 * ������
 * ��ͣ�ĴӶ�������������
 */
class consumer implements Runnable{
	private ThreadQueue tq = null;
	public consumer(ThreadQueue tq) {
		this.tq = tq;
	}
	
	//--ÿ��3���ӴӶ���������һ������
	@Override
	public void run() {
		while(true){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			int num = tq.poll();
			System.out.println(Thread.currentThread().getName()+"�Ӷ������������ݡ���"+num);
		}
	}
}

/**
 * ������
 * ��ͣ���������д������
 */
class producer implements Runnable{
	private ThreadQueue tq = null;
	
	public producer(ThreadQueue tq) {
		this.tq = tq;
	}
	
	//--ÿ�������������д������
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
			System.out.println(Thread.currentThread().getName()+"����м������ݡ���"+num);
			num++;
		}
	}
}

