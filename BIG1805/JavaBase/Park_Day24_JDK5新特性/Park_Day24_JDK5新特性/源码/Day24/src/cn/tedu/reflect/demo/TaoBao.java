package cn.tedu.reflect.demo;

import java.io.FileInputStream;
import java.util.Properties;

import cn.tedu.reflect.Person;

public class TaoBao {
	//TaoBaoDao_File dao = new TaoBaoDao_File();
	//TaoBaoDao_DB dao = new TaoBaoDao_DB();
	
	private static TaoBaoDaoInterf dao = null;
	
	static{
		try {
			//1.����Properties
			Properties prop = new Properties();
			//2.�������ļ��м���
			FileInputStream in = new FileInputStream("taobao.properties");
			prop.load(in);
			//3.�������ļ��ж�ȡ ��ǰ����Ҫ���ĸ�TaoBaoDaoInterf��ʵ������Ϊ���ݴ洢λ��
			String clzName = prop.getProperty("TaoBaoDaoInterf");
			//4.��������ֽ���
			Class clz = Class.forName(clzName);
			//5.ͨ�����䴴������Ķ���ֵ
			dao = (TaoBaoDaoInterf) clz.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	public void buy(){
		//--�������ݴ洢���� �洢�����¼
		dao.add("�����¼���������� ������һ�������ӡ�����");
	}
	public void pay(){
		//--�������ݴ洢���� �洢֧����¼
		dao.add("�����¼���������� ����10��Ǯ������");
	}
	
	public static void main(String[] args) {
		TaoBao tb = new TaoBao();
		tb.buy();
		tb.pay();
	}
}
