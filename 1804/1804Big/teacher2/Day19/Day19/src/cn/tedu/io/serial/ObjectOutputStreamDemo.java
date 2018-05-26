package cn.tedu.io.serial;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo {

	public static void main(String[] args) throws Exception {

		Person p = new Person();
		p.setName("翠花");
		p.setAge(16);
		p.setWeight(90);
		// p.hobby = "睡觉~~~";

		// 创建序列化流对象
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("E:\\p.data"));

		// 序列化对象
		out.writeObject(p);

		// 关流
		out.close();

	}

}
