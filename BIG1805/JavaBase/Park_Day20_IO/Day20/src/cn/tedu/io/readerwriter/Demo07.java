package cn.tedu.io.readerwriter;

import java.io.FileWriter;
import java.io.StringReader;

/**
 * StringReader����
 * ��һ���ַ�����Ϊ������Դ ͨ��StringReader��ȡ��ͨ��FileWriterд�����ļ���
 */
public class Demo07 {
	public static void main(String[] args) throws Exception {
		String str = "my name is park,i am so shuai,do you like me";
		StringReader reader = new StringReader(str);
		FileWriter writer = new FileWriter("5.txt");
		int i = -1;
		while((i = reader.read())!=-1){
			writer.write(i);
		}
		writer.flush();
		reader.close();
		writer.close();
	}
}
