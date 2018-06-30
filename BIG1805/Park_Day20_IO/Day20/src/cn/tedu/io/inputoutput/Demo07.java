package cn.tedu.io.inputoutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Demo07 {
	public static void main(String[] args) throws Exception {
		//1.���� �ַ�������� ��
		//--���������ļ���utf-8�� ���ʹ��FileReader������ϵͳ��gbk����ȡ ��������� ���Ա����Լ�����һ��ʹ��utf-8�����ַ������� ���ܲ�����
		InputStream in = new FileInputStream("10.txt");
		InputStreamReader reader = new InputStreamReader(in,"utf-8");
		//--����ϣ��������ļ���utf-8�� ���ʹ��FileWriter������ϵͳ��gbk����� ������Ҫ�� ���Ա����Լ�����һ��ʹ��utf-8�����ַ������ ��������Ҫ��
		OutputStream out = new FileOutputStream("11.txt");
		OutputStreamWriter writer = new OutputStreamWriter(out, "utf-8");
		
		//2.��ȡ���ݲ����
		int i = -1;
		char [] data = new char[10];
		while((i = reader.read(data)) != -1){
			writer.write(data,0,i);
		}
		
		//3.�ر���
		reader.close();
		writer.close();
	}
}
