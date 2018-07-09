package cn.tedu.thread;

/**
 * 避免死锁 - 避免同步嵌套
 */

public class Demo09 {
	public static 打印机 dyj = new 打印机();
	public static 扫描仪 smy = new 扫描仪();
	
	public static void main(String[] args) {
		//--员工1号
		new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized (dyj) {
					System.out.println("员工1获取到了打印机。。。");
				}
				
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				synchronized (smy) {
					System.out.println("员工1获取到了扫描仪。。。");
				}
				System.out.println("员工1。。开始工作。。");
			}
		}).start();
		//--员工2号
		new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized (smy) {
					System.out.println("员工2获取到了扫描仪。。。");
				}
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
		}).start();
	}
}
