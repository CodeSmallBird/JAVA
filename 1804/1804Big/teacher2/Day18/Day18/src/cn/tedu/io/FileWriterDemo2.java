package cn.tedu.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo2 {

	public static void main(String[] args) {

		// try之外声明
		FileWriter writer = null;
		try {
			// try之内进行实例化
			writer = new FileWriter("E:\\b.txt");
			writer.write("def");
			// 为了防止关流失败导致一部分数据死在缓冲区中
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 判断流对象是否实例化成功
			if (writer != null)
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					// 如果关流失败则回收这个流来释放文件
					// 如果关流成功，将这个流对象标记为一个垃圾对象
					writer = null;
				}
		}

	}

}
