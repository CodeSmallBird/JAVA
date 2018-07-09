package cn.tedu.baozhuang;

public class IntegerDemo3 {

	public static void main(String[] args) {

		// Integer in = new Integer("291");
		// Integer in = new Integer(0x291);
		// 会依次判断每一位是否是一个数字字符
		// Integer in = new Integer("0x291");
		// System.out.println(in);

		int i = Integer.parseInt("752");
		System.out.println(i);

		// Double dou = new Double("860.4563");
		// double d = dou;
		double d = Double.parseDouble("52.78");
		System.out.println(d);

		long l = Long.parseLong("862");
		System.out.println(l);

		// char c = Character.parseChar("a");
		// "a" -> 'a'
		// char c = "a".charAt(0);
		
		Boolean b = new Boolean("TruE");
		System.out.println(b);

	}

}
