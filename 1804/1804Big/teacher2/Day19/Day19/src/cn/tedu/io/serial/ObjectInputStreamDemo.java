package cn.tedu.io.serial;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo {

	public static void main(String[] args) throws Exception {

		// 创建了一个反序列化流
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("E:\\p.data"));

		// 反序列化对象
		Person p = (Person) in.readObject();

		// 关流
		in.close();

		System.out.println(p.getName());
		System.out.println(p.getAge());
	}

}
