package cn.tedu.file;

import java.io.File;

public class FileDemo6 {
	
	public static void main(String[] args) {
		
		File file = new File("E:\\a.txt");
		
		// 如果路径不变而文件名改变则做的是重命名操作
		// 如果文件名不变而路径改变则做的是剪切操作
		// 如果要挪动的目标路径中存在重名文件则挪动失败
		boolean b = file.renameTo(new File("D:\\a.txt"));
		System.out.println(b);
	}

}
