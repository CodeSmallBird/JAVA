package cn.tedu.innerclass;

public class InnerDemo5 implements Outer5.Inner5 {

}

class Outer5 {

	// �ڲ��ӿ�Ĭ����static��
	static interface Inner5 {
	}

}

// Outer6.Inner6 oi6 = new Outer6.Inner6();
interface Outer6 {

	// �ӿ��ж�����ڲ���Ĭ����static��
	class Inner6 {
	}

	// �ӿ��ж�����ڲ��ӿ�Ĭ����static��
	interface Inner7 {
	}

}