package cn.tedu.thread;

public class DeadLockDemo {

	static Printer p = new Printer();
	static Scanner s = new Scanner();

	public static void main(String[] args) {

		new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized (s) {
					s.scan();
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized (p) {
						p.print();
					}
				}
			}
		}).start();

		new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized (p) {
					p.print();
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized (s) {
						s.scan();
					}
				}
			}
		}).start();

	}

}

class Scanner {

	public void scan() {
		System.out.println("扫描仪在扫描中~~~");
	}

}

class Printer {

	public void print() {
		System.out.println("打印机在打印中~~~");
	}

}
