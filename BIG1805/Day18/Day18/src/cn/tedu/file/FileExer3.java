package cn.tedu.file;

import java.io.File;
import java.io.FilenameFilter;

public class FileExer3 {

	static File DOCX = new File("E:\\DOCX");

	public static void main(String[] args) {

		File file = new File("E:\\aaa");

		get(file);

	}

	private static void get(File file) {

		if (file == null)
			throw new NullPointerException();

		if (file.isDirectory()) {

			// ��ȡ���Ŀ¼�µ����е����ļ�����Ŀ¼
			File[] fs = file.listFiles();
			for (File f : fs) {
				get(f);
			}

		} else if (file.getName().endsWith(".docx")) {

			// file --- �ʼ�.docx
			String fileName = file.getName();
			// �� . ���һ�γ��ֵ�λ��
			int index = fileName.lastIndexOf(".");
			// �ļ�����������
			final String fname = fileName.substring(0, index);
			// ��׺��
			final String suffix = fileName.substring(index);
			// ��Ϊ�ļ��Ǵ洢��DOCXĿ¼�У�������ҪɸѡDOCXĿ¼�����ֽṹһ�µ��ļ�
			File[] fs = DOCX.listFiles(new FilenameFilter() {
				@Override
				public boolean accept(File dir, String name) {
					// �ʼ�.docx �ʼ�-1.docx  �ʼ�-2.docx
					return name.matches(fname + "(-\\d+)?" + suffix);
				}
			});
			// ���ļ�Ų��DOCXĿ¼��
			file.renameTo(new File(DOCX, fname + 
					(fs.length > 0 ? "-" + fs.length : "") + suffix));
		}

	}

}
