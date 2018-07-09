package cn.tedu.io.readerwriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 * 通过字符流 拷贝文本文件
 * 从1.txt中拷贝一堆字符 就写出一堆字符
 * 在循环的过程中 每次读写都是一堆字符 效率比较高
 */
public class Demo03 {
	public static void main(String[] args) {
		long begin = System.currentTimeMillis();
		//1.创建字符输入输出流 连接文件
		Reader reader = null;
		Writer writer = null;
		try {
			reader = new FileReader("3.txt");
			writer = new FileWriter("4.txt");
			//2.从reader中读取数据 向 writer中写出数据
			int i = -1;
			char [] buf = new char[1024];
			while((i = reader.read(buf))!=-1){
				writer.write(buf,0,i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//3.关闭流
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				} 
			}
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				} 
			}
			long end = System.currentTimeMillis();
			System.out.println(end - begin);
		}
	}
}
