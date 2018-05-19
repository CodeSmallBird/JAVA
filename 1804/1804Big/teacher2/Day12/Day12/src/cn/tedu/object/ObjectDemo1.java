package cn.tedu.object;

public class ObjectDemo1 implements Cloneable {

	int i;

	public static void main(String[] args) throws Exception {

		ObjectDemo1 o1 = new ObjectDemo1();
		o1.i = 7;

		// 克隆是产生一个新的对象
		ObjectDemo1 o2 = (ObjectDemo1) o1.clone();
		System.out.println(o2.i);
		
		System.out.println(o1 == o2);
		
		Object o = "abc";
		// 获取对象的实际类型
		System.out.println(o.getClass());
		
	}

}
