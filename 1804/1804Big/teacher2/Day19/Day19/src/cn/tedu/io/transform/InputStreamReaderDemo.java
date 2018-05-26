package cn.tedu.io.transform;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {

	public static void main(String[] args) throws Exception {

		// 底层读取数据的是FileInputStream
		// 获取到的数据是字符形式
		// 底层是将字节转化为字符
		// InputStreamReader reader = new InputStreamReader(new
		// FileInputStream("E:\\a.txt"));
		InputStreamReader reader = new InputStreamReader(new FileInputStream("E:\\a.txt"), "utf-8");

		char[] cs = new char[6];
		int len = -1;
		while ((len = reader.read(cs)) != -1) {
			System.out.println(new String(cs, 0, len));
		}

		reader.close();
	}

}
