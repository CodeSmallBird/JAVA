package cn.tedu.thread;

/**
 * 死锁：多个线程各自占有各自的锁 然后要求获取对方的锁 从而进入互相等待的状态 称之为产生了死锁
 * 死锁产生的条件：
 * 	多个线程
 * 	过个共享资源
 * 	同步嵌套 - 同步嵌套就意味着 存在持有一个资源的锁 要求另一个资源的锁的情况存在
 */

class 打印机{}

class 扫描仪{}

public class Demo08 {
	public static 打印机 dyj = new 打印机();
	public static 扫描仪 smy = new 扫描仪();
	
	public static void main(String[] args) {
		//--员工1号
		new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized (dyj) {
					System.out.println("员工1获取到了打印机。。。");
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized (smy) {
						System.out.println("员工1获取到了扫描仪。。。");
						System.out.println("员工1。。开始工作。。");
					}
				}
			}
		}).start();
		//--员工2号
		new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized (smy) {
					System.out.println("员工2获取到了扫描仪。。。");
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized (dyj) {
						System.out.println("员工2获取到了打印机。。。");
						System.out.println("员工2。。开始工作。。");
					}
					
				}
			}
		}).start();
	}
}
