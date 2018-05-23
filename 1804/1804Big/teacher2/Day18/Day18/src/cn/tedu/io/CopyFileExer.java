package cn.tedu.io;

import java.io.FileReader;
import java.io.FileWriter;

public class CopyFileExer {

	public static void main(String[] args) throws Exception {

		// 创建一个输入流指向要复制的文件
		FileReader reader = new FileReader("E:\\a.txt");

		// 创建一个输出流指向要存放的文件
		FileWriter writer = new FileWriter("d:\\a.txt");

		// 创建一个数组用于存储读取的字符
		char[] cs = new char[10];

		// 定义一个变量来记录每次读取的字符个数
		int i = -1;

		// 读取数据
		while ((i = reader.read(cs)) != -1) {
			// 将读取到的字符写出
			writer.write(cs, 0, i);
		}

		// 关流
		reader.close();
		writer.close();

	}

}
