package cn.tedu.extendsx.b;

import cn.tedu.extendsx.a.A;

public class C extends A {

	public static void main(String[] args) {

		// B b = new B();
		// protected���ε����Ժͷ��������ڱ����С������С�ͬ������ʹ��
		// m������A���ж���ģ�A����a���£����Ա�����A�࣬ͬ����a��
		// C��A�Ǳ�����---����
		// C��A��������---����
		// C��A��ͬ������---����
		// b.m();

		// ����m������ͨ��b����b��������Ӧ����������B�� 
		// ���ĸ��������������������ô������������õ�protected���εķ���ֻ���ڶ�Ӧ��������ʹ��
		// B b = new B();
		// b.m();
		
		C c = new C();
		c.m();
	}

}
