package cn.tedu.file;

import java.io.File;

public class FileExer2 {

	static int javaCount = 0;
	static int classCount = 0;

	public static void main(String[] args) {

		File file = new File("E:\\workspace");
		statistic(file);

		System.out.println("Java文件个数：" + javaCount);
		System.out.println("class文件个数：" + classCount);

	}

	private static void statistic(File file) {

		// 判断参数是否为null
		if (file == null)
			throw new NullPointerException();

		// 判断是否是一个目录
		if (file.isDirectory()) {
			// 获取这个目录下所有的子目录和子文件
			File[] fs = file.listFiles();
			for (File f : fs) {
				statistic(f);
			}
		} /* 如果file不是目录那么就是文件 */ else if (file.getName().endsWith(".java")) {
			javaCount++;
		} else if (file.getName().endsWith(".class")) {
			classCount++;
		}

	}

}
