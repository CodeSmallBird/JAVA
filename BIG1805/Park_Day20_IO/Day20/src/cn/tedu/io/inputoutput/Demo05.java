package cn.tedu.io.inputoutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * ���ֽ����ķ�ʽʵ���ļ��Ŀ���
 * ��������еĿ��� ��ȡһ���ֽھ�д��һ���ֽ� ���ַ�ʽ ������ѭ���Ĵ��� ��������
 */
public class Demo05 {
	public static void main(String[] args) {
		long begin = System.currentTimeMillis();
		//1.�����ֽ� ���������
		InputStream in = null;
		OutputStream out = null;
		try {
			in = new FileInputStream("1.wmv");
			out = new FileOutputStream("2.wmv");
			//2.��ȡ���� ��д�� ÿ����һ���ֽ� ��д��һ���ֽ�
			int i = -1;
			byte [] data = new byte [1024];
			while((i = in.read(data))!=-1){
				out.write(data,0,i);
			}
			out.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//3.�ر���
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				} 
			}
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				} 
			}
			long end = System.currentTimeMillis();
			System.out.println(end - begin);
		}
	}
}
