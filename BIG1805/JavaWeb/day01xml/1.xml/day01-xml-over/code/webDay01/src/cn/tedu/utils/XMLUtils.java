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
	 * ����xml����ȡdocument����
	 */
	public static Document getDom(String xmlPath){
		try {
			//����������
			SAXReader reader = new SAXReader();
			//��ȡDocument����
			Document dom = reader.read(xmlPath);
			return dom;
		} catch (DocumentException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	
	
	public static void write2xml(Document dom,String xmlPath){
		try {
			//��document����д��xml��
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

















