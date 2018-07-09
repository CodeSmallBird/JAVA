package cn.tedu.io.readerwriter;

import java.io.FileWriter;
import java.io.StringReader;

/**
 * StringReader案例
 * 将一个字符串作为数据来源 通过StringReader读取再通过FileWriter写出到文件中
 */
public class Demo07 {
	public static void main(String[] args) throws Exception {
		String str = "my name is park,i am so shuai,do you like me";
		StringReader reader = new StringReader(str);
		FileWriter writer = new FileWriter("5.txt");
		int i = -1;
		while((i = reader.read())!=-1){
			writer.write(i);
		}
		writer.flush();
		reader.close();
		writer.close();
	}
}
