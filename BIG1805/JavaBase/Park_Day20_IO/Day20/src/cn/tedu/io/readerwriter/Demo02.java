package cn.tedu.io.readerwriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 通过字符流 拷贝文本文件
 * 从1.txt中拷贝一个字符 就写出一个字符
 * 数据不会在内存存中堆积 即使文件非常的大 程序也可以正常处理 不会耗费过多的内存
 * 在循环的过程中 每次读写都是一个字符 效率比较低
 */
public class Demo02 {
	public static void main(String[] args) {
		long begin = System.currentTimeMillis();
		//1.创建文件字符 输入\输出 流连接要操作的文件
		FileReader reader = null;
		FileWriter writer = null;
		try {
			reader = new FileReader("3.txt");
			writer = new FileWriter("4.txt");
			//2.通过reader中读取字符数据 直接写出到Writer中 读一点就写出一点 不在内存中堆积 节省内存空间
			int i = -1;
			while((i=reader.read())!=-1){
				writer.write(i);
			}
			writer.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//3.关闭流
			if(reader!=null){
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(writer!=null){
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
