package cn.tedu.file;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {

	public static void main(String[] args) throws IOException {

		// file�������E���µ�a.txt�ļ�
		// ��ʹ�ļ������ڣ�Ҳ������ --- �����·�����Ϊ��һ���ļ����󣬶���ȥ�������ļ��Ƿ����
		File file = new File("E:\\a");

		// ������ļ������ڵ�ʱ�򣬲Ŵ����ļ�
		// ֻ�ܴ����ļ����ܴ���Ŀ¼
		// �����ļ���ʱ��Ҫ���ŵ�·��������ʵ����
		// boolean b = file.createNewFile();

		// ��Ŀ¼�����ڵ�ʱ�򣬲��ܴ���Ŀ¼
		// ֻ�ܴ���Ŀ¼�������ܴ����ļ�
		// ֻ�ܴ���һ��Ŀ¼
		// boolean b = file.mkdir();
		// �����༶Ŀ¼
		// boolean b = file.mkdirs();

		// ɾ���ļ���Ŀ¼
		// �Ӽ�����г����Ƴ�����һ��������Ĳ���
		// ��ɾ��Ŀ¼��ʱ��Ҫ��Ŀ¼��û�����ļ�������Ŀ¼
		boolean b = file.delete();

		System.out.println(b);

	}

}
