package cn.tedu.file;

import java.io.File;

public class FileDemo4 {
	
	public static void main(String[] args) {
		
		File file = new File("E:\\workspace");
		
		// 获取绝对路径
		System.out.println(file.getAbsolutePath());
		// 获取传入的路径参数
		System.out.println(file.getPath());
		
		// 获取文件名
		System.out.println(file.getName());
		// 获取父目录
		System.out.println(file.getParent());
		
	}

}
