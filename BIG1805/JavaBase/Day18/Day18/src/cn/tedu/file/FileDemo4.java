package cn.tedu.file;

import java.io.File;

public class FileDemo4 {

	public static void main(String[] args) {

		// separatorChar在Windows中会自动编译为\\
		// 在Linux中会自动编译为/
		// pathSeparatorChar在Windows中会自动编译为;
		// 在Linux中会自动编译为:
		File file = new File("a.txt");

		// 获取文件的名字
		System.out.println(file.getName());

		// 获取父目录
		System.out.println(file.getParent());

	}

}
