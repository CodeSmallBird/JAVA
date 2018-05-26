package cn.tedu.io.sequence;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceInputStreamDemo {

	public static void main(String[] args) throws Exception {

		// �ֱ𴴽�������ָ��ͬ���ļ�
		FileInputStream in1 = new FileInputStream("E:\\a.txt");
		FileInputStream in2 = new FileInputStream("E:\\b.txt");
		FileInputStream in3 = new FileInputStream("E:\\c.txt");

		// �������϶������洢�⼸��������
		Vector<InputStream> ins = new Vector<>();
		ins.add(in1);
		ins.add(in2);
		ins.add(in3);

		// ������ת��Ϊ������
		Enumeration<InputStream> e = ins.elements();

		// ���õ���������һ���ϲ�������
		SequenceInputStream sis = new SequenceInputStream(e);

		// ����һ�������ָ��Ҫ��ŵ��ļ�
		FileOutputStream out = new FileOutputStream("E:\\test.txt");

		// ��ȡ����
		byte[] bs = new byte[10];
		int len = -1;
		while ((len = sis.read(bs)) != -1) {
			out.write(bs, 0, len);
		}

		// ����
		sis.close();
		out.close();

	}

}
