package cn.tedu.io.inputoutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * 以字节输出流的方式输出字节数据
 */
public class Demo02 {
	public static void main(String[] args) throws Exception {
		//1.准备字节数据
		String str = "my name is park , i am so shuai";
		byte []  data = str.getBytes();
		//2.创建字节输出流 关联到6.txt
		OutputStream out = new FileOutputStream("6.txt");
		//3.循环数据数据到 输出流
		for(byte b : data){
			out.write(b);
		}
		//4.刷流
		out.flush();
		//5.关流
		out.close();
	}
}
