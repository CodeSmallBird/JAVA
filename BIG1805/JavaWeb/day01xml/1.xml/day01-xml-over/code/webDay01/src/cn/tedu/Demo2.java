package cn.tedu;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import cn.tedu.utils.XMLUtils;

public class Demo2 {
	public static void main(String[] args) throws DocumentException, IOException {
//		2.��ѯ�ڶ�������ۼۣ������������̨
		//findPrice();
		//3.����һ�������һ���ؼ۽ڵ㣨2�ַ�ʽ��
		//addPrice2();
		//4.���ڶ����������߽ڵ�ǰ����һ���ؼ۽ڵ�
		//��ȡdom
		Document dom = XMLUtils.getDom("book.xml");
		//��ȡ�ڶ�����
		Element bookEle2 = (Element) dom.getRootElement().elements().get(1);
		//��������Ԫ��
		Element price2 = DocumentHelper.createElement("�ؼ�");
		price2.setText("8.8Ԫ");
		//��ȡ�ڶ������list
		List list = bookEle2.elements();
		list.add(1, price2);
		
		//д��xml
		XMLUtils.write2xml(dom, "book.xml");
		
		System.out.println("ִ�����");
		
	}

	private static void addPrice2() throws UnsupportedEncodingException, FileNotFoundException, IOException {
		//��ȡdom
		Document dom = XMLUtils.getDom("book.xml");
		//��ȡ������ȡ��һ����
		Element bookEle = dom.getRootElement().element("��");
		
		//����һ��
		/*Element price2 = bookEle.addElement("�ؼ�");
		price2.setText("28.8Ԫ");*/
		//������:����һ�������element���ٽ������element��ӵ���Ԫ��
		Element price3 = DocumentHelper.createElement("�ؼ�");
		price3.setText("26.6Ԫ");
		bookEle.add(price3);
		
		//��document����д��xml��
		XMLWriter writer = new XMLWriter(
				new FileOutputStream(new File("book.xml")),
				OutputFormat.createPrettyPrint());
		writer.write(dom);
		writer.close();
	}

	private static void findPrice() throws DocumentException {
		//����������
		SAXReader reader = new SAXReader();
		//��ȡDocument����
		Document dom = reader.read("book.xml");
		//��ȡ��Ԫ��
		Element root = dom.getRootElement();
		//��ȡ��Ԫ��������Ԫ��
		List<Element> list = root.elements();
		//��ȡ�ڶ�����
		Element bookEle2 = list.get(1);
		//��ȡ�ۼ۽ڵ�
		Element price = bookEle2.element("�ۼ�");
		//��ȡ�ۼ�
		String text = price.getTextTrim();
		
		System.out.println(text);
	}
}
