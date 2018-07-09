package cn.tedu.reflect;

import java.lang.reflect.Method;

/**
 * Class类 - 方法相关的操作
 */
public class Demo04 {
	public static void main(String[] args) throws Exception {
		//0.得到Class对象
		Class<Person> clz = Person.class;
		
		//1.获取类上所有的方法
//		Method[] ms = clz.getMethods();
//		for(Method m : ms){
//			System.out.println(m.getName());
//		}
		
		//2.获取指定方法
		//Method m = clz.getMethod("eat", String.class);
		
		//3.获取m相关的信息
//		Class<?>[] parameterTypes = m.getParameterTypes();
//		for(Class pt : parameterTypes){
//			System.out.println(pt.getName());
//		}
//		Class<?> returnType = m.getReturnType();
//		System.out.println(returnType.getName());
		
		//4.在指定对象上调用m方法
//		Person p = new Person("李四",22);
//		m.invoke(p, "涮羊肉");

		//5.获取静态方法
		Method m = clz.getMethod("sleep");
		m.invoke(null);
	}
}
