package cn.tedu.thread;

public class DaemonDemo {
	
	public static void main(String[] args) throws InterruptedException {

		// 创建了四个小怪
		Thread t1 = new Thread(new Monster(), "小怪1号");
		Thread t2 = new Thread(new Monster(), "小怪2号");
		Thread t3 = new Thread(new Monster(), "小怪3号");
		Thread t4 = new Thread(new Monster(), "小怪4号");

		// 设置守护线程
		t1.setDaemon(true);
		t2.setDaemon(true);
		t3.setDaemon(true);
		t4.setDaemon(true);

		// 开启四个守护线程
		t1.start();
		t2.start();
		t3.start();
		t4.start();

		for (int i = 10; i > 0; i--) {
			System.out.println("Boss掉了一滴血，剩余" + i);
			Thread.sleep(100);
		}
	}

}

class Monster implements Runnable {

	@Override
	public void run() {

		for (int i = 10; i > 0; i--) {

			System.out.println(Thread.currentThread().getName() + "掉了一滴血，剩余" + i);

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}