package cn.tedu.file;

import java.io.File;

public class FileDemo2 {
	
	public static void main(String[] args) {
		
		File file = new File("E:\\");
		
		// ��ȡE���µ����е����ļ�����Ŀ¼
		File[] fs = file.listFiles();
		for (File f : fs) {
			// ��ȡ�ļ�������
			System.out.println(f.getName());
		}
		
		// �ж��Ƿ���һ���ļ�
		System.out.println(file.isFile());
		// �ж��Ƿ���һ��Ŀ¼
		System.out.println(file.isDirectory());
	}

}
