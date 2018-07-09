package cn.tedu.io.inputoutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Demo07 {
	public static void main(String[] args) throws Exception {
		//1.创建 字符输入输出 流
		//--由于输入文件是utf-8的 如果使用FileReader将会用系统码gbk来读取 会产生乱码 所以必须自己构造一个使用utf-8码表的字符输入流 才能不乱码
		InputStream in = new FileInputStream("10.txt");
		InputStreamReader reader = new InputStreamReader(in,"utf-8");
		//--优于希望输出的文件是utf-8的 如果使用FileWriter将会用系统码gbk来输出 不符合要求 所以必须自己构造一个使用utf-8码表的字符输出流 才能满足要求
		OutputStream out = new FileOutputStream("11.txt");
		OutputStreamWriter writer = new OutputStreamWriter(out, "utf-8");
		
		//2.读取数据并输出
		int i = -1;
		char [] data = new char[10];
		while((i = reader.read(data)) != -1){
			writer.write(data,0,i);
		}
		
		//3.关闭流
		reader.close();
		writer.close();
	}
}
