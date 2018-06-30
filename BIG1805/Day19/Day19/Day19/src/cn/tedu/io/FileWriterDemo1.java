package cn.tedu.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo1 {

	public static void main(String[] args) throws IOException {

		// 创建一个新的文件
		// 如果这个文件不存在，则把创建的新文件作为目标文件
		// 如果这个文件已经存在，则创建新文件覆盖原文件
		FileWriter writer = new FileWriter("E:\\a.txt");

		// 写出数据
		// 数据并不是直接写到文件中而是写到缓冲区中
		// 数据还在缓冲区中，然后程序结束了 ---导致数据死在缓冲区中了
		writer.write("def");

		// 冲刷缓冲区
		// writer.flush();

		// 关闭流
		// 关流之前会自动冲刷一次缓冲区 --- 为了防止有数据死在缓冲区
		writer.close();

		// 为了释放内存
		writer = null;

		System.out.println(writer);

	}

}
