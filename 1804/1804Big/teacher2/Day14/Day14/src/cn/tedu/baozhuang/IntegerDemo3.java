package cn.tedu.baozhuang;

public class IntegerDemo3 {

	public static void main(String[] args) {

		// 将字符串转为整数
		// String str = "126";
		// Integer in = new Integer(str);
		// System.out.println(in);

		// 只要不是true，那么结果就是false
		Boolean b = new Boolean("tRuE");
		System.out.println(b);
		
		// 将字符串转化为整数
		int i = Integer.parseInt("124");
		System.out.println(i);
		
		// 将整数转化为二进制字符串(补码)
		System.out.println(Integer.toBinaryString(-10));
	}

}
