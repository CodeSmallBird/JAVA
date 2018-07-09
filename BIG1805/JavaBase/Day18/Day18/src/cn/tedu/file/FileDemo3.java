package cn.tedu.file;

import java.io.File;

public class FileDemo3 {

	public static void main(String[] args) {

		File file = new File("a.txt");
		
		// 获取绝对路径
		System.out.println(file.getAbsoluteFile());

		// 获取最后一次修改时间
		// System.out.println(file.lastModified());

		// 设置的需要判断修改的时候是否晚于创建时间
		// file.setLastModified(78624L);

		// 判断此文件是否可写
		// System.out.println(file.canWrite());

		// 判断是否是一个隐藏文件
		// System.out.println(file.isHidden());

		// 判断是否是一个绝对路径
		// System.out.println(file.isAbsolute());

		// 判断文件或者目录是否真实存在
		// System.out.println(file.exists());

		// System.out.println(file.setExecutable(false));
		// System.out.println(file.setReadable(false));
		// System.out.println(file.setWritable(false));
		// 只有当前用户可写，其他用户不可写
		// System.out.println(file.setWritable(true,true));
	}

}
