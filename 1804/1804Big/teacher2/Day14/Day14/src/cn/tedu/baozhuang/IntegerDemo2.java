package cn.tedu.baozhuang;

public class IntegerDemo2 {

	public static void main(String[] args) {

		// 对于自动封箱而言，在 -128~127之间的时候返回的是IntegerCache.cache数组中的对应的值
		// 如果超过了这个范围，返回一个新的new Integer(i)对象
		// 所以只有整数有范围判断
		Integer i1 = -130; // cache[127] new Integer(-130)
		Integer i2 = -130; // cache[127] new Integer(-130)

		System.out.println(i1 == i2);

		int i = -130;
		// 如果包装类和对应的基本类型运算，那么会自动拆箱
		System.out.println(i1 == i);

	}

}
