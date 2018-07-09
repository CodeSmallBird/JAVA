package cn.tedu.reflect;

import java.lang.reflect.Constructor;

/**
 * Class�� - ���췽����ز���
 */

public class Demo03 {
	public static void main(String[] args) throws Exception {
		Class<Person> clz = Person.class;
		//1.��ȡ���й��췽��
//		Constructor[] cs = clz.getConstructors();
//		//--����ÿһ�����췽��
//		for(Constructor c : cs){
//			//--��ȡ���췽���Ĳ�����������
//			Class[] paramCs = c.getParameterTypes();
//			//--���������������� �õ�ÿ����������
//			System.out.println("���췽���Ĳ��������ǣ�");
//			for(Class paramc : paramCs){
//				//--��ӡ����������
//				System.out.println(paramc.getName());
//			}
//		}
		//2.��ȡָ�����͵Ĺ��캯��
		Constructor<Person> c = clz.getConstructor(String.class,int.class);
		//3.���ù��캯������һ������
		Person p = c.newInstance("����",19);
		System.out.println(p.name);
		System.out.println(p.age);
		p.eat("���⴮");
	}
}
