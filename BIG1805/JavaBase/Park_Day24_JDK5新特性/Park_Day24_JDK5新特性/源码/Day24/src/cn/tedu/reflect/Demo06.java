package cn.tedu.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Class类 - 访问 私有 保护 默认 成员
 */
public class Demo06 {
	public static void main(String[] args) throws Exception {
		//0.获取Class
		Class<Person> clz = Person.class;
	
		//1.获取私有 保护 默认访问权限的 构造函数
//		Constructor<?>[] constructors = clz.getDeclaredConstructors();
//		System.out.println(constructors.length);
		//--强行访问无访问权限的成员
//		Constructor<Person> cons = clz.getDeclaredConstructor(String.class);
//		cons.setAccessible(true);
//		Person p = cons.newInstance("田七");
//		System.out.println(p.name);
	
		//2.获取私有 保护 默认访问权限的 方法
//		Method[] methods = clz.getDeclaredMethods();
//		for(Method m : methods){
//			System.out.println(m.getName());
//		}
		//--强行访问无访问权限的成员
//		Method m = clz.getDeclaredMethod("say");
//		m.setAccessible(true);
//		Person p = new Person("张三丰",28);
//		m.invoke(p);
	
		//2.获取私有 保护 默认访问权限的 属性
//		Field[] fields = clz.getDeclaredFields();
//		for(Field field : fields){
//			System.out.println(field.getName());
//		}
		//--强行访问无访问权限的成员
		Field field = clz.getDeclaredField("gender");
		field.setAccessible(true);
		Person p = new Person("张翠山",22);
		System.out.println(field.get(p));
		
	}
}
