package cn.tedu.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo1 {

	public static void main(String[] args) throws IOException {

		// ����һ���µ��ļ�
		// �������ļ������ڣ���Ѵ��������ļ���ΪĿ���ļ�
		// �������ļ��Ѿ����ڣ��򴴽����ļ�����ԭ�ļ�
		FileWriter writer = new FileWriter("E:\\a.txt");

		// д������
		// ���ݲ�����ֱ��д���ļ��ж���д����������
		// ���ݻ��ڻ������У�Ȼ���������� ---�����������ڻ���������
		writer.write("def");

		// ��ˢ������
		// writer.flush();

		// �ر���
		// ����֮ǰ���Զ���ˢһ�λ����� --- Ϊ�˷�ֹ���������ڻ�����
		writer.close();

		// Ϊ���ͷ��ڴ�
		writer = null;

		System.out.println(writer);

	}

}
