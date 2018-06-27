package cn.tedu.file;

import java.io.File;

public class FileDemo6 {

	public static void main(String[] args) {

		File file = new File("D:\\a.txt");

		// 表示将文件重命名为b.txt
		// 在路径不变而文件名改变的前提下，做的重命名
		// file.renameTo(new File("D:\\b.txt"));
		// 在文件名不变而路径改变的情况下，做的剪切
		// file.renameTo(new File("E:\\b.txt"));
		// boolean b = file.renameTo(new File("D:\\a.txt"));
		// 如果目标目录下有同名文件，则移动失败
		boolean b = file.renameTo(new File("E:\\a.txt"));
		System.out.println(b);
	}

}
