package cn.tedu.reflect;

import java.lang.reflect.Constructor;

/**
 * Class类 - 构造方法相关操作
 */

public class Demo03 {
	public static void main(String[] args) throws Exception {
		Class<Person> clz = Person.class;
		//1.获取所有构造方法
//		Constructor[] cs = clz.getConstructors();
//		//--遍历每一个构造方法
//		for(Constructor c : cs){
//			//--获取构造方法的参数类型数组
//			Class[] paramCs = c.getParameterTypes();
//			//--遍历参数类型数组 得到每个参数类型
//			System.out.println("构造方法的参数类型是：");
//			for(Class paramc : paramCs){
//				//--打印参数的类型
//				System.out.println(paramc.getName());
//			}
//		}
		//2.获取指定类型的构造函数
		Constructor<Person> c = clz.getConstructor(String.class,int.class);
		//3.利用构造函数创建一个对象
		Person p = c.newInstance("张三",19);
		System.out.println(p.name);
		System.out.println(p.age);
		p.eat("羊肉串");
	}
}
