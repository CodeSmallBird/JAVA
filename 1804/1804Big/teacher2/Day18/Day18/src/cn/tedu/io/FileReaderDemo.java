package cn.tedu.io;

import java.io.FileReader;

public class FileReaderDemo {

	public static void main(String[] args) {

		// 表示读取E盘下的a.txt文件
		FileReader reader = null;
		try {
			reader = new FileReader("E:\\a.txt");

			// 每次只读取一个字符
			// int i = reader.read();

			// 定义一个变量来记录每次读取的数据
			int i = -1;

			// 如果流读到了文件的末尾返回一个-1
			while ((i = reader.read()) != -1) {
				System.out.println((char) i);
			}

			// while(reader.read() != -1){
			// System.out.println((char)reader.read());
			// }

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					reader = null;
				}
			}

		}

	}

}
