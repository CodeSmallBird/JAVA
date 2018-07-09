package cn.tedu.reflect.demo2;

import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * 反射案例：配置文件中配哪个方法就调用哪个方法
 */
public class Person {
	public void say(){
		System.out.println("说。。。");
	}
	public void eat(){
		System.out.println("吃。。。");
	}
	
	//一共有一万个方法
	
	public static void main(String[] args) {
		try {
			//0.创建对象 希望根据配置文件中的配置 调用对象上的指定方法
			Person p = new Person();
			//1.读取配置文件
			Properties prop = new Properties();
			FileInputStream in = new FileInputStream("demo02.properties");
			prop.load(in);
			in.close();
			String methodName = prop.getProperty("mx");
			
			//2.可以通过 if elseif 做判断 每个方法判断一次 进行调用
			//但是这种写法 有多少方法就也写多少个else if 方法特别多的时候 写起来很麻烦
//			if("eat".equals(methodName)){
//				p.eat();
//			}else if("say".equals(methodName)){
//				p.eat();
//			}
			
			//2.通过反射技术 直接根据方法名 从字节码中 反射出Method对象 直接在当前方法上执行该Method方法
			//只用了三行代码 就实现了相同的功能
			Class clz = p.getClass();
			Method m = clz.getMethod(methodName);
			m.invoke(p);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
