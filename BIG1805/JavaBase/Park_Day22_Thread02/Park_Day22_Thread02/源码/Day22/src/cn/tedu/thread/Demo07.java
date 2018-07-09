package cn.tedu.thread;

/**
 * ͬ��������
 * 	���ĳһ���������嶼��Ҫ����ͬ�� ������ڷ�������ʱ �ڷ���ֵǰ ���� synchronized �ؼ��� 
 *  ��÷��� ��Ϊ һ��ͬ������ �����߳̽���֮ǰ��Ҫ�Ȼ�ȡ���ſ��Խ��� �Ӷ�ʵ�����̵߳�ͬ��
 *	ͬ������������û�а취�ֶ�ָ��	
 *	�Ǿ�̬ ͬ������ Ĭ�ϲ��õ��������� this
 *	��̬ ͬ������ Ĭ�ϲ��õ��������� ��ǰ����ֽ��� ��.class
 */

public class Demo07 {
	public static void main(String[] args) {
		new Thread(new PersonRunnable2()).start();
		new Thread(new PersonRunnable2()).start();
	}
}

class PersonRunnable2 implements Runnable{
	@Override
	public void run() {
		for(int i = 0;i<3;i++){
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Bank2.save(100);
		}
	}
	
}

class Bank2{

	public static int money = 0;
	
	public synchronized static void save(int m){
		money = money + m;
		System.out.println("������"+money);
	}

}
