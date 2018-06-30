package cn.tedu.io;

import java.io.FileWriter;

public class FileWriterDemo3 {

	public static void main(String[] args) {

		// ��JDK1.7��ʼ��������try֮��ʹ��()������Դ
		// try����֮����Զ�����
		// try()�еĶ����Ӧ�������ʵ��AutoCloseable
		try (FileWriter writer = new FileWriter("E:\\c.txt")) {

			writer.write("abc");
			writer.flush();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
