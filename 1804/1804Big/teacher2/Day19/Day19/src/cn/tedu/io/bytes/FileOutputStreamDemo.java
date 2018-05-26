package cn.tedu.io.bytes;

import java.io.FileOutputStream;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws Exception {

		// FileOutputStream out = new FileOutputStream("E:\\b.txt");
		FileOutputStream out = new FileOutputStream("E:\\b.txt", true);

		// 字节流没有缓冲区
		out.write("你好".getBytes("utf-8"));

		out.close();

	}

}
