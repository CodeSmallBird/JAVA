package cn.tedu.thread;

/**
 * 通过等待唤醒机制 实现修改打印依次执行
 */
public class Demo12 {
	public static String name = "李雷";
	public static String gender = "男";
	
	public static void main(String[] args) {
		new Thread(new changeThread12()).start();
		new Thread(new printThread12()).start();
	}
	
}

class printThread12 implements Runnable{
	@Override
	public void run() {
		while(true){
			synchronized (Demo12.class) {
				System.out.println(Demo12.name + "~" + Demo12.gender);
				Demo12.class.notify();
				try {
					Demo12.class.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
class changeThread12 implements Runnable{
	@Override
	public void run() {
		while(true){
			synchronized (Demo12.class) {
				if ("李雷".equals(Demo12.name)) {
					Demo12.name = "韩梅梅";
					Demo12.gender = "女";
				} else {
					Demo12.name = "李雷";
					Demo12.gender = "男";
				}
				Demo12.class.notify();
				try {
					Demo12.class.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}