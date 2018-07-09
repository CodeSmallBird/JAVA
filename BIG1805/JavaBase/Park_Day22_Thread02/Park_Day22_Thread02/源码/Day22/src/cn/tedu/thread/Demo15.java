package cn.tedu.thread;

/**
 * �ػ��߳�
 * ������������ҫ
 * @author Administrator
 */
public class Demo15 {
	public static void main(String[] args) throws Exception {
		Shuijing shuijing = new Shuijing();
		Thread t0 = new Thread(shuijing);
		Thread tx = new Thread(new diren(shuijing));
		Thread t1 = new Thread(new Player("������"));
		Thread t2 = new Thread(new Player("��ɪ"));
		Thread t3 = new Thread(new Player("����"));
		Thread t4 = new Thread(new Player("����"));
		Thread t5 = new Thread(new Player("����"));
	
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
			System.out.println(name+":Ϊ��ˮ�������尡������");
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
				System.out.println("�һ���"+xue+"Ѫ����ʿ�ǿ��������ҡ�����");
			}else{
				System.err.println("ˮ�������ˣ���Ϸ��������");
				break;
			}
		}
	}
}
