package cn.tedu.file;

import java.io.File;
//import java.io.FileFilter;
import java.io.FilenameFilter;

public class FileDemo5 {

	public static void main(String[] args) {

		File file = new File("D:\\");

		// 获取D盘下的子目录
		// File[] fs = file.listFiles(new FileFilter() {
		//
		// @Override
		// public boolean accept(File pathname) {
		// // return pathname.isFile();
		// return pathname.getName().matches(".*\\d.*");
		// }
		// });

		File[] fs = file.listFiles(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				// return name.matches(".*\\d.*");
				return new File(dir, name).isFile();
			}
		});

		for (File f : fs) {
			System.out.println(f);
		}

	}

}
