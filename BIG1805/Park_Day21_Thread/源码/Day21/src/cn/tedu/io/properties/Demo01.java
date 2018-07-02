package cn.tedu.io.properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Properties;
/**
 * Properties��ʹ��
 * Properties�� ����ͨ�� load ���� ����һ��.properties�ļ� ���н����� ���õļ�ֵ����Ϣ
 * �ṩ��getProperties���� ���ݴ���ļ� ��ȡ ��Ӧ�����õ�ֵ
 * 
 * ��java������ �����Ὣ������Ϣд��һ��.properties�ļ��� ��ͨ�����ϵķ�������ȡ
 * �������Է�ֹ�����������䶯��������Ϣд���ڳ����� �������ṩ�˸��õ������
 */
public class Demo01 {
	public static void main(String[] args) throws Exception {
		//1.����Properties����
		Properties prop = new Properties();
		
		//2.����������Ϣ ����һ���� �����н�������Ϣ �������� prop������ ���Ѿ����� ���ļ������е����õ���Ϣ
		InputStream in = new FileInputStream("conf.properties");
		prop.load(in);
		
		//3.��prop�и��ݼ���ȡ��Ӧ��ֵ
//		String user = prop.getProperty("user");
//		System.out.println(user);
//		String psw = prop.getProperty("psw");
//		System.out.println(psw);
		
		//4.��ȡproperties�е�����������Ϣ
		Enumeration enums = prop.propertyNames();
		while(enums.hasMoreElements()){
			String key = (String) enums.nextElement();
			String value = prop.getProperty(key);
			System.out.println(key+"~"+value);
		}
		
		//5.�޸�����
//		System.out.println(prop.getProperty("psw"));
//		prop.setProperty("psw", "888");
//		System.out.println(prop.getProperty("psw"));
		
		//6.������д��
		OutputStream out = new FileOutputStream("conf.properties");
		prop.store(out, "hahaha prop change!!");

		//7.�ر���
		out.flush();
		in.close();
		out.close();
		
		while(true){}
	
	}
}
