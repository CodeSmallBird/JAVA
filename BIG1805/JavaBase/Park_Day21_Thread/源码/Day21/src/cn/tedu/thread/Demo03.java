package cn.tedu.thread;

/**
 * 线程相关的方法
 * 
 	static Thread currentThread() 获取当前正在执行的线程
	long getId()  获取线程的编号，每个线程在执行的过程中，jvm都会为其分配独一无二的编号来唯一的进行表示，可以通过这个方法获取线程的id
	String getName()  获取线程的名称，每个线程在执行的过程中，jvm都会为其分配一个名称，这个名称可以通过getName来获取
	void setName(String name)  设置线程的名字
	Thread.State getState() 获取线程的状态
	void interrupt() 中断线程
	static void sleep(long millis) 让当前线程进入休眠状态，被挂起，放弃执行权，不再抢夺cpu，持续指定的时间
	**注意，Thread中虽然提供了stop方法，但是此方法已经被过时，不再有效,并且没有提供替代的方法，因为在线程执行的过程中强制退出，会具有固有的不安全性，可能造成很多意外的不符合预期的结果，所以Thread中现在没有一个明确的退出线程的方法，如果想要正常的退出线程，应该通过线程内代码的设计，来实现线程可以根据不同的状态，正常退出。或者当线程真的无法正常退出，需要强制退出时，可以选择interrupt方法中断执行。
 */

public class Demo03 {
	public static void main(String[] args) {
		//内部类方式创建线程
//		Thread t1 = new Thread(){
//			@Override
//			public void run() {
//				System.out.println("xxx");
//			}
//		};
//		t1.start();
//		
//		Thread t2 = new Thread(new Runnable(){
//			@Override
//			public void run() {
//				System.out.println("zzz");
//			}
//		});
//		t2.start();
		
		//Thrad.setName()
//		new Thread(new Runnable(){
//			@Override
//			public void run() {
//				long id = Thread.currentThread().getId();
//				String name = Thread.currentThread().getName();
//				System.out.println(id);
//				System.out.println(name);
//
//				Thread.currentThread().setName("一号线程");
//				name = Thread.currentThread().getName();
//				System.out.println(name);
//			}
//		}).start();
		
		//线程优先级
//		Thread t1 = new Thread(new Runnable() {
//			private int i = 0;
//			@Override
//			public void run() {
//				while(true){
//					System.out.println(Thread.currentThread().getName()+"~"+i++);
//				}
//			}
//		});
//	
//		Thread t2 = new Thread(new Runnable() {
//			private int i = 0;
//			@Override
//			public void run() {
//				while(true){
//					System.out.println(Thread.currentThread().getName()+"~"+i++);
//				}
//			}
//		});
//		
//		t1.setPriority(1);
//		t2.setPriority(10);
//		
//		t1.start();
//		t2.start();
	}
}
