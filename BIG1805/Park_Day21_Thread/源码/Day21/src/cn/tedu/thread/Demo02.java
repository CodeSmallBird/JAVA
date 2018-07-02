package cn.tedu.thread;

/**
 * 线程开启方式2：
 * 	写一个类实现Runnable接口 在其中覆盖run方法 编写线程执行的代码
 *  new Thread(Runnable) 将Runnable接口的实现类的对象传入作为参数 调用Thread的start()方法 启动线程
 *  
 *  **线程的stop方法已经被废弃 如果需要退出一个线程 可以通过控制代码执行条件，实现
 *  **如果一个进程中 所有的线程都退出 进程也就跟着结束
 */

class MyRunnable implements Runnable{
	public boolean flag = true;
	@Override
	public void run() {
		while(flag){
			System.out.println(Thread.currentThread().getName());
		}
	}
	
}

public class Demo02 {
	public static void main(String[] args) throws Exception {
		MyRunnable myRun1 = new MyRunnable();
		Thread t1 = new Thread(myRun1);
		t1.start();
		
		Thread.sleep(5000);
		
		myRun1.flag = false;
	}
}
