package cn.tedu.file;

import java.io.File;

public class FileDemo3 {

	public static void main(String[] args) {

		File file = new File("a.txt");
		
		// ��ȡ����·��
		System.out.println(file.getAbsoluteFile());

		// ��ȡ���һ���޸�ʱ��
		// System.out.println(file.lastModified());

		// ���õ���Ҫ�ж��޸ĵ�ʱ���Ƿ����ڴ���ʱ��
		// file.setLastModified(78624L);

		// �жϴ��ļ��Ƿ��д
		// System.out.println(file.canWrite());

		// �ж��Ƿ���һ�������ļ�
		// System.out.println(file.isHidden());

		// �ж��Ƿ���һ������·��
		// System.out.println(file.isAbsolute());

		// �ж��ļ�����Ŀ¼�Ƿ���ʵ����
		// System.out.println(file.exists());

		// System.out.println(file.setExecutable(false));
		// System.out.println(file.setReadable(false));
		// System.out.println(file.setWritable(false));
		// ֻ�е�ǰ�û���д�������û�����д
		// System.out.println(file.setWritable(true,true));
	}

}
