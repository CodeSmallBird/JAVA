package cn.tedu.io.seria;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * ObjectInputStream 实现反序列化
 */
public class Demo02 {
	public static void main(String[] args) throws Exception {
		//1.创建输入流 读取序列化文件 包装为ObjectInputStream
		ObjectInputStream oin = new ObjectInputStream(new FileInputStream("1.data"));
		//2.从ObjectInputStream中读取对象信息
		Person p = (Person) oin.readObject();
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getPsw());
		//3.关闭流
		oin.close();
	}
}
