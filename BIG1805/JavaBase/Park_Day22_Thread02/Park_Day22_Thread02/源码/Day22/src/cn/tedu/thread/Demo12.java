package cn.tedu.thread;

/**
 * ͨ���ȴ����ѻ��� ʵ���޸Ĵ�ӡ����ִ��
 */
public class Demo12 {
	public static String name = "����";
	public static String gender = "��";
	
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
				if ("����".equals(Demo12.name)) {
					Demo12.name = "��÷÷";
					Demo12.gender = "Ů";
				} else {
					Demo12.name = "����";
					Demo12.gender = "��";
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