package cn.tedu.file;

import java.io.File;

public class FileDemo4 {

	public static void main(String[] args) {

		// separatorChar��Windows�л��Զ�����Ϊ\\
		// ��Linux�л��Զ�����Ϊ/
		// pathSeparatorChar��Windows�л��Զ�����Ϊ;
		// ��Linux�л��Զ�����Ϊ:
		File file = new File("a.txt");

		// ��ȡ�ļ�������
		System.out.println(file.getName());

		// ��ȡ��Ŀ¼
		System.out.println(file.getParent());

	}

}
