package cn.tedu.io.inputoutput;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

/**
 * ���ַ��� �����ļ� �ļ��а�������
 * ������Դ�ļ�Ϊ utf-8 ����ͨ��FileReader��ȡʱ������ ��ΪFileReaderĬ�ϲ���ϵͳ�� ������ϵͳ��Ϊgbk
 * �ļ�����ı���Ͷ�ȡʱ���õı��벻һ�� ����������
 */
public class Demo06 {
	public static void main(String[] args) throws Exception {
		//1.�����ַ� ���� ��� ��
		Reader reader = new FileReader("10.txt");
		Writer writer = new FileWriter("11.txt");
		//2.��ȡ���� ���
		char [] data = new char[10];
		int i = -1;
		while((i = reader.read(data))!=-1){
			writer.write(data,0,i);
		}
		writer.flush();
		//3.�ر���
		reader.close();
		writer.close();
	}
}
