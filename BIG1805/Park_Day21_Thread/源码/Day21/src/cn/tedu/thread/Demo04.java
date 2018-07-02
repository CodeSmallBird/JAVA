package cn.tedu.thread;

class SaleTicketThread implements Runnable{
	@Override
	public void run() {
		while(Demo04.ticketCount>0){
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Demo04.ticketCount--;
			System.out.println(Thread.currentThread().getName()+"窗口卖出去一张票。。剩余了"+Demo04.ticketCount+"张票。。");
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
