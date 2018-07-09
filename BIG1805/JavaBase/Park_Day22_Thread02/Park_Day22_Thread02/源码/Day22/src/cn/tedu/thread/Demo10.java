package cn.tedu.thread;

/**
 * 通过共享内存方式 在线程间通信
 */
class Ma implements Runnable{

	@Override
	public void run() {
		System.out.println("慢悠悠的走到了比赛的起点。。。");
		while(!Demo10.canRun){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("跑出去。。。。");
	}
	
}

public class Demo10 {
	public static boolean canRun = false;
	public static void main(String[] args) throws Exception {
		new Thread(new Ma()).start();
		Thread.sleep(3000);
		canRun = true;
	}
}
