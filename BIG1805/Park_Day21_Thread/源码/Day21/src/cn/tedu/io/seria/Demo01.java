package cn.tedu.io.seria;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * ObjectOutputStream ʵ�����л�
 */
public class Demo01 {
	public static void main(String[] args) throws Exception {
		Person p = new Person("zhangsan",18,"666999");
		//1.����ObjectOutputStream
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("1.data"));
		//2.ͨ��ObjectOutputStream������д��
		oos.writeObject(p);
		//3.�ر���
		oos.flush();
		oos.close();
	}
}
