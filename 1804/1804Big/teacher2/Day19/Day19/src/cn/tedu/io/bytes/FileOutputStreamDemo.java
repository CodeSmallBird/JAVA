package cn.tedu.io.bytes;

import java.io.FileOutputStream;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws Exception {

		// FileOutputStream out = new FileOutputStream("E:\\b.txt");
		FileOutputStream out = new FileOutputStream("E:\\b.txt", true);

		// �ֽ���û�л�����
		out.write("���".getBytes("utf-8"));

		out.close();

	}

}
