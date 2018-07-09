package cn.tedu.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo2 {

	public static void main(String[] args) {

		// ����try֮���������Ҹ�һ����ʼֵΪnull
		FileWriter writer = null;
		try {
			// ����try֮�ڳ�ʼ��
			writer = new FileWriter("E:\\b.txt");
			writer.write("abc");

			// �Է�����ʧ�ܵ������ݲ�����ʧ����
			writer.flush();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// �ж��������Ƿ��ʼ���ɹ�
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					// �������ʧ�ܣ���ôǿ�ƻ�������������ͷ��ļ�
					// ��������ɹ����ͷ���������ռ�õ��ڴ�
					writer = null;
				}
			}
		}

	}

}
