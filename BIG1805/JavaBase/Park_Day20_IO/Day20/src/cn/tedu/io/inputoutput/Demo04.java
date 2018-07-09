package cn.tedu.io.inputoutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 以字节流的方式实现文件的拷贝
 * 这个案例中的拷贝 读取一个字节就写出一个字节 数据不对大量堆积在内存中 可以节省内存 使大文件的拷贝成为可能
 * 这个案例中的拷贝 每次读写是一个字节 效率比较低 当拷贝的文件比较大的时候 很费时间
 */
public class Demo04 {
	public static void main(String[] args) {
		long begin = System.currentTimeMillis();
		//1.创建字节 输入输出流
		InputStream in = null;
		OutputStream out = null;
		try {
			in = new FileInputStream("1.wmv");
			out = new FileOutputStream("2.wmv");
			//2.读取数据 并写出 每读到一个字节 就写出一个字节
			int i = -1;
			while((i = in.read())!=-1){
				out.write(i);
			}
			out.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//3.关闭流
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				} 
			}
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				} 
			}
			long end = System.currentTimeMillis();
			System.out.println(end - begin);
		}
	}
}
