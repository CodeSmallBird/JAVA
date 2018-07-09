package cn.tedu.object;

public class ObjectDemo1 implements Cloneable {

	int i;

	public static void main(String[] args) throws Exception {

		ObjectDemo1 od1 = new ObjectDemo1();
		od1.i = 5;

		// 克隆一个对象
		ObjectDemo1 od2 = (ObjectDemo1) od1.clone();
		System.out.println(od2.i);
		
		System.out.println(od1);
		System.out.println(od2);
		
		Object o = "abc";
		// 获取的对象的实现类
		System.out.println(o.getClass());

	}

}
