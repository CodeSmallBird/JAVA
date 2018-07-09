package cn.tedu.reflect;

/**
 * ���䣺��ȡ���Class
 */
public class Demo01 {
	public static void main(String[] args) throws Exception {
		//1.��ȡClass��ʽ1 ��ͨ����.class,����Ҫ���� ֱ��ͨ���������� ��ȡ�����class����
		Class clz1 = Person.class;
		//2.ͨ�����ö���.getClass()��������Ҫͨ����������ȡ �ھ��ж���ʱ �����ķ���
		Person p = new Person();
		Class clz2 = p.getClass();
		//3.ͨ��Class�ṩ�ľ�̬����getClass����ȡ����ֽ���
		//--ע�⣬��Ҫ�������ȫ·�����ƣ������а���������
		//--���ַ�ʽ������ ��������֮ǰû�м��ع�����࣬���ᵼ������ֽ��뱻���ص��ڴ��У��ٵõ������Class����
		//				��������֮ǰ�Ѿ����ع�����࣬����ֱ�ӽ��ڴ��и�����ֽ����Class���󷵻�
		//				�����������Ҳ����򵥵ļ�������ֽ��뵽�ڴ�ķ���
		Class clz3 = Class.forName("cn.tedu.reflect.Person");
		
		//����һ������ֽ������ڴ���ֻ��һ�ݣ�
		//����������л���һ��Class�����������ֽ��룬
		//������һ�������У�����ͬһ�����ȡ���Class�õ��Ľ���ͬһ������
		System.out.println(clz1 == clz2);
		System.out.println(clz1 == clz3);
	}
}
