package cn.tedu.innerclass;

public class InnerDemo4 {

	public static void main(String[] args) {

		// �����ڲ���
		// �����ڲ��౾�����Ǽ̳��˶�Ӧ����
		// ��������ڲ��ඨ���ڷ����У���ôʹ�ù���ͷ����ڲ���һ��
		A a = new A() {

			@Override
			public void m() {
				System.out.println("m~~~");
				m2();
			}
			
			private void m2(){}
		};
		a.m();

		// B b = new B(){};

		// �����ڲ����൱��ʵ���˶�Ӧ�Ľӿ�
		// D d = new D(){};

	}

}

interface D {
}

abstract class A {

	public abstract void m();

}

final class B {
}

class C {

	// ��������ڲ��ඨ�������У��ͳ�Ա�ڲ����ʹ�ù���һ��
	C c = new C() {
	};

	class C2 extends C {
	}

	private C() {
	}

}
