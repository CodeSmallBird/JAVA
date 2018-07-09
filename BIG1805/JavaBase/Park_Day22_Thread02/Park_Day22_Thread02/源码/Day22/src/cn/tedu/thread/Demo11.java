package cn.tedu.thread;

/**
 * 等待唤醒机制
 * 
 * wait()方法可以让一个线程进入 挂起状态
 * notify()方法可以唤醒 锁对象上通过wait()方法进入 挂起状态的线程 唤醒哪一个是随机的
 * notifyAll()方法 可以唤醒所有锁对象上通过wait()方法进入 挂起状态的线程
 *
 */
public class Demo11 {
	public static void main(String[] args) throws Exception {
		new Thread(new Runnable11()).start();
		new Thread(new Runnable11()).start();
		new Thread(new Runnable11()).start();
		
		Thread.sleep(3000);
	
		synchronized (Demo11.class) {
			//Demo11.class.notify();
			Demo11.class.notifyAll();
		}
	}
}

class Runnable11 implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"Ruannable11 启动。。。。");
		System.out.println(Thread.currentThread().getName()+"Ruannable11 启动。。。。");
		System.out.println(Thread.currentThread().getName()+"Ruannable11 启动。。。。");
		synchronized (Demo11.class) {
			try {
				Demo11.class.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+"Ruannable11 启动。。。。");
		System.out.println(Thread.currentThread().getName()+"Ruannable11 启动。。。。");
		System.out.println(Thread.currentThread().getName()+"Ruannable11 启动。。。。");
	}
	
}