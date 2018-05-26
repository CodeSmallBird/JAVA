package cn.tedu.io.buffer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class CountLineDemo {

	// ��¼����
	static int count = 0;

	public static void main(String[] args) throws Exception {

		// ָ�����ռ�
		File file = new File("E:\\workspace");

		count(file);
		
		System.out.println(count);

	}

	private static void count(File file) throws Exception {
		// �жϲ����Ƿ�Ϊ��
		if (file == null)
			throw new NullPointerException();

		// �ж��Ƿ���һ��Ŀ¼
		if (file.isDirectory()) {

			// ��ȡ���е���Ŀ¼�����ļ�
			File[] fs = file.listFiles();
			for (File f : fs) {
				count(f);
			}

		} else if (file.getName().endsWith(".java")) {

			BufferedReader reader = new BufferedReader(new FileReader(file));

			while (reader.readLine() != null)
				count++;

			reader.close();

		}

	}

}
