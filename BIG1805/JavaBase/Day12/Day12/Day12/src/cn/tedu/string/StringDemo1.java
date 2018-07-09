package cn.tedu.string;

public class StringDemo1 {

	public static void main(String[] args) {

		// 直接指向对象在常量池的地址
		String str1 = "ab";
		// 指向了堆内存，堆内存指向了常量池
		String str2 = new String("ab");
		// 因为"a"和"b"是字面量
		// 对于字面量的运算，为了提高效率，在编译时期会自动运算
		// 所以这句话编译完成之后就是String str3 = "ab";
		String str3 = "a" + "b";

		// 使用+拼接两个字符串，底层实际上调用了StringBuilder中的append方法
		String str4 = "a";
		// str4 = new StringBuilder(str4).append("b").toString();
		str4 = str4 + "b";

		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str1 == str4);
		System.out.println(str2 == str4);

	}

}
