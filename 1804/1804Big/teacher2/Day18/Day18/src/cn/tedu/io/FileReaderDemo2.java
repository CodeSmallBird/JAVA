package cn.tedu.io;

import java.io.FileReader;

public class FileReaderDemo2 {

	public static void main(String[] args) throws Exception {

		FileReader reader = new FileReader("E:\\a.txt");

		// 创建一个数组存储每次读取的数据
		char[] cs = new char[5];

		// 定义一个变量来记录每次读取的字符个数
		int len = -1;

		// 将字符读到字符数组中---返回值表示读取到的字符个数
		while ((len = reader.read(cs)) != -1) {
			System.out.println(new String(cs, 0, len));
		}

		reader.close();

	}

}
