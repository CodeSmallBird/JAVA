package cn.tedu.file;

import java.io.File;

public class FileExer2 {

	static int javaCount = 0;
	static int classCount = 0;

	public static void main(String[] args) {

		File file = new File("E:\\workspace");

		count(file);

		System.out.println("java文件：" + javaCount);
		System.out.println("class文件：" + classCount);

	}

	private static void count(File file) {

		// 判断参数是否为空
		if (file == null)
			throw new NullPointerException();

		// 判断file是否为目录
		if (file.isDirectory()) {

			// 获取所有的子目录和子文件
			File[] fs = file.listFiles();
			for (File f : fs) {
				count(f);
			}

		} /* 如果file不是目录那么就是文件 */ else if (file.getName().endsWith(".java")) {
			javaCount++;
		} else if (file.getName().endsWith(".class")) {
			classCount++;
		}

	}

}
