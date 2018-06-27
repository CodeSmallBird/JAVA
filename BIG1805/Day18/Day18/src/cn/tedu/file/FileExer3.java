package cn.tedu.file;

import java.io.File;
import java.io.FilenameFilter;

public class FileExer3 {

	static File DOCX = new File("E:\\DOCX");

	public static void main(String[] args) {

		File file = new File("E:\\aaa");

		get(file);

	}

	private static void get(File file) {

		if (file == null)
			throw new NullPointerException();

		if (file.isDirectory()) {

			// 获取这个目录下的所有的子文件和子目录
			File[] fs = file.listFiles();
			for (File f : fs) {
				get(f);
			}

		} else if (file.getName().endsWith(".docx")) {

			// file --- 笔记.docx
			String fileName = file.getName();
			// 找 . 最后一次出现的位置
			int index = fileName.lastIndexOf(".");
			// 文件真正的名字
			final String fname = fileName.substring(0, index);
			// 后缀名
			final String suffix = fileName.substring(index);
			// 因为文件是存储在DOCX目录中，所以需要筛选DOCX目录中名字结构一致的文件
			File[] fs = DOCX.listFiles(new FilenameFilter() {
				@Override
				public boolean accept(File dir, String name) {
					// 笔记.docx 笔记-1.docx  笔记-2.docx
					return name.matches(fname + "(-\\d+)?" + suffix);
				}
			});
			// 将文件挪动DOCX目录中
			file.renameTo(new File(DOCX, fname + 
					(fs.length > 0 ? "-" + fs.length : "") + suffix));
		}

	}

}
