package cn.tedu.thread;
/**
 * 线程创建方式1： 
 * 	写一个类继承Thread 覆盖其中的run方法 在run方法中编写线程 要执行的代码
 * 	线程编写好后并不会立即执行 需要 创建出Thread对象后 调用start方法 才会真正的开启线程 执行
 */
class MyThread extends Thread{
	@Override
	public void run() {
		while(true){
			System.out.println("MyThread....");
		}
	}
}

public class Demo01 {
	public static void main(String[] args) {
		System.out.println("多线程开始测试....");
		
		MyThread myt = new MyThread();
		myt.start();//这行代码执行时 会开辟出进程中新的执行路径 即 一个新的线程 和 main线程并发 的执行
		while(true){
			System.out.println("main ....");
		}
		
	}
}
