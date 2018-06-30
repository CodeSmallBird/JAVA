package cn.tedu.io.inputoutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 以字节流的方式实现文件的拷贝
 * 这个案例中的拷贝 读取一组字节就写出一组字节 这种方式 减少了循环的次数 提升性能
 */
public class Demo05 {
	public static void main(String[] args) {
		long begin = System.currentTimeMillis();
		//1.创建字节 输入输出流
		InputStream in = null;
		OutputStream out = null;
		try {
			in = new FileInputStream("1.wmv");
			out = new FileOutputStream("2.wmv");
			//2.读取数据 并写出 每读到一组字节 就写出一组字节
			int i = -1;
			byte [] data = new byte [1024];
			while((i = in.read(data))!=-1){
				out.write(data,0,i);
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
