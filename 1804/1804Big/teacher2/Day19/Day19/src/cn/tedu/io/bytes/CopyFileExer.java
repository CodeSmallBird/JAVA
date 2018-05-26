package cn.tedu.io.bytes;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFileExer {

	public static void main(String[] args) throws Exception {

		// 记录一个开始时间
		long begin = System.currentTimeMillis();

		// 创建一个输入流来指向要读取的文件
		FileInputStream in = new FileInputStream("E:\\noip.zip");

		// 创建一个输出流来指向要写入的文件
		FileOutputStream out = new FileOutputStream("D:\\a.zip");

		// 创建一个字节数组作为缓冲区
		byte[] bs = new byte[1024 * 1024 * 10];

		// 定义一个变量来记录读取的字节个数
		int len = -1;

		// 读取数据
		while ((len = in.read(bs)) != -1) {
			// 将读取的数据来写出
			out.write(bs, 0, len);
		}

		// 关流
		out.close();
		in.close();

		// 记录结束时间
		long end = System.currentTimeMillis();

		System.out.println(end - begin);
	}

}
