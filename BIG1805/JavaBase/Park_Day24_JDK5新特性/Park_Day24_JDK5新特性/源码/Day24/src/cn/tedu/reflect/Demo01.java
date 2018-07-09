package cn.tedu.reflect;

/**
 * 反射：获取类的Class
 */
public class Demo01 {
	public static void main(String[] args) throws Exception {
		//1.获取Class方式1 ，通过类.class,不需要对象 直接通过类名即可 获取改类的class对象
		Class clz1 = Person.class;
		//2.通过调用对象.getClass()方法，需要通过对象来获取 在具有对象时 是最方便的方案
		Person p = new Person();
		Class clz2 = p.getClass();
		//3.通过Class提供的静态方法getClass来获取类的字节码
		//--注意，需要传入类的全路径名称，即带有包名的类名
		//--这种方式加载类 如果虚拟机之前没有加载过这个类，将会导致类的字节码被加载到内存中，再得到该类的Class返回
		//				如果虚拟机之前已经加载过这个类，将会直接将内存中该类的字节码的Class对象返回
		//				所以这个方法也是最简单的加载类的字节码到内存的方法
		Class clz3 = Class.forName("cn.tedu.reflect.Person");
		
		//由于一个类的字节码在内存中只有一份，
		//而在虚拟机中会有一个Class对象代表这段字节码，
		//所以在一个程序中，对于同一个类获取多次Class得到的将是同一个对象
		System.out.println(clz1 == clz2);
		System.out.println(clz1 == clz3);
	}
}
