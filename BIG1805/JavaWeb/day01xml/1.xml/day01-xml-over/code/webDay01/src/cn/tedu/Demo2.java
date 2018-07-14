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
//		2.查询第二本书的售价，并输出到控制台
		//findPrice();
		//3.给第一本书添加一个特价节点（2种方式）
		//addPrice2();
		//4.给第二本书在作者节点前插入一个特价节点
		//获取dom
		Document dom = XMLUtils.getDom("book.xml");
		//获取第二本书
		Element bookEle2 = (Element) dom.getRootElement().elements().get(1);
		//创建游离元素
		Element price2 = DocumentHelper.createElement("特价");
		price2.setText("8.8元");
		//获取第二本书的list
		List list = bookEle2.elements();
		list.add(1, price2);
		
		//写入xml
		XMLUtils.write2xml(dom, "book.xml");
		
		System.out.println("执行完成");
		
	}

	private static void addPrice2() throws UnsupportedEncodingException, FileNotFoundException, IOException {
		//获取dom
		Document dom = XMLUtils.getDom("book.xml");
		//获取根并获取第一本书
		Element bookEle = dom.getRootElement().element("书");
		
		//方法一：
		/*Element price2 = bookEle.addElement("特价");
		price2.setText("28.8元");*/
		//方法二:创建一个游离的element，再将游离的element添加到父元素
		Element price3 = DocumentHelper.createElement("特价");
		price3.setText("26.6元");
		bookEle.add(price3);
		
		//将document对象写到xml中
		XMLWriter writer = new XMLWriter(
				new FileOutputStream(new File("book.xml")),
				OutputFormat.createPrettyPrint());
		writer.write(dom);
		writer.close();
	}

	private static void findPrice() throws DocumentException {
		//创建解析器
		SAXReader reader = new SAXReader();
		//获取Document对象
		Document dom = reader.read("book.xml");
		//获取根元素
		Element root = dom.getRootElement();
		//获取根元素下所有元素
		List<Element> list = root.elements();
		//获取第二本书
		Element bookEle2 = list.get(1);
		//获取售价节点
		Element price = bookEle2.element("售价");
		//获取售价
		String text = price.getTextTrim();
		
		System.out.println(text);
	}
}
