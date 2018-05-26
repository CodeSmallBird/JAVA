package cn.tedu.io.transform;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {

	public static void main(String[] args) throws Exception {

		// 是以字符形式将数据传入
		// 底层是靠FileOutputStream将数据写到文件中
		// 将字符转换为字节
		// OutputStreamWriter ow = new OutputStreamWriter(new
		// FileOutputStream("E:\\a.txt"));
		OutputStreamWriter ow = new OutputStreamWriter(new FileOutputStream("E:\\a.txt"), "utf-8");

		ow.write("字节流");

		ow.close();
	}

}
