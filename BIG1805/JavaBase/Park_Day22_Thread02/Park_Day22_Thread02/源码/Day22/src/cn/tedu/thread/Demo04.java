package cn.tedu.thread;

/**
 * ����ͬ��������� �̰߳�ȫ����
 */
class SaleTicketThread implements Runnable{
	@Override
	public void run() {
		//--��Ҫ������ ������Դ�Ĵ��� ����ͬ�����ƽ��и���
		synchronized (Demo04.class) {
			while (Demo04.ticketCount > 0) {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				Demo04.ticketCount--;
				System.out.println(Thread.currentThread().getName() + "��������ȥһ��Ʊ����ʣ����" + Demo04.ticketCount + "��Ʊ����");
			}
		}
	}
}

public class Demo04 {
	public static int ticketCount = 1;
	
	public static void main(String[] args) {
		new Thread(new SaleTicketThread()).start();
		new Thread(new SaleTicketThread()).start();
	}
	
}
