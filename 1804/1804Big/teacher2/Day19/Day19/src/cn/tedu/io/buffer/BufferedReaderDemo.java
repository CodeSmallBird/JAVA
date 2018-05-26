package cn.tedu.io.buffer;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderDemo {

	public static void main(String[] args) throws Exception {

		// ������ȡ�ļ�����FileReader
		// BufferedReader�Ǵ�FileReader������ȡ���ݣ�Ȼ���ṩһ��������
		BufferedReader reader = new BufferedReader(new FileReader("E:\\�ʼ�.docx"));

		// ��ȡһ������
		// String str = reader.readLine();

		// ��¼ÿһ�е�����
		String line = null;

		while ((line = reader.readLine()) != null) {
			System.out.println(line);
		}

		// ����
		// �ڹ�����ʱ��ֻ��Ҫ�ر�������������
		reader.close();
	}

}
