package cn.tedu.inner;

public class InnerDemo2 {

	// ���һ�������ڲ��ඨ�������У���ô��������ĳ�Ա�ڲ���
	A a = new A() {

		@Override
		public void m() {

		}
	};

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// �����ڲ���---�����Ͼ��Ǽ̳��˶�Ӧ����
		// ���һ�������ڲ��ඨ���ڷ����У���ô��������ķ����ڲ���
		A a = new A() {

			@Override
			public void m() {
				System.out.println("a m~~~");
			}
		};

		new B() {
		};

		// Ҳ��ʵ���˶�Ӧ�Ľӿ�
		D d = new D() {

			@Override
			public void m() {

			}
		};

	}

}

interface D {

	void m();

	static class Inner2 {
	}

	static interface Inner3 {
	}
}

final class C implements B.Inner4 {
}

class B {

	static interface Inner4 {
	}

}

abstract class A {

	public abstract void m();

}