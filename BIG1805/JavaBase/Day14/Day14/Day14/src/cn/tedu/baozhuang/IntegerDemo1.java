package cn.tedu.baozhuang;

public class IntegerDemo1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// int i = 5;
		// 利用基本类型的变量来构建了对应的引用类型的对象 --- 封箱
		// Integer in = new Integer(i);
		// 底层重写了toString方法
		// System.out.println(in);

		// 自动封箱/拆箱是JDK1.5的特性之一
		// 将一个基本类型的变量直接赋值给对应的引用类型的对象 --- 自动封箱
		// 自动封箱而言，底层实际上是调用Integer中的valueOf
		// Integer in = Integer.valueOf(i);
		// Integer in = i;

		// Double d = Double.valueOf(3.3);
		// Double d = 3.3;

		// Character c = Character.valueOf('f');
		// Character c = 'f';

		Integer in = new Integer(5);
		// 将引用类型的对象直接赋值给了对应的基本类型的变量 --- 自动拆箱
		// 在底层实际上是调用了对应对象身上的***Value方法
		// int i2 = in.intValue();
		int i2 = in;
		
		Double dou = new Double(3.1);
		// double d = dou.doubleValue();
		double d = dou;

		Boolean bo = new Boolean(true);
		// boolean b = bo.booleanValue();
		boolean b = bo;
		
		Character ch = new Character('f');
		// char c = ch.charValue();
		char c = ch;
	}

}
