package cn.tedu.io.transform;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {

	public static void main(String[] args) throws Exception {

		// �����ַ���ʽ�����ݴ���
		// �ײ��ǿ�FileOutputStream������д���ļ���
		// ���ַ�ת��Ϊ�ֽ�
		// OutputStreamWriter ow = new OutputStreamWriter(new
		// FileOutputStream("E:\\a.txt"));
		OutputStreamWriter ow = new OutputStreamWriter(new FileOutputStream("E:\\a.txt"), "utf-8");

		ow.write("�ֽ���");

		ow.close();
	}

}
