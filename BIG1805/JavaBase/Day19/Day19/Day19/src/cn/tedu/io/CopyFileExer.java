package cn.tedu.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileExer {
	
	public static void main(String[] args) throws IOException {
		
		// ����һ������������ָ��Ҫ���Ƶ��ļ�
		FileReader reader = new FileReader("E:\\a.txt");
		
		// ����һ�����������ָ��Ҫ��ŵ��ļ�
		FileWriter writer = new FileWriter("D:\\a.txt");
		
		// ����һ���ַ�����洢ÿ�ζ�ȡ���ַ�
		char[] cs = new char[10];
		
		// ����һ��������¼ÿ�ζ�ȡ���ַ�����
		int len = -1;
		
		// ��ȡ����
		while((len = reader.read(cs)) != -1){
			// ����ȡ��������д�����ļ���
			writer.write(cs, 0, len);
		}
		
		// ����
		reader.close();
		writer.close();
		
	}

}
