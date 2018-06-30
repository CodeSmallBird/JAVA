package cn.tedu.io.inputoutput;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * 利用字节流读取文件
 */
public class Demo01 {
	public static void main(String[] args) throws Exception {
		//1.创建字节输入流 关联到1.txt
		InputStream in = new FileInputStream("1.txt");
		//2.循环读取1.txt 直到文件的结尾 打印内容
		int i = -1;
		while((i = in.read())!=-1){
			byte b = (byte) i;
			System.out.println(b);
		}
		//3.关闭流
		in.close();
	}
}
