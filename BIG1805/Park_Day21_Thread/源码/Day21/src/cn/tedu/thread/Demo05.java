package cn.tedu.thread;


public class Demo05 {
	public static String name = "����";
	public static String gender = "��";
	
	public static void main(String[] args) {
		new Thread(new ChangeThread()).start();
		new Thread(new PrintThread()).start();
	}
}

class ChangeThread implements Runnable{
	@Override
	public void run() {
		while(true){
			if("����".equals(Demo05.name)){
				Demo05.name = "��÷÷";
				Demo05.gender = "Ů";
			}else{
				Demo05.name = "����";
				Demo05.gender = "��";
			}
		}
	}
}

class PrintThread implements Runnable{
	@Override
	public void run() {
		while(true){
			System.out.print("������["+Demo05.name+"]..");
			System.out.print("�Ա�["+Demo05.gender+"]..");
			System.out.println();
		}
	}
}