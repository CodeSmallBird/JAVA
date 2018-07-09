package cn.tedu.reflect;

/**
 * 类上的通用方法
 */
public class Demo02 {
	public static void main(String[] args) throws Exception {
		Class<Person> clz = Person.class;
		//1.类型强转
//		Ani ani = new Person();
//		Person p1 = (Person)ani;
//		Person p2 = clz.cast(ani);
		
		//2.获取类实现的所有接口
//		Class<?>[] intfs = clz.getInterfaces();
//		for(Class intf : intfs){
//			System.out.println(intf.getName());
//		}
		
		//3.获取类名
//		System.out.println(clz.getName());
//		System.out.println(clz.getSimpleName());
	
		//4.获取包信息
//		Package pg = clz.getPackage();
//		System.out.println(pg.getName());
	
		//5.获取超类
//		Class supClz = clz.getSuperclass();
//		System.out.println(supClz.getName());
	
		//6.判断Class的类型
//		System.out.println(clz.isInterface());
		
		//7.创建对象 -- 这个方法将会调用类底层的无参构造函数 创建对象 所以要求Class代表的类中 必须有无参构造函数才可以使用
//		Person p = clz.newInstance();
//		p.say();
		
	}
}
