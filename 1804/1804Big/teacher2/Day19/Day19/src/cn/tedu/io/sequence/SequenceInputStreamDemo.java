package cn.tedu.io.sequence;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceInputStreamDemo {

	public static void main(String[] args) throws Exception {

		// 分别创建输入流指向不同的文件
		FileInputStream in1 = new FileInputStream("E:\\a.txt");
		FileInputStream in2 = new FileInputStream("E:\\b.txt");
		FileInputStream in3 = new FileInputStream("E:\\c.txt");

		// 创建集合对象来存储这几个流对象
		Vector<InputStream> ins = new Vector<>();
		ins.add(in1);
		ins.add(in2);
		ins.add(in3);

		// 将集合转化为迭代器
		Enumeration<InputStream> e = ins.elements();

		// 利用迭代器构建一个合并流对象
		SequenceInputStream sis = new SequenceInputStream(e);

		// 创建一个输出流指向要存放的文件
		FileOutputStream out = new FileOutputStream("E:\\test.txt");

		// 读取数据
		byte[] bs = new byte[10];
		int len = -1;
		while ((len = sis.read(bs)) != -1) {
			out.write(bs, 0, len);
		}

		// 关流
		sis.close();
		out.close();

	}

}
