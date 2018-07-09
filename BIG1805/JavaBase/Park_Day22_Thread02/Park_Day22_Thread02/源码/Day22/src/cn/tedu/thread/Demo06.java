package cn.tedu.thread;

/**
 * 同步方法：
 * 	如果某一个方法整体都需要进行同步 则可以在方法声明时 在返回值前 加上 synchronized 关键字 
 *  则该方法 成为 一个同步方法 所有线程进入之前都要先获取锁才可以进入 从而实现了线程的同步
 *	同步方法锁对象没有办法手动指定	
 *	非静态 同步方法 默认采用的锁对象是 this
 *	静态 同步方法 默认采用的锁对象是 当前类的字节码 类.class
 */

public class Demo06 {
	public static void main(String[] args) {
		Bank bank = new Bank();
		new Thread(new PersonRunnable(bank)).start();
		new Thread(new PersonRunnable(bank)).start();
	}
}

class PersonRunnable implements Runnable{
	private Bank bank = null;
	public PersonRunnable(Bank bank) {
		this.bank = bank;
	}
	
	@Override
	public void run() {
		for(int i = 0;i<3;i++){
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			bank.save(100);
		}
	}
	
}

class Bank{

	public static int money = 0;
	
	public synchronized void save(int m){
		money = money + m;
		System.out.println("存款余额"+money);
	}

}
