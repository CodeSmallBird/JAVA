package cn.tedu.io.inputoutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * ���ֽ�������ķ�ʽ����ֽ�����
 */
public class Demo02 {
	public static void main(String[] args) throws Exception {
		//1.׼���ֽ�����
		String str = "my name is park , i am so shuai";
		byte []  data = str.getBytes();
		//2.�����ֽ������ ������6.txt
		OutputStream out = new FileOutputStream("6.txt");
		//3.ѭ���������ݵ� �����
		for(byte b : data){
			out.write(b);
		}
		//4.ˢ��
		out.flush();
		//5.����
		out.close();
	}
}
