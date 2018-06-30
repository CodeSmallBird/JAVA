package cn.tedu.io.readerwriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 通过字符流 拷贝文本文件
 * 从1.txt中拷贝一堆字符 就写出一堆字符
 * 在循环的过程中 每次读写都是一堆字符 效率比较高
 */
public class Demo04 {
	public static void main(String[] args) {
		long begin = System.currentTimeMillis();
		//1.创建字符输入输出流 连接文件
		BufferedReader bufReader = null;
		BufferedWriter bufWriter = null;
		try {
			FileReader freader = new FileReader("3.txt");
			FileWriter fwriter = new FileWriter("4.txt");
			bufReader = new BufferedReader(freader);
			bufWriter = new BufferedWriter(fwriter);
			//2.从reader中读取数据 向 writer中写出数据
			String line = null;
			while((line = bufReader.readLine())!=null){
				bufWriter.write(line);
				bufWriter.newLine();
			}
			bufWriter.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//3.关闭流
			if (bufReader != null) {
				try {
					bufReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				} 
			}
			if (bufWriter != null) {
				try {
					bufWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				} 
			}
			long end = System.currentTimeMillis();
			System.out.println(end - begin);
		}
	}
}
