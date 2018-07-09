package cn.tedu.io.seria;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * ObjectInputStream ʵ�ַ����л�
 */
public class Demo02 {
	public static void main(String[] args) throws Exception {
		//1.���������� ��ȡ���л��ļ� ��װΪObjectInputStream
		ObjectInputStream oin = new ObjectInputStream(new FileInputStream("1.data"));
		//2.��ObjectInputStream�ж�ȡ������Ϣ
		Person p = (Person) oin.readObject();
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getPsw());
		//3.�ر���
		oin.close();
	}
}
