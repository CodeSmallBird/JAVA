package cn.tedu.io.readerwriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * ͨ���ַ��� �����ı��ļ�
 * ��1.txt�п���һ���ַ� ��д��һ���ַ�
 * ���ݲ������ڴ���жѻ� ��ʹ�ļ��ǳ��Ĵ� ����Ҳ������������ ����ķѹ�����ڴ�
 * ��ѭ���Ĺ����� ÿ�ζ�д����һ���ַ� Ч�ʱȽϵ�
 */
public class Demo02 {
	public static void main(String[] args) {
		long begin = System.currentTimeMillis();
		//1.�����ļ��ַ� ����\��� ������Ҫ�������ļ�
		FileReader reader = null;
		FileWriter writer = null;
		try {
			reader = new FileReader("3.txt");
			writer = new FileWriter("4.txt");
			//2.ͨ��reader�ж�ȡ�ַ����� ֱ��д����Writer�� ��һ���д��һ�� �����ڴ��жѻ� ��ʡ�ڴ�ռ�
			int i = -1;
			while((i=reader.read())!=-1){
				writer.write(i);
			}
			writer.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//3.�ر���
			if(reader!=null){
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(writer!=null){
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
