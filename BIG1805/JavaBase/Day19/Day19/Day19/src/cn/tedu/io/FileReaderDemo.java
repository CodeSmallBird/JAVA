package cn.tedu.io;

import java.io.FileReader;

public class FileReaderDemo {

	public static void main(String[] args) throws Exception {

		// 创建了一个流对象指向文件
		FileReader reader = new FileReader("E:\\a.txt");

		// 读取数据
		// 返回值表示的读取到的字符的编码
		// int i = reader.read();

		// 定义一个变量来记录读取的数据
		int i = -1;
		// 读取到末尾会返回-1
		while ((i = reader.read()) != -1) {
			System.out.println((char) i);
		}
		
		// while(reader.read() != -1){
		// System.out.println((char)reader.read());
		// }

		// 关流
		reader.close();
	}

}
