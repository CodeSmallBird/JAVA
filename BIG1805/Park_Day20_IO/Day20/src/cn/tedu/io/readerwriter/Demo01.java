package cn.tedu.io.readerwriter;

import java.io.FileReader;
import java.io.FileWriter;

/**
 * ͨ���ַ��� �����ı��ļ� 
 * ��1.txt�е����� ȫ�������ڴ� ��Ϊstr�ַ���
 * �ٽ�str�ַ���������д����2.txt
 * ���ַ�ʽ ���������� �ȴ����ڴ� ����������Ƚ�С���� �� ����ļ��е��������ܴ� str�ͻ�ܴ� �˷��ڴ�
 */
public class Demo01 {
	public static void main(String[] args) throws Exception {
		//1.�����ļ��ַ� ����\��� ������Ҫ�������ļ�
		FileReader reader = new FileReader("1.txt");
		FileWriter writer = new FileWriter("2.txt");
		//2.ͨ��reader�ж�ȡ�ַ�����
		String str = "";
		int i = -1;
		while((i = reader.read())!=-1){
			char c = (char)i;
			str += c;
		}
		
		//3.ͨ��writerд���ַ�����
		char [] cs = str.toCharArray();
		for(char c : cs){
			writer.write(c);
		}
		writer.flush();
		
		//4.�ر���
		reader.close();
		writer.close();
	}
}
