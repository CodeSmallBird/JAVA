package cn.tedu.io.inputoutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 以字节流的方式实现文件的拷贝
 * 这个案例中的拷贝 先将文件全部读取到内存中的字节数组中 再完整的写出
 * 虽然可以完成拷贝 但是数据需要先全部读到内存 耗费内存 如果文件太大 甚至可能无法执行
 */
public class Demo03 {
	public static void main(String[] args) {
		InputStream in = null;
		OutputStream out = null;
		try {
			//1.创建出字节输入流 和 字节输出流
			in = new FileInputStream("1.txt");
			out = new FileOutputStream("7.txt");
			//2.从输入流中读取数据
			int len = in.available();
			byte [] data = new byte[len];
			in.read(data);
			//3.向输出流中写出数据
			out.write(data);
			//4.关闭流
			out.flush();
			in.close();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(in!=null){
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(out!=null){
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
