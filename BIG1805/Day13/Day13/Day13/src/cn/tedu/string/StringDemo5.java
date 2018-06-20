package cn.tedu.string;

public class StringDemo5 {

	public static void main(String[] args) {

		// String str = " \tsdhlanl\r\n\t";

		// 表示去掉头部和尾部的空白字符
		// System.out.println(str);
		// System.out.println(str.trim());

		// 表示参数转化为字符串来显示
		// System.out.println(String.valueOf(12));
		// Object o = new Object();
		// System.out.println(String.valueOf(o));
		// System.out.println(o);
		
		char[] cs = {'a','b','c'};
		System.out.println(String.valueOf(cs));
		System.out.println(cs.toString());

	}

}
