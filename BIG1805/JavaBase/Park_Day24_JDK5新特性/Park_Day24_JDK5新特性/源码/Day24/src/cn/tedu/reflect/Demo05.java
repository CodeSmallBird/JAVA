package cn.tedu.reflect;

import java.lang.reflect.Field;

/**
 * Class类 - 属性相关的操作
 */
public class Demo05 {
	public static void main(String[] args) throws Exception {
		//0.获取字节码对象
		Class<Person> clz = Person.class;
		//1.获取所有属性
//		Field[] fields = clz.getFields();
//		for(Field field : fields){
//			System.out.println(field.getName());
//		}
		
		//2.获取指定的属性
//		Field field = clz.getField("name");
//		//--获取属性名
//		System.out.println(field.getName());
//		//--获取属性类型
//		System.out.println(field.getType());
//		//--获取属性的值
//		Person p = new Person("王五",19);
//		String name = (String) field.get(p);
//		System.out.println(name);
//		//--设置属性的值
//		field.set(p, "赵六");
//		System.out.println(p.name);
		
		//3.操作静态属性
//		Field field = clz.getField("addr");
//		System.out.println(field.get(null));
//		field.set(null, "中国");
//		System.out.println(Person.addr);
		
	}
}
