package cn.tedu.thread;

/**
 * 利用同步代码块解决 线程安全问题
 */

public class Demo05 {
	public static String name = "李雷";
	public static String gender = "男";
	
	public static void main(String[] args) {
		new Thread(new ChangeThread()).start();
		new Thread(new PrintThread()).start();
	}
}

class ChangeThread implements Runnable{
	@Override
	public void run() {
		while(true){
			//--需要将操作 共享资源的代码 利用同步机制进行隔离
			synchronized (Demo05.class) {
				if("李雷".equals(Demo05.name)){
					Demo05.name = "韩梅梅";
					Demo05.gender = "女";
				}else{
					Demo05.name = "李雷";
					Demo05.gender = "男";
				}
			}
		}
	}
}

class PrintThread implements Runnable{
	@Override
	public void run() {
		while(true){
			//--需要将操作 共享资源的代码 利用同步机制进行隔离
			synchronized (Demo05.class) {
				System.out.print("姓名：["+Demo05.name+"]..");
				System.out.print("性别：["+Demo05.gender+"]..");
				System.out.println();
			}
		}
	}
}