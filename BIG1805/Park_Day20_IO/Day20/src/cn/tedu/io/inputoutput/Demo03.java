package cn.tedu.io.inputoutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * ���ֽ����ķ�ʽʵ���ļ��Ŀ���
 * ��������еĿ��� �Ƚ��ļ�ȫ����ȡ���ڴ��е��ֽ������� ��������д��
 * ��Ȼ������ɿ��� ����������Ҫ��ȫ�������ڴ� �ķ��ڴ� ����ļ�̫�� ���������޷�ִ��
 */
public class Demo03 {
	public static void main(String[] args) {
		InputStream in = null;
		OutputStream out = null;
		try {
			//1.�������ֽ������� �� �ֽ������
			in = new FileInputStream("1.txt");
			out = new FileOutputStream("7.txt");
			//2.���������ж�ȡ����
			int len = in.available();
			byte [] data = new byte[len];
			in.read(data);
			//3.���������д������
			out.write(data);
			//4.�ر���
			out.flush();
			in.close();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(in!=null){
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(out!=null){
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
