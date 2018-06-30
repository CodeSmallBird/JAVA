package cn.tedu.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo2 {

	public static void main(String[] args) {

		// 放在try之外声明并且给一个初始值为null
		FileWriter writer = null;
		try {
			// 放在try之内初始化
			writer = new FileWriter("E:\\b.txt");
			writer.write("abc");

			// 以防关流失败导致数据产生丢失现象
			writer.flush();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 判断流对象是否初始化成功
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					// 如果关流失败，那么强制回收这个对象，以释放文件
					// 如果关流成功，释放流对象所占用的内存
					writer = null;
				}
			}
		}

	}

}
