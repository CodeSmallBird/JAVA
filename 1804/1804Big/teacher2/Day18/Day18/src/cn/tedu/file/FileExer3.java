package cn.tedu.file;

import java.io.File;
import java.io.FilenameFilter;

public class FileExer3 {

	static File docx = new File("D:\\DOCX");

	public static void main(String[] args) {

		File file = new File("E:\\aaa");

		get(file);

	}

	private static void get(File file) {

		// 判断参数为空
		if (file == null)
			throw new NullPointerException();

		// 判断是否是目录
		if (file.isDirectory()) {
			File[] fs = file.listFiles();
			for (File f : fs) {
				get(f);
			}
		} else if (file.getName().endsWith(".docx")) {

			// 获取文件名
			String fileName = file.getName();

			int index = fileName.lastIndexOf('.');

			// 后缀名
			final String suffix = fileName.substring(index);

			// 文件本命
			final String fname = fileName.substring(0, index);

			// 筛选文件名-数字.后缀名
			File[] fs = docx.listFiles(new FilenameFilter() {

				@Override
				public boolean accept(File dir, String name) {

					return name.matches(fname + "-?\\d*\\" + suffix);
				}
			});

			// 挪动文件，并将文件进行编号
			file.renameTo(new File(docx, fname + (fs.length > 0 ? ("-" + fs.length) : "") + suffix));

		}

	}

}
