package cn.tedu.map;

import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.Properties;

public class PropertiesDemo2 {

	public static void main(String[] args) throws Exception {

		Properties prop = new Properties();

		// ���־û�
		prop.load(new FileInputStream("p.properties"));

		// ���ݼ�����ȡ��Ӧ��ֵ
		// String value = prop.getProperty("name");
		// String value = prop.getProperty("����", "Amy");
		// System.out.println(value);

		// ��ʾ��Properties�еļ�ֵ��ȫ����ӡ��ָ����λ��
		// prop.list(new PrintStream(System.out));
		prop.list(new PrintStream("a.txt"));

	}

}
