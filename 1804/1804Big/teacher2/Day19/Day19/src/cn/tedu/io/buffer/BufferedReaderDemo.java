package cn.tedu.io.buffer;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderDemo {

	public static void main(String[] args) throws Exception {

		// 真正读取文件的是FileReader
		// BufferedReader是从FileReader中来获取数据，然后提供一个缓冲区
		BufferedReader reader = new BufferedReader(new FileReader("E:\\笔记.docx"));

		// 读取一行数据
		// String str = reader.readLine();

		// 记录每一行的数据
		String line = null;

		while ((line = reader.readLine()) != null) {
			System.out.println(line);
		}

		// 关流
		// 在关流的时候，只需要关闭最外层的流就行
		reader.close();
	}

}
