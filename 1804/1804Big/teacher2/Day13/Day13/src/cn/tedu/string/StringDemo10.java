package cn.tedu.string;

public class StringDemo10 {
	
	public static void main(String[] args) {
		
		// int i = 5;
		// System.out.println(String.valueOf(i));
		
		Object o = new Object();
		// 打印一个对象底层首先调用的是String.valueOf
		// String.valueOf---在底层调用了对象的toString
		System.out.println(o.toString());
		System.out.println(String.valueOf(o));
		
		char[] cs = {'a','d','f'};
		System.out.println(String.valueOf(cs));
		System.out.println(cs.toString());
	}

}
