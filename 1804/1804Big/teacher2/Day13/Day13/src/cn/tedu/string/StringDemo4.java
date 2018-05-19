package cn.tedu.string;

public class StringDemo4 {

	public static void main(String[] args) {

		char[] cs = { 'd', 'e', 'h', 't', 'u', 'l', 'o' };
		
		// 将字符数组转化为字符串
		// String str = new String(cs);
		// System.out.println(str);
		
		// value---要转化的字符数组
		// offset---偏移量，要转化的起始下标
		// count---要转化的字符的个数
		String str = new String(cs, 2, 4);
		System.out.println(str);

	}

}
