package cn.tedu.reflect.demo2;

import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * ���䰸���������ļ������ĸ������͵����ĸ�����
 */
public class Person {
	public void say(){
		System.out.println("˵������");
	}
	public void eat(){
		System.out.println("�ԡ�����");
	}
	
	//һ����һ�������
	
	public static void main(String[] args) {
		try {
			//0.�������� ϣ�����������ļ��е����� ���ö����ϵ�ָ������
			Person p = new Person();
			//1.��ȡ�����ļ�
			Properties prop = new Properties();
			FileInputStream in = new FileInputStream("demo02.properties");
			prop.load(in);
			in.close();
			String methodName = prop.getProperty("mx");
			
			//2.����ͨ�� if elseif ���ж� ÿ�������ж�һ�� ���е���
			//��������д�� �ж��ٷ�����Ҳд���ٸ�else if �����ر���ʱ�� д�������鷳
//			if("eat".equals(methodName)){
//				p.eat();
//			}else if("say".equals(methodName)){
//				p.eat();
//			}
			
			//2.ͨ�����似�� ֱ�Ӹ��ݷ����� ���ֽ����� �����Method���� ֱ���ڵ�ǰ������ִ�и�Method����
			//ֻ�������д��� ��ʵ������ͬ�Ĺ���
			Class clz = p.getClass();
			Method m = clz.getMethod(methodName);
			m.invoke(p);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
