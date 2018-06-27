package cn.tedu.file;

import java.io.File;

public class FileExer1 {
	
	public static void main(String[] args) {
		
		File file = new File("E:\\aaa");
		
		del(file);
	}

	private static void del(File file) {
		
		// 判断参数是否为空
		if(file == null)
			throw new NullPointerException("亲，文件不能为空哦~~~");
		
		// 判断file是否是一个目录
		if(file.isDirectory()){
			// 获取这个目录下的所有的子目录和子文件
			File[] fs= file.listFiles();
			// 遍历数组
			for (File f : fs) {
				// 需要判断f对象是一个文件还是目录 --- 后续操作和当前方法的功能一致
				del(f);
			}
		}
		
		// 无论是文件还是目录，需要删除
		file.delete();
		
	}

}
