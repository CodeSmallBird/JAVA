package cn.tedu.thread;
/**
 * �̴߳�����ʽ1�� 
 * 	дһ����̳�Thread �������е�run���� ��run�����б�д�߳� Ҫִ�еĴ���
 * 	�̱߳�д�ú󲢲�������ִ�� ��Ҫ ������Thread����� ����start���� �Ż������Ŀ����߳� ִ��
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
		System.out.println("���߳̿�ʼ����....");
		
		MyThread myt = new MyThread();
		myt.start();//���д���ִ��ʱ �Ὺ�ٳ��������µ�ִ��·�� �� һ���µ��߳� �� main�̲߳��� ��ִ��
		while(true){
			System.out.println("main ....");
		}
		
	}
}
