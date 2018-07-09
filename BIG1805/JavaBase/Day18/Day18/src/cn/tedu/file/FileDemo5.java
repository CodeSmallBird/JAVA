package cn.tedu.file;

import java.io.File;
//import java.io.FileFilter;
import java.io.FilenameFilter;

public class FileDemo5 {

	public static void main(String[] args) {

		File file = new File("C:\\");

		// ��ʾ��ȡC���µ����е��ļ���Ŀ¼
		// File[] fs = file.listFiles();

		// ��ʾ��ȡC���µ����е����ļ�
		// File[] fs = file.listFiles(new FileFilter() {
		//
		// // �����������true����������������ǰ��pathname����ŵ�������
		// // �����������false������������������
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
