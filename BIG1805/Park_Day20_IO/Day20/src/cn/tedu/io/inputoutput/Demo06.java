package cn.tedu.io.inputoutput;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

/**
 * 以字符流 拷贝文件 文件中包含中文
 * 其中来源文件为 utf-8 发现通过FileReader读取时由乱码 因为FileReader默认采用系统码 在中文系统中为gbk
 * 文件本身的编码和读取时采用的编码不一致 产生了乱码
 */
public class Demo06 {
	public static void main(String[] args) throws Exception {
		//1.创建字符 输入 输出 流
		Reader reader = new FileReader("10.txt");
		Writer writer = new FileWriter("11.txt");
		//2.读取数据 输出
		char [] data = new char[10];
		int i = -1;
		while((i = reader.read(data))!=-1){
			writer.write(data,0,i);
		}
		writer.flush();
		//3.关闭流
		reader.close();
		writer.close();
	}
}
