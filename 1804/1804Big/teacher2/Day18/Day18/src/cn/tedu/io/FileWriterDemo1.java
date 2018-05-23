package cn.tedu.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo1 {

	public static void main(String[] args) throws IOException {

		// 创建了一个流对象指向E盘下的a.txt文件
		// 创建一个新的文件
		// FileWriter writer = new FileWriter("E:\\a.txt");
		FileWriter writer = new FileWriter("E:\\a.txt", true);

		// 写出数据
		// 数据并不是直接写到文件中的而是先写到缓冲区中
		// 缓冲区没有满而程序已经结束就导致数据死在了缓冲区中
		writer.write("def");

		// 冲刷缓冲区
		// writer.flush();

		// 关闭流---释放文件以允许别的对象来操作这个文件
		// 流对象关闭但是流对象依然在内存中占用资源
		// Java底层在关流之前会自动冲刷一次缓冲区以防有数据死在缓冲区中
		writer.close();

		// 将流对象标记为一个垃圾对象
		writer = null;

		System.out.println(writer);

	}

}
