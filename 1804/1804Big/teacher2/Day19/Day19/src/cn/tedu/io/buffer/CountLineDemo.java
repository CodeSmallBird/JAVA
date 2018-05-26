package cn.tedu.io.buffer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class CountLineDemo {

	// 记录行数
	static int count = 0;

	public static void main(String[] args) throws Exception {

		// 指向工作空间
		File file = new File("E:\\workspace");

		count(file);
		
		System.out.println(count);

	}

	private static void count(File file) throws Exception {
		// 判断参数是否为空
		if (file == null)
			throw new NullPointerException();

		// 判断是否是一个目录
		if (file.isDirectory()) {

			// 获取所有的子目录和子文件
			File[] fs = file.listFiles();
			for (File f : fs) {
				count(f);
			}

		} else if (file.getName().endsWith(".java")) {

			BufferedReader reader = new BufferedReader(new FileReader(file));

			while (reader.readLine() != null)
				count++;

			reader.close();

		}

	}

}
