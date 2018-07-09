package cn.tedu.thread;

/**
 * �߳̿�����ʽ2��
 * 	дһ����ʵ��Runnable�ӿ� �����и���run���� ��д�߳�ִ�еĴ���
 *  new Thread(Runnable) ��Runnable�ӿڵ�ʵ����Ķ�������Ϊ���� ����Thread��start()���� �����߳�
 *  
 *  **�̵߳�stop�����Ѿ������� �����Ҫ�˳�һ���߳� ����ͨ�����ƴ���ִ��������ʵ��
 *  **���һ�������� ���е��̶߳��˳� ����Ҳ�͸��Ž���
 */

class MyRunnable implements Runnable{
	public boolean flag = true;
	@Override
	public void run() {
		while(flag){
			System.out.println(Thread.currentThread().getName());
		}
	}
	
}

public class Demo02 {
	public static void main(String[] args) throws Exception {
		MyRunnable myRun1 = new MyRunnable();
		Thread t1 = new Thread(myRun1);
		t1.start();
		
		Thread.sleep(5000);
		
		myRun1.flag = false;
	}
}
