package cn.tedu.io.inputoutput;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * �����ֽ�����ȡ�ļ�
 */
public class Demo01 {
	public static void main(String[] args) throws Exception {
		//1.�����ֽ������� ������1.txt
		InputStream in = new FileInputStream("1.txt");
		//2.ѭ����ȡ1.txt ֱ���ļ��Ľ�β ��ӡ����
		int i = -1;
		while((i = in.read())!=-1){
			byte b = (byte) i;
			System.out.println(b);
		}
		//3.�ر���
		in.close();
	}
}
