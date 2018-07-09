package cn.tedu.thread;

/**
 * join 操作:在当前线程执行的过程中 放弃cpu 将执行权让给指定线程 直到指定线程执行完成 再还回执行权继续执行
 */
public class Demo14 {
	public static void main(String[] args) throws Exception {
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		Thread t14 = new Thread(new Runnable14());
		t14.start();
		t14.join();
		System.out.println("4");
		System.out.println("5");
	}
}

class Runnable14 implements Runnable{
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
			System.out.println("哈哈");
			Thread.sleep(1000);
			System.out.println("呵呵");
			Thread.sleep(1000);
			System.out.println("嘻嘻");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}
