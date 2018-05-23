package cn.tedu.file;

import java.io.File;

public class FileDemo2 {
	
	public static void main(String[] args) {
		
		File file = new File("E:\\a.txt");
		
		// 判断是否是一个文件
		System.out.println(file.isFile());

		// 判断是否是一个目录
		System.out.println(file.isDirectory());
		
		// 获取文件名
		System.out.println(file.getName());
		
		// 获取指定目录下的所有的子文件和子目录
		// File[] fs = file.listFiles();
		//
		// for (File f : fs) {
		// System.out.println(f);
		// }
		
	}

}
