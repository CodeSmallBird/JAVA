package cn.tedu.thread;

/**
 * 守护线程
 * 案例：王者荣耀
 * @author Administrator
 */
public class Demo15 {
	public static void main(String[] args) throws Exception {
		Shuijing shuijing = new Shuijing();
		Thread t0 = new Thread(shuijing);
		Thread tx = new Thread(new diren(shuijing));
		Thread t1 = new Thread(new Player("安琪拉"));
		Thread t2 = new Thread(new Player("亚瑟"));
		Thread t3 = new Thread(new Player("后羿"));
		Thread t4 = new Thread(new Player("阿克"));
		Thread t5 = new Thread(new Player("梦琪"));
	
		t0.start();
		
		tx.setDaemon(true);
		t1.setDaemon(true);
		t2.setDaemon(true);
		t3.setDaemon(true);
		t4.setDaemon(true);
		t5.setDaemon(true);
		
		tx.start();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		
	}
}

class diren implements Runnable{
	private Shuijing shuijing  = null;
	public diren(Shuijing shuijing) {
		this.shuijing = shuijing;
	}
	
	@Override
	public void run() {
		while(true){
			try {
				Thread.sleep(1000);
				shuijing.gongji();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class Player implements Runnable{

	private String name = null;
	
	public Player(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		while(true){
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name+":为了水晶。。冲啊。。。");
		}
	}
	
} 

class Shuijing implements Runnable{
	private int xue = 100;
	
	public void gongji(){
		xue-=8;
	}
	
	@Override
	public void run() {
		while(true){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(xue>0){
				System.out.println("我还有"+xue+"血，勇士们快来保护我。。。");
			}else{
				System.err.println("水晶被打爆了，游戏结束！！");
				break;
			}
		}
	}
}
