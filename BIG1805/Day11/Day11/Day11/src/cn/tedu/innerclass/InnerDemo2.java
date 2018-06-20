package cn.tedu.innerclass;

public class InnerDemo2 {

	public static void main(String[] args) {

		// Outer2 o2 = new Outer2();
		// System.out.println(o2.i);

		// �����ⴴ���ڲ��������Ҫʹ���ⲿ�����������
		// Outer2.Inner2 oi2 = o2.new Inner2();
		Outer2.Inner2 oi2 = new Outer2().new Inner2();
		oi2.m();
	}

}

class Outer2 {

	int i = 5;

	// ���������ڵ���---��Ա�ڲ���
	// ��Ա�ڲ����п��Զ���Ǿ�̬���ԺͷǾ�̬����
	// ���ܶ��徲̬�����;�̬���������ǿ��Զ��徲̬����
	// ����ʹ���ⲿ���е����Ժͷ���
	// ���Լ̳б���������ʵ�ֱ�Ľӿ�
	class Inner2 {

		int i = 8;
		static final int j = 9;

		public void m() {
			System.out.println("Inner m");
			System.out.println(Outer2.this.i);
		}

	}

	Inner2 i2 = new Inner2();

}