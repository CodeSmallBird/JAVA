package cn.tedu.thread;

/**
 * ͨ�������ڴ淽ʽ ���̼߳�ͨ��
 */
class Ma implements Runnable{

	@Override
	public void run() {
		System.out.println("�����Ƶ��ߵ��˱�������㡣����");
		while(!Demo10.canRun){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("�ܳ�ȥ��������");
	}
	
}

public class Demo10 {
	public static boolean canRun = false;
	public static void main(String[] args) throws Exception {
		new Thread(new Ma()).start();
		Thread.sleep(3000);
		canRun = true;
	}
}
