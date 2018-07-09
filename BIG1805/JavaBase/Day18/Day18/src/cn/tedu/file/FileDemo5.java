package cn.tedu.file;

import java.io.File;
//import java.io.FileFilter;
import java.io.FilenameFilter;

public class FileDemo5 {

	public static void main(String[] args) {

		File file = new File("C:\\");

		// 表示获取C盘下的所有的文件和目录
		// File[] fs = file.listFiles();

		// 表示获取C盘下的所有的子文件
		// File[] fs = file.listFiles(new FileFilter() {
		//
		// // 如果方法返回true，符合条件，将当前的pathname对象放到数组中
		// // 如果方法返回false，不符合条件，跳过
		// @Override
		// public boolean accept(File pathname) {
		// // return pathname.isFile();
		// // return pathname.isDirectory();
		// return pathname.getName().matches(".*\\d.*");
		// }
		// });

		File[] fs = file.listFiles(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				return new File(dir, name).isDirectory() && name.matches(".*\\d.*");
			}
		});

		for (File f : fs) {
			System.out.println(f);
		}
	}

}
