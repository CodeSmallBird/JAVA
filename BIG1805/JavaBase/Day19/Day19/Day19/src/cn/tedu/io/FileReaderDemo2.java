package cn.tedu.io;

import java.io.FileReader;

public class FileReaderDemo2 {

	public static void main(String[] args) throws Exception {

		FileReader reader = new FileReader("E:\\a.txt");

		// �����������洢����ַ�
		char[] cs = new char[7];

		// ����һ����������¼ÿ�ζ�ȡ���ַ�����
		int len = -1;

		// ����ȡ���ַ��ŵ������У��ȵ����������֮���ڽ��д�ӡ
		// ��ȡ��ĩβ����-1
		// ����ֵ��ʾ��ȡ�����ַ�����
		// �ļ���һ����10���ַ����ַ�����Ĵ�СΪ7����ʾÿ�ζ�ȡ���洢7���ַ�
		// ��һ�ζ�ȡ��7���ַ�������len��ֵΪ7��7!=-1,��ô��ת��7���ַ�
		// �ڶ��ζ�ȡ��3���ַ�������len��ֵΪ3��3!=-1,��ô��ת��3���ַ�
		// �����ζ�ȡ����ĩβ������len��ֵΪ-1��-1==-1,ѭ������
		while ((len = reader.read(cs)) != -1) {
			System.out.println(new String(cs, 0, len));
		}

		// ����
		reader.close();
	}

}
