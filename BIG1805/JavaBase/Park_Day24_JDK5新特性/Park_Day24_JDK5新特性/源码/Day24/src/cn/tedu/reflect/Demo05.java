package cn.tedu.reflect;

import java.lang.reflect.Field;

/**
 * Class�� - ������صĲ���
 */
public class Demo05 {
	public static void main(String[] args) throws Exception {
		//0.��ȡ�ֽ������
		Class<Person> clz = Person.class;
		//1.��ȡ��������
//		Field[] fields = clz.getFields();
//		for(Field field : fields){
//			System.out.println(field.getName());
//		}
		
		//2.��ȡָ��������
//		Field field = clz.getField("name");
//		//--��ȡ������
//		System.out.println(field.getName());
//		//--��ȡ��������
//		System.out.println(field.getType());
//		//--��ȡ���Ե�ֵ
//		Person p = new Person("����",19);
//		String name = (String) field.get(p);
//		System.out.println(name);
//		//--�������Ե�ֵ
//		field.set(p, "����");
//		System.out.println(p.name);
		
		//3.������̬����
//		Field field = clz.getField("addr");
//		System.out.println(field.get(null));
//		field.set(null, "�й�");
//		System.out.println(Person.addr);
		
	}
}
