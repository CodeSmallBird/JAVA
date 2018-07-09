package cn.tedu.string;

public class StringDemo4 {

	public static void main(String[] args) {

		char[] cs = { 'a', 'd', 'e', 'r', 'f', 't', 'y' };

		// 将字符数组转化为字符串
		// System.out.println(cs.toString());
		// String str = new String(cs);
		// System.out.println(str);
		
		// 将字符数组中的一部分元素来转化为字符串
		String str = new String(cs, 2, 4);
		System.out.println(str);

	}

}
