package cn.tedu.thread;

public class PriorityDemo {

	public static void main(String[] args) {

		Thread t1 = new Thread(new PDemo(), "A");
		Thread t2 = new Thread(new PDemo(), "B");

		t1.setPriority(1);
		t2.setPriority(10);

		t1.start();
		t2.start();

		// 获取线程的优先级
		// System.out.println(t1.getPriority());

	}

}

class PDemo implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 9; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}

}