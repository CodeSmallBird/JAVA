package cn.tedu.file;

import java.io.File;

public class FileExer1 {
	
	public static void main(String[] args) {
		
		File file = new File("E:\\aaa");
		del(file);
		
	}

	public static void del(File file) {

		// 判断参数是否为null
		if (file == null)
			throw new NullPointerException("亲，文件不能为空哦~~~");
		
		// 判断是否是一个目录
		if(file.isDirectory()){
			// 获取这个目录下的所有的子文件和子目录
			File[] fs = file.listFiles();
			// 遍历这个数组
			for (File f : fs) {
				del(f);
			}
		}
		
		// 无论是文件还是目录，都需要删除
		file.delete();

	}

}
