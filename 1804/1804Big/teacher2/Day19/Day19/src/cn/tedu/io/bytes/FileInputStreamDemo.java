package cn.tedu.io.bytes;

import java.io.FileInputStream;

public class FileInputStreamDemo {

	public static void main(String[] args) throws Exception {

		FileInputStream in = new FileInputStream("E:\\b.txt");

		// 读取一个字节
		// int i = in.read();
		// 构建字节数组作为缓冲区
		byte[] bs = new byte[10];

		// 定义一个变量记录读取到的字节个数
		int len = -1;

		while ((len = in.read(bs)) != -1) {
			System.out.println(new String(bs, 0, len));
		}

		in.close();

	}

}
