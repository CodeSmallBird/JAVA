package cn.tedu;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Demo1 {
	public static void main(String[] args) throws DocumentException {
		//创建解析器
		SAXReader reader = new SAXReader();
		//将xml文档解析成Document对象
		Document dom = reader.read("book.xml");
		//获取根元素
		Element root = dom.getRootElement();
		//获取第一本书
		Element bookEle = root.element("书");
		//获取第一本书的书名元素
		Element bookName = bookEle.element("作者");
		//获取书名
		String text = bookName.getText();
		System.out.println("第一本书的书名为："+text);
	}
}








