package cn.tedu.thread;

/**
 * join ����:�ڵ�ǰ�߳�ִ�еĹ����� ����cpu ��ִ��Ȩ�ø�ָ���߳� ֱ��ָ���߳�ִ����� �ٻ���ִ��Ȩ����ִ��
 */
public class Demo14 {
	public static void main(String[] args) throws Exception {
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		Thread t14 = new Thread(new Runnable14());
		t14.start();
		t14.join();
		System.out.println("4");
		System.out.println("5");
	}
}

class Runnable14 implements Runnable{
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
			System.out.println("����");
			Thread.sleep(1000);
			System.out.println("�Ǻ�");
			Thread.sleep(1000);
			System.out.println("����");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}
