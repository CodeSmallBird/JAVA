public class OperatorDemo {
	
	public static void main(String[] args){
		
		// 编译不报错，因为语法没有错误
		// System.out.println(5 / 0);
		// System.out.println(-5 / 0.0);
		// System.out.println(3.4 / 0);
		// System.out.println(0.0 / 0);
		// System.out.println(0 / 0);
		
		// byte b = 5;
		// b++;
		// byte b = 123;
		// b += 10;
		// 3和5是两个字面量
		// 如果是两个字面参与运算，由于字面量的值确定的，所以在编译期间会进行优化---> byte b = 8;
		// byte b = 3 + 5;
		// byte b = 133;
		// byte b = 123 + 10;
		// System.out.println(b);
		
		// int i = 5, j = 6;
		// boolean b = false && i++ > 3 || ++j > 2;
		// boolean b = true || i++ > 5 && ++j > 10;
		// System.out.println(i);
		// System.out.println(j);
		// System.out.println(b);
		
		// System.out.println(-5 << 3);
		// System.out.println(20 << 34);
		System.out.println(-5>>>1);
		System.out.println(-20>>>1);
		
	}
	
}