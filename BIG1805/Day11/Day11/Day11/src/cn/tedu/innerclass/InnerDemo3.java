package cn.tedu.innerclass;

public class InnerDemo3 {
	
	public static void main(String[] args) {
		
		Outer3.Inner3 oi3 = new Outer3.Inner3();
		oi3.m();
		// ��ʾ�����ⲿ��Outer3���ڲ���Inner3�еľ�̬����m2
		Outer3.Inner3.m2();
		// out��һ����̬�����Ǿ�̬�ڲ���
		System.out.println();
	}

}

class Outer3 {

	static int k = 4;

	// ��̬�ڲ���
	// ���Զ����Ա���Ժͳ�Ա����
	// ���Զ��徲̬���Ժ;�̬����
	// ��̬�ڲ���ֻ��ʹ���ⲿ���еľ�̬���Ժ;�̬����
	static class Inner3 {

		int i = 9;
		static int j = 8;

		public void m() {
			System.out.println("Inner m");
			System.out.println(k);
		}

		public static void m2() {
			System.out.println("Inner m2");
		}

	}

}
