package cn.tedu.baozhuang;

public class IntegerDemo2 {

	public static void main(String[] args) {

		// 在自动封箱过程中使用的valueOf方法
		// 对于整数类型而言，在自动封箱的时候会有范围判断
		// 如果范围在-128~127之间，那么返回的是数组中的值
		// 如果超过这个范围，返回一个新的对象
		// Integer i1 = 127;
		// Integer i2 = 127;

		// System.out.println(i1 == i2);

		Integer in = new Integer(5);
		int i = 5;
		// 如果基本类型和对应的引用类型进行运算，那么引用类型的对象会进行自动拆箱
		System.out.println(in == i);
	}

}
