package cn.tedu.file;

import java.io.File;

public class FileExer1 {
	
	public static void main(String[] args) {
		
		File file = new File("E:\\aaa");
		
		del(file);
	}

	private static void del(File file) {
		
		// �жϲ����Ƿ�Ϊ��
		if(file == null)
			throw new NullPointerException("�ף��ļ�����Ϊ��Ŷ~~~");
		
		// �ж�file�Ƿ���һ��Ŀ¼
		if(file.isDirectory()){
			// ��ȡ���Ŀ¼�µ����е���Ŀ¼�����ļ�
			File[] fs= file.listFiles();
			// ��������
			for (File f : fs) {
				// ��Ҫ�ж�f������һ���ļ�����Ŀ¼ --- ���������͵�ǰ�����Ĺ���һ��
				del(f);
			}
		}
		
		// �������ļ�����Ŀ¼����Ҫɾ��
		file.delete();
		
	}

}
