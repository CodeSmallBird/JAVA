package cn.tedu.baozhuang;

public class IntegerDemo1 {

	public static void main(String[] args) {

		// int i = 5;
		// 将基本类型的变量转化为了引用类型的对象---封箱/装箱
		// Integer in = new Integer(i);
		// System.out.println(in);

		// int i = 3;
		// 将基本类型的变量直接赋值给了引用类型的对象---自动封箱 --- 1.5的特性之一
		// 实际上是调用了valueOf方法
		// Integer in = Integer.valueOf(i);
		// Integer in = i;
		// System.out.println(in);

		// double d = 3.1;
		// Double dou = Double.valueOf(d);
		// Double dou = d;
		// System.out.println(dou);

		Integer in = new Integer(3);
		// 将引用类型的对象直接赋值给了基本类型的变量---自动拆箱
		// 实际上是调用了***Value方法
		// int i = in.intValue();
		int i = in;
		System.out.println(i);
		
		Double dou = new Double(3.52);
		// double d = dou.doubleValue();
		double d = dou;
		System.out.println(d);
	}

}
