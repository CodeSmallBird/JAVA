package cn.tedu.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Class�� - ���� ˽�� ���� Ĭ�� ��Ա
 */
public class Demo06 {
	public static void main(String[] args) throws Exception {
		//0.��ȡClass
		Class<Person> clz = Person.class;
	
		//1.��ȡ˽�� ���� Ĭ�Ϸ���Ȩ�޵� ���캯��
//		Constructor<?>[] constructors = clz.getDeclaredConstructors();
//		System.out.println(constructors.length);
		//--ǿ�з����޷���Ȩ�޵ĳ�Ա
//		Constructor<Person> cons = clz.getDeclaredConstructor(String.class);
//		cons.setAccessible(true);
//		Person p = cons.newInstance("����");
//		System.out.println(p.name);
	
		//2.��ȡ˽�� ���� Ĭ�Ϸ���Ȩ�޵� ����
//		Method[] methods = clz.getDeclaredMethods();
//		for(Method m : methods){
//			System.out.println(m.getName());
//		}
		//--ǿ�з����޷���Ȩ�޵ĳ�Ա
//		Method m = clz.getDeclaredMethod("say");
//		m.setAccessible(true);
//		Person p = new Person("������",28);
//		m.invoke(p);
	
		//2.��ȡ˽�� ���� Ĭ�Ϸ���Ȩ�޵� ����
//		Field[] fields = clz.getDeclaredFields();
//		for(Field field : fields){
//			System.out.println(field.getName());
//		}
		//--ǿ�з����޷���Ȩ�޵ĳ�Ա
		Field field = clz.getDeclaredField("gender");
		field.setAccessible(true);
		Person p = new Person("�Ŵ�ɽ",22);
		System.out.println(field.get(p));
		
	}
}
