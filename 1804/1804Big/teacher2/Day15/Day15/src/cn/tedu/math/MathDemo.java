package cn.tedu.math;

public class MathDemo {
	
	public static void main(String[] args) {

		// 向上取整
		System.out.println(Math.ceil(3.24));

		// 向下取整
		System.out.println(Math.floor(-3.85));

		// 四舍五入
		System.out.println(Math.round(3.52));

		// 返回0<=x<1的随机数
		System.out.println(Math.random());

		// 获取30-70之间的随机整数
		int i = (int) (Math.random() * 41 + 30);
		System.out.println(i);
	}

}
