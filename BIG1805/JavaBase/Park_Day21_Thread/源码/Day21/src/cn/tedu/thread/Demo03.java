package cn.tedu.thread;

/**
 * �߳���صķ���
 * 
 	static Thread currentThread() ��ȡ��ǰ����ִ�е��߳�
	long getId()  ��ȡ�̵߳ı�ţ�ÿ���߳���ִ�еĹ����У�jvm����Ϊ������һ�޶��ı����Ψһ�Ľ��б�ʾ������ͨ�����������ȡ�̵߳�id
	String getName()  ��ȡ�̵߳����ƣ�ÿ���߳���ִ�еĹ����У�jvm����Ϊ�����һ�����ƣ�������ƿ���ͨ��getName����ȡ
	void setName(String name)  �����̵߳�����
	Thread.State getState() ��ȡ�̵߳�״̬
	void interrupt() �ж��߳�
	static void sleep(long millis) �õ�ǰ�߳̽�������״̬�������𣬷���ִ��Ȩ����������cpu������ָ����ʱ��
	**ע�⣬Thread����Ȼ�ṩ��stop���������Ǵ˷����Ѿ�����ʱ��������Ч,����û���ṩ����ķ�������Ϊ���߳�ִ�еĹ�����ǿ���˳�������й��еĲ���ȫ�ԣ�������ɺܶ�����Ĳ�����Ԥ�ڵĽ��������Thread������û��һ����ȷ���˳��̵߳ķ����������Ҫ�������˳��̣߳�Ӧ��ͨ���߳��ڴ������ƣ���ʵ���߳̿��Ը��ݲ�ͬ��״̬�������˳������ߵ��߳�����޷������˳�����Ҫǿ���˳�ʱ������ѡ��interrupt�����ж�ִ�С�
 */

public class Demo03 {
	public static void main(String[] args) {
		//�ڲ��෽ʽ�����߳�
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
//				Thread.currentThread().setName("һ���߳�");
//				name = Thread.currentThread().getName();
//				System.out.println(name);
//			}
//		}).start();
		
		//�߳����ȼ�
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
