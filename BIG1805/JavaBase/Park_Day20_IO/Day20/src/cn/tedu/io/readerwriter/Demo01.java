package cn.tedu.io.readerwriter;

import java.io.FileReader;
import java.io.FileWriter;

/**
 * 通过字符流 拷贝文本文件 
 * 将1.txt中的内容 全部读入内存 变为str字符串
 * 再将str字符串的内容写出到2.txt
 * 这种方式 将所有数据 先存入内存 如果数据量比较小还好 但 如果文件中的数据量很大 str就会很大 浪费内存
 */
public class Demo01 {
	public static void main(String[] args) throws Exception {
		//1.创建文件字符 输入\输出 流连接要操作的文件
		FileReader reader = new FileReader("1.txt");
		FileWriter writer = new FileWriter("2.txt");
		//2.通过reader中读取字符数据
		String str = "";
		int i = -1;
		while((i = reader.read())!=-1){
			char c = (char)i;
			str += c;
		}
		
		//3.通过writer写出字符数据
		char [] cs = str.toCharArray();
		for(char c : cs){
			writer.write(c);
		}
		writer.flush();
		
		//4.关闭流
		reader.close();
		writer.close();
	}
}
