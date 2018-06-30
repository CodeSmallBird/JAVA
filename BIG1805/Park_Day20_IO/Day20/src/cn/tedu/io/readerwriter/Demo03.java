package cn.tedu.io.readerwriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 * ͨ���ַ��� �����ı��ļ�
 * ��1.txt�п���һ���ַ� ��д��һ���ַ�
 * ��ѭ���Ĺ����� ÿ�ζ�д����һ���ַ� Ч�ʱȽϸ�
 */
public class Demo03 {
	public static void main(String[] args) {
		long begin = System.currentTimeMillis();
		//1.�����ַ���������� �����ļ�
		Reader reader = null;
		Writer writer = null;
		try {
			reader = new FileReader("3.txt");
			writer = new FileWriter("4.txt");
			//2.��reader�ж�ȡ���� �� writer��д������
			int i = -1;
			char [] buf = new char[1024];
			while((i = reader.read(buf))!=-1){
				writer.write(buf,0,i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//3.�ر���
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				} 
			}
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				} 
			}
			long end = System.currentTimeMillis();
			System.out.println(end - begin);
		}
	}
}
