package cn.tedu.thread;

/**
 * ͬ��������
 * 	���ĳһ���������嶼��Ҫ����ͬ�� ������ڷ�������ʱ �ڷ���ֵǰ ���� synchronized �ؼ��� 
 *  ��÷��� ��Ϊ һ��ͬ������ �����߳̽���֮ǰ��Ҫ�Ȼ�ȡ���ſ��Խ��� �Ӷ�ʵ�����̵߳�ͬ��
 *	ͬ������������û�а취�ֶ�ָ��	
 *	�Ǿ�̬ ͬ������ Ĭ�ϲ��õ��������� this
 *	��̬ ͬ������ Ĭ�ϲ��õ��������� ��ǰ����ֽ��� ��.class
 */

public class Demo06 {
	public static void main(String[] args) {
		Bank bank = new Bank();
		new Thread(new PersonRunnable(bank)).start();
		new Thread(new PersonRunnable(bank)).start();
	}
}

class PersonRunnable implements Runnable{
	private Bank bank = null;
	public PersonRunnable(Bank bank) {
		this.bank = bank;
	}
	
	@Override
	public void run() {
		for(int i = 0;i<3;i++){
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			bank.save(100);
		}
	}
	
}

class Bank{

	public static int money = 0;
	
	public synchronized void save(int m){
		money = money + m;
		System.out.println("������"+money);
	}

}
