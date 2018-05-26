package cn.tedu.map;

import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.Properties;

public class PropertiesDemo2 {

	public static void main(String[] args) throws Exception {

		Properties prop = new Properties();

		// 反持久化
		prop.load(new FileInputStream("p.properties"));

		// 根据键来获取对应的值
		// String value = prop.getProperty("name");
		// String value = prop.getProperty("姓名", "Amy");
		// System.out.println(value);

		// 表示将Properties中的键值对全部打印到指定的位置
		// prop.list(new PrintStream(System.out));
		prop.list(new PrintStream("a.txt"));

	}

}
