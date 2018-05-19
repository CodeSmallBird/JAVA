package cn.tedu.object;

public class ObjectDemo2 {

	public static void main(String[] args) {

		// Object o = new Object();
		// Object o2 = new Object();
		// Object o3 = new Object();
		// 获取对象的哈希码
		// 根据对象中的属性以及其他的系统信息进行计算
		// 哈希码在计算的时候遵循哈希算法
		// 哈希算法算出来的值是一个散列的值
		// 会相对均匀的分布在范围内
		// 人为的认为每个类产生的对象的哈希码是唯一的值
		// System.out.println(o.hashCode());
		// System.out.println(o2.hashCode());
		// System.out.println(o3.hashCode());
		
		Object o = new Object();
		
		System.out.println(o.toString());
		// 打印一个对象的时候实际上是调用了这个对象的toString方法
		System.out.println(o);

	}

}
