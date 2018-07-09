package cn.tedu.thread;

/**
 * �ȴ����ѻ���
 * 
 * wait()����������һ���߳̽��� ����״̬
 * notify()�������Ի��� ��������ͨ��wait()�������� ����״̬���߳� ������һ���������
 * notifyAll()���� ���Ի���������������ͨ��wait()�������� ����״̬���߳�
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
		System.out.println(Thread.currentThread().getName()+"Ruannable11 ������������");
		System.out.println(Thread.currentThread().getName()+"Ruannable11 ������������");
		System.out.println(Thread.currentThread().getName()+"Ruannable11 ������������");
		synchronized (Demo11.class) {
			try {
				Demo11.class.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+"Ruannable11 ������������");
		System.out.println(Thread.currentThread().getName()+"Ruannable11 ������������");
		System.out.println(Thread.currentThread().getName()+"Ruannable11 ������������");
	}
	
}