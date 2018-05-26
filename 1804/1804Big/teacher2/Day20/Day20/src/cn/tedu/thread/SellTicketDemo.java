package cn.tedu.thread;

import java.io.FileInputStream;
import java.util.Properties;

public class SellTicketDemo {

	public static void main(String[] args) throws Exception {

		Ticket t = new Ticket();

		Properties p = new Properties();
		p.load(new FileInputStream("ticket.properties"));

		// 获取到票数
		String count = p.getProperty("count");

		t.setCount(Integer.parseInt(count));

		// Seller s1 = new Seller(t);
		// new Thread(s1).start();
		// Seller s2 = new Seller(t);
		// new Thread(s2).start();
		// Seller s3 = new Seller(t);
		// new Thread(s3).start();
		// Seller s4 = new Seller(t);
		// new Thread(s4).start();

		// 利用一个Runnable对象来创建多个线程
		Seller s = new Seller(t);
		new Thread(s).start();
		new Thread(s).start();
		new Thread(s).start();
		new Thread(s).start();

	}

}

class Seller implements Runnable {

	private Ticket t;

	public Seller(Ticket t) {
		this.t = t;
	}

	@Override
	// 同步方法---锁对象是this
	public synchronized void run() {

		while (true) {
			// 同步代码块
			// synchronized (t) {
			// 方法区是被所有线程所共享的
			// synchronized (Seller.class) {
			// synchronized (Math.class) {
			// synchronized (this) {
			if (t.getCount() <= 0)
				return;
			try {
				// 表示让当前的线程休息10毫秒
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			t.setCount(t.getCount() - 1);

			System.out.println(Thread.currentThread().getName() + "卖了一张票，剩余" + t.getCount());
			// }

		}

	}

}

class Ticket {

	private int count;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}