package cn.tedu.map;

import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws Exception {

		Properties prop = new Properties();

		// 添加键值对
		prop.setProperty("姓名", "殷素素");
		prop.setProperty("年龄", "35");
		prop.setProperty("性别", "女");

		// 持久化这个映射
		// Properties对象只能存储在.properties文件中
		// 第二个参数表示的是向properties文件中来添加注释
		// 这句注释往往用于说明这个properties文件的作用
		prop.store(new FileOutputStream("p.properties"), "This is a person~~~");

	}

}
