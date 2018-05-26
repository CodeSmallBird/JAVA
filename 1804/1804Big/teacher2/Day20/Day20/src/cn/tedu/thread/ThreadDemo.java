package cn.tedu.thread;

public class ThreadDemo {

	public static void main(String[] args) {

		TDemo t = new TDemo();
		// 启动线程
		t.start();
		// t.run();

		for (int i = 0; i < 10; i++) {
			System.out.println("main:" + i);
		}
	}

}

class TDemo extends Thread {

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println("Thread:" + i);
		}
	}

}
