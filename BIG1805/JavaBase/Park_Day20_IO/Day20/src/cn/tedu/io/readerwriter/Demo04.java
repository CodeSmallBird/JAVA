package cn.tedu.io.readerwriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * ͨ���ַ��� �����ı��ļ�
 * ��1.txt�п���һ���ַ� ��д��һ���ַ�
 * ��ѭ���Ĺ����� ÿ�ζ�д����һ���ַ� Ч�ʱȽϸ�
 */
public class Demo04 {
	public static void main(String[] args) {
		long begin = System.currentTimeMillis();
		//1.�����ַ���������� �����ļ�
		BufferedReader bufReader = null;
		BufferedWriter bufWriter = null;
		try {
			FileReader freader = new FileReader("3.txt");
			FileWriter fwriter = new FileWriter("4.txt");
			bufReader = new BufferedReader(freader);
			bufWriter = new BufferedWriter(fwriter);
			//2.��reader�ж�ȡ���� �� writer��д������
			String line = null;
			while((line = bufReader.readLine())!=null){
				bufWriter.write(line);
				bufWriter.newLine();
			}
			bufWriter.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//3.�ر���
			if (bufReader != null) {
				try {
					bufReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				} 
			}
			if (bufWriter != null) {
				try {
					bufWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				} 
			}
			long end = System.currentTimeMillis();
			System.out.println(end - begin);
		}
	}
}
