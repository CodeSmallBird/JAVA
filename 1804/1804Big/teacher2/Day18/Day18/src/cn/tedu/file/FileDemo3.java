package cn.tedu.file;

import java.io.File;

public class FileDemo3 {

	public static void main(String[] args) {

		File file = new File("E:\\a.txt");

		// 判断是否可写
		// System.out.println(file.canWrite());

		// 判断是否是一个隐藏文件
		// System.out.println(file.isHidden());

		// 判断是否是一个绝对路径
		// System.out.println(file.isAbsolute());

		// 判断file对象表示的文件或者目录是否真实存在
		// System.out.println(file.exists());

		// 设置是否可执行
		// boolean b = file.setExecutable(false);

		// 设置是否可读
		// boolean b = file.setReadable(false);
		// 设置是否可写
		// boolean b = file.setWritable(false);
		// System.out.println(b);

		// 获取修改时间
		System.out.println(file.lastModified());

		// file.setLastModified(83215L);
	}

}
