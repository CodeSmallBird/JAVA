package cn.tedu.file;

import java.io.File;

public class FileExer2 {

	static int javaCount = 0;
	static int classCount = 0;

	public static void main(String[] args) {

		File file = new File("E:\\workspace");

		count(file);

		System.out.println("java�ļ���" + javaCount);
		System.out.println("class�ļ���" + classCount);

	}

	private static void count(File file) {

		// �жϲ����Ƿ�Ϊ��
		if (file == null)
			throw new NullPointerException();

		// �ж�file�Ƿ�ΪĿ¼
		if (file.isDirectory()) {

			// ��ȡ���е���Ŀ¼�����ļ�
			File[] fs = file.listFiles();
			for (File f : fs) {
				count(f);
			}

		} /* ���file����Ŀ¼��ô�����ļ� */ else if (file.getName().endsWith(".java")) {
			javaCount++;
		} else if (file.getName().endsWith(".class")) {
			classCount++;
		}

	}

}
