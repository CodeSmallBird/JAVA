package cn.tedu.io;

import java.io.FileReader;

public class FileReaderDemo2 {

	public static void main(String[] args) throws Exception {

		FileReader reader = new FileReader("E:\\a.txt");

		// 构建容器来存储多个字符
		char[] cs = new char[7];

		// 定义一个变量来记录每次读取的字符个数
		int len = -1;

		// 将读取的字符放到数组中，等到数组读满了之后在进行打印
		// 读取到末尾返回-1
		// 返回值表示读取到的字符个数
		// 文件中一共是10个字符，字符数组的大小为7，表示每次读取最多存储7个字符
		// 第一次读取了7个字符，所以len的值为7，7!=-1,那么就转化7个字符
		// 第二次读取了3个字符，所以len的值为3，3!=-1,那么就转化3个字符
		// 第三次读取到了末尾，所以len的值为-1，-1==-1,循环结束
		while ((len = reader.read(cs)) != -1) {
			System.out.println(new String(cs, 0, len));
		}

		// 关流
		reader.close();
	}

}
