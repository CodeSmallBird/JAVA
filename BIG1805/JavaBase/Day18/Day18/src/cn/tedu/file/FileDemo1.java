package cn.tedu.file;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {

	public static void main(String[] args) throws IOException {

		// file对象代表E盘下的a.txt文件
		// 即使文件不存在，也不创建 --- 将这个路径标记为是一个文件对象，而不去检查这个文件是否存在
		File file = new File("E:\\a");

		// 当这个文件不存在的时候，才创建文件
		// 只能创建文件不能创建目录
		// 创建文件的时候要求存放的路径必须真实存在
		// boolean b = file.createNewFile();

		// 当目录不存在的时候，才能创建目录
		// 只能创建目录，而不能创建文件
		// 只能创建一层目录
		// boolean b = file.mkdir();
		// 创建多级目录
		// boolean b = file.mkdirs();

		// 删除文件和目录
		// 从计算机中彻底移除，是一个不可逆的操作
		// 在删除目录的时候，要求目录中没有子文件或者子目录
		boolean b = file.delete();

		System.out.println(b);

	}

}
