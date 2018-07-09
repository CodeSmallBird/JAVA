package cn.tedu.thread;

/**
 * ����ͬ��������� �̰߳�ȫ����
 */

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
			//--��Ҫ������ ������Դ�Ĵ��� ����ͬ�����ƽ��и���
			synchronized (Demo05.class) {
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
}

class PrintThread implements Runnable{
	@Override
	public void run() {
		while(true){
			//--��Ҫ������ ������Դ�Ĵ��� ����ͬ�����ƽ��и���
			synchronized (Demo05.class) {
				System.out.print("������["+Demo05.name+"]..");
				System.out.print("�Ա�["+Demo05.gender+"]..");
				System.out.println();
			}
		}
	}
}