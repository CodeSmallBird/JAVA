package cn.tedu.reflect;

import java.lang.reflect.Method;

/**
 * Class�� - ������صĲ���
 */
public class Demo04 {
	public static void main(String[] args) throws Exception {
		//0.�õ�Class����
		Class<Person> clz = Person.class;
		
		//1.��ȡ�������еķ���
//		Method[] ms = clz.getMethods();
//		for(Method m : ms){
//			System.out.println(m.getName());
//		}
		
		//2.��ȡָ������
		//Method m = clz.getMethod("eat", String.class);
		
		//3.��ȡm��ص���Ϣ
//		Class<?>[] parameterTypes = m.getParameterTypes();
//		for(Class pt : parameterTypes){
//			System.out.println(pt.getName());
//		}
//		Class<?> returnType = m.getReturnType();
//		System.out.println(returnType.getName());
		
		//4.��ָ�������ϵ���m����
//		Person p = new Person("����",22);
//		m.invoke(p, "������");

		//5.��ȡ��̬����
		Method m = clz.getMethod("sleep");
		m.invoke(null);
	}
}
