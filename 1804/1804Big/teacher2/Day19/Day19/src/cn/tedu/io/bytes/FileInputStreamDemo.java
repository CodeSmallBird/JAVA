package cn.tedu.io.bytes;

import java.io.FileInputStream;

public class FileInputStreamDemo {

	public static void main(String[] args) throws Exception {

		FileInputStream in = new FileInputStream("E:\\b.txt");

		// ��ȡһ���ֽ�
		// int i = in.read();
		// �����ֽ�������Ϊ������
		byte[] bs = new byte[10];

		// ����һ��������¼��ȡ�����ֽڸ���
		int len = -1;

		while ((len = in.read(bs)) != -1) {
			System.out.println(new String(bs, 0, len));
		}

		in.close();

	}

}
