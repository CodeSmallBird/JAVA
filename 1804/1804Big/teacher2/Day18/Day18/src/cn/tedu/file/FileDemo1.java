package cn.tedu.file;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {

	public static void main(String[] args) throws IOException {

		// file对象表示的是E盘下的a.txt
		// 在创建file对象的时候，并不去计算机中检查这个文件的存在与否
		// 只是将路径(字符串)标志为一个file对象
		File file = new File("E:\\b");

		// 创建文件
		// 如果文件不存在，则创建；如果文件存在，则创建失败
		// 只能创建文件，不能创建目录
		// boolean b = file.createNewFile();

		// 创建目录
		// 只能创建目录，不能创建文件
		// 只能创建一层目录
		// boolean b = file.mkdir();

		// 创建多层目录
		// boolean b = file.mkdirs();

		// 删除文件或者目录
		// 从计算机中彻底移除，不可撤销
		// 如果要删除的是一个目录并且这个目录非空，则删除失败
		boolean b = file.delete();

		System.out.println(b);
	}

}
