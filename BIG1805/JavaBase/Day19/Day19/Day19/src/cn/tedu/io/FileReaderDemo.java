package cn.tedu.io;

import java.io.FileReader;

public class FileReaderDemo {

	public static void main(String[] args) throws Exception {

		// ������һ��������ָ���ļ�
		FileReader reader = new FileReader("E:\\a.txt");

		// ��ȡ����
		// ����ֵ��ʾ�Ķ�ȡ�����ַ��ı���
		// int i = reader.read();

		// ����һ����������¼��ȡ������
		int i = -1;
		// ��ȡ��ĩβ�᷵��-1
		while ((i = reader.read()) != -1) {
			System.out.println((char) i);
		}
		
		// while(reader.read() != -1){
		// System.out.println((char)reader.read());
		// }

		// ����
		reader.close();
	}

}
