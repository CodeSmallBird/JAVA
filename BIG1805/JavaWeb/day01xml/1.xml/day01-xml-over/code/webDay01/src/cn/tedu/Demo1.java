package cn.tedu;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Demo1 {
	public static void main(String[] args) throws DocumentException {
		//����������
		SAXReader reader = new SAXReader();
		//��xml�ĵ�������Document����
		Document dom = reader.read("book.xml");
		//��ȡ��Ԫ��
		Element root = dom.getRootElement();
		//��ȡ��һ����
		Element bookEle = root.element("��");
		//��ȡ��һ���������Ԫ��
		Element bookName = bookEle.element("����");
		//��ȡ����
		String text = bookName.getText();
		System.out.println("��һ���������Ϊ��"+text);
	}
}








