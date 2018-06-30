package cn.tedu.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileExer {
	
	public static void main(String[] args) throws IOException {
		
		// 创建一个输入流对象指向要复制的文件
		FileReader reader = new FileReader("E:\\a.txt");
		
		// 创建一个输出流对象指向要存放的文件
		FileWriter writer = new FileWriter("D:\\a.txt");
		
		// 创建一个字符数组存储每次读取的字符
		char[] cs = new char[10];
		
		// 创建一个变量记录每次读取的字符个数
		int len = -1;
		
		// 读取数据
		while((len = reader.read(cs)) != -1){
			// 将读取到的数据写到新文件中
			writer.write(cs, 0, len);
		}
		
		// 关流
		reader.close();
		writer.close();
		
	}

}
