package cn.tedu.io.properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Properties;
/**
 * Properties的使用
 * Properties类 可以通过 load 操作 加载一个.properties文件 从中解析出 配置的键值对信息
 * 提供了getProperties方法 根据传入的键 获取 对应的配置的值
 * 
 * 在java开发中 经常会将配置信息写在一个.properties文件中 在通过如上的方法来获取
 * 这样可以防止将经常发生变动的配置信息写死在程序中 给程序提供了更好的灵活性
 */
public class Demo01 {
	public static void main(String[] args) throws Exception {
		//1.创建Properties对象
		Properties prop = new Properties();
		
		//2.加载配置信息 传入一个流 从流中解析该信息 解析过后 prop对象中 就已经有了 该文件中所有的配置的信息
		InputStream in = new FileInputStream("conf.properties");
		prop.load(in);
		
		//3.从prop中根据键获取对应的值
//		String user = prop.getProperty("user");
//		System.out.println(user);
//		String psw = prop.getProperty("psw");
//		System.out.println(psw);
		
		//4.获取properties中的所有配置信息
		Enumeration enums = prop.propertyNames();
		while(enums.hasMoreElements()){
			String key = (String) enums.nextElement();
			String value = prop.getProperty(key);
			System.out.println(key+"~"+value);
		}
		
		//5.修改属性
//		System.out.println(prop.getProperty("psw"));
//		prop.setProperty("psw", "888");
//		System.out.println(prop.getProperty("psw"));
		
		//6.将配置写出
		OutputStream out = new FileOutputStream("conf.properties");
		prop.store(out, "hahaha prop change!!");

		//7.关闭流
		out.flush();
		in.close();
		out.close();
		
		while(true){}
	
	}
}
