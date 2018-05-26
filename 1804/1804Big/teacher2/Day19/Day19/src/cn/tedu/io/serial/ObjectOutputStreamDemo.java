package cn.tedu.io.serial;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo {

	public static void main(String[] args) throws Exception {

		Person p = new Person();
		p.setName("�仨");
		p.setAge(16);
		p.setWeight(90);
		// p.hobby = "˯��~~~";

		// �������л�������
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("E:\\p.data"));

		// ���л�����
		out.writeObject(p);

		// ����
		out.close();

	}

}
