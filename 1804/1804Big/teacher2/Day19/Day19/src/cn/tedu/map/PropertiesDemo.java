package cn.tedu.map;

import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws Exception {

		Properties prop = new Properties();

		// ��Ӽ�ֵ��
		prop.setProperty("����", "������");
		prop.setProperty("����", "35");
		prop.setProperty("�Ա�", "Ů");

		// �־û����ӳ��
		// Properties����ֻ�ܴ洢��.properties�ļ���
		// �ڶ���������ʾ������properties�ļ��������ע��
		// ���ע����������˵�����properties�ļ�������
		prop.store(new FileOutputStream("p.properties"), "This is a person~~~");

	}

}
