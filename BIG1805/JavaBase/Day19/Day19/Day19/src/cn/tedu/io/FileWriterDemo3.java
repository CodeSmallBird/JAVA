package cn.tedu.io;

import java.io.FileWriter;

public class FileWriterDemo3 {

	public static void main(String[] args) {

		// 从JDK1.7开始，允许在try之后使用()定义资源
		// try结束之后会自动关流
		// try()中的对象对应的类必须实现AutoCloseable
		try (FileWriter writer = new FileWriter("E:\\c.txt")) {

			writer.write("abc");
			writer.flush();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
