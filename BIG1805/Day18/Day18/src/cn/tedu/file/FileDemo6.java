package cn.tedu.file;

import java.io.File;

public class FileDemo6 {

	public static void main(String[] args) {

		File file = new File("D:\\a.txt");

		// ��ʾ���ļ�������Ϊb.txt
		// ��·��������ļ����ı��ǰ���£�����������
		// file.renameTo(new File("D:\\b.txt"));
		// ���ļ��������·���ı������£����ļ���
		// file.renameTo(new File("E:\\b.txt"));
		// boolean b = file.renameTo(new File("D:\\a.txt"));
		// ���Ŀ��Ŀ¼����ͬ���ļ������ƶ�ʧ��
		boolean b = file.renameTo(new File("E:\\a.txt"));
		System.out.println(b);
	}

}
