package cn.tedu.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class XMLUtils {
	
	/**
	 * 解析xml，获取document对象
	 */
	public static Document getDom(String xmlPath){
		try {
			//创建解析器
			SAXReader reader = new SAXReader();
			//获取Document对象
			Document dom = reader.read(xmlPath);
			return dom;
		} catch (DocumentException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	
	
	public static void write2xml(Document dom,String xmlPath){
		try {
			//将document对象写到xml中
			XMLWriter writer = new XMLWriter(
					new FileOutputStream(new File(xmlPath)),
					OutputFormat.createPrettyPrint());
			writer.write(dom);
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
}

















