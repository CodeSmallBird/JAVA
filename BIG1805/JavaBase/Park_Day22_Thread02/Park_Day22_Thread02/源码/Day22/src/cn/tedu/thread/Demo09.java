package cn.tedu.thread;

/**
 * �������� - ����ͬ��Ƕ��
 */

public class Demo09 {
	public static ��ӡ�� dyj = new ��ӡ��();
	public static ɨ���� smy = new ɨ����();
	
	public static void main(String[] args) {
		//--Ա��1��
		new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized (dyj) {
					System.out.println("Ա��1��ȡ���˴�ӡ��������");
				}
				
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				synchronized (smy) {
					System.out.println("Ա��1��ȡ����ɨ���ǡ�����");
				}
				System.out.println("Ա��1������ʼ��������");
			}
		}).start();
		//--Ա��2��
		new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized (smy) {
					System.out.println("Ա��2��ȡ����ɨ���ǡ�����");
				}
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (dyj) {
					System.out.println("Ա��2��ȡ���˴�ӡ��������");
					System.out.println("Ա��2������ʼ��������");
				}
			}
		}).start();
	}
}
