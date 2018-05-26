package cn.tedu.io.transform;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {

	public static void main(String[] args) throws Exception {

		// �ײ��ȡ���ݵ���FileInputStream
		// ��ȡ�����������ַ���ʽ
		// �ײ��ǽ��ֽ�ת��Ϊ�ַ�
		// InputStreamReader reader = new InputStreamReader(new
		// FileInputStream("E:\\a.txt"));
		InputStreamReader reader = new InputStreamReader(new FileInputStream("E:\\a.txt"), "utf-8");

		char[] cs = new char[6];
		int len = -1;
		while ((len = reader.read(cs)) != -1) {
			System.out.println(new String(cs, 0, len));
		}

		reader.close();
	}

}
