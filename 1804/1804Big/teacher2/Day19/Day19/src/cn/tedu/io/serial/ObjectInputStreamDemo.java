package cn.tedu.io.serial;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo {

	public static void main(String[] args) throws Exception {

		// ������һ�������л���
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("E:\\p.data"));

		// �����л�����
		Person p = (Person) in.readObject();

		// ����
		in.close();

		System.out.println(p.getName());
		System.out.println(p.getAge());
	}

}
