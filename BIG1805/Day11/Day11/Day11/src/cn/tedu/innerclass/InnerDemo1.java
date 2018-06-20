package cn.tedu.innerclass;

public class InnerDemo1 {

	public static void main(String[] args) {

		Outer1 o1 = new Outer1();
		o1.m();

	}

}

class Outer1 {

	int oi = 10;

	public void m() {

		System.out.println("Outer m");

		final int m = 3;
		// �����ڷ����е���---�����ڲ���/�ֲ��ڲ���
		// ֻ���ڶ������ķ�����ʹ��
		// �����ڲ����в��ܶ��徲̬�����;�̬���������Զ��徲̬����
		// �����ڲ������ʹ���ⲿ���һ�����Ժͷ���
		// �����ڲ��಻��ʹ�õ�ǰ�����еľֲ�����,���ǿ���ʹ�õ�ǰ�����еľֲ�����
		// ���Լ̳б�������ʵ�ֱ�Ľӿ�
		// ����ʹ��final������abstract������
		class Inner1 {

			int i = 5;
			static final int j = 7;

			public void m() {
				System.out.println("Inner m");
				System.out.println(j);
				System.out.println(oi);
				System.out.println(m);
				m2();
				// ����ڲ�����ⲿ���д��ڷ���ǩ��һ�µķ���,�ⲿ��.this.�������������ⲿ���ж�Ӧ�ķ���
				Outer1.this.m2();
			}
			
			public void m2(){
				System.out.println("Inner m2");
			}

		}

		Inner1 i1 = new Inner1();
		i1.m();
		System.out.println(i1.i);
	}

	public void m2() {
		System.out.println("Outer m2");
		// Inner1 i1 = new Inner1();
		// i1.m();
	}

}
