package cn.tedu.io.seria;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * ObjectOutputStream 实现序列化
 */
public class Demo01 {
	public static void main(String[] args) throws Exception {
		Person p = new Person("zhangsan",18,"666999");
		//1.创建ObjectOutputStream
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("1.data"));
		//2.通过ObjectOutputStream将对象写出
		oos.writeObject(p);
		//3.关闭流
		oos.flush();
		oos.close();
	}
}
