package cn.tedu.math;

public class MathDemo {

	public static void main(String[] args) {

		// System.out.println(Math.E);

		// 向上取整
		// System.out.println(Math.ceil(3.05));

		// 向下取整
		// System.out.println(Math.floor(-8.79));

		// 四舍五入
		// System.out.println(Math.round(4.46));

		// 获取一个[0,1)的随机小数
		// System.out.println(Math.random());

		// 获取30-70之间的随机整数
		// int i = (int) (Math.random() * 41 +30);
		// System.out.println(i);

		// 0.15%
		for (int i = 0; i < 10000; i++)
			if (Math.random() * Math.random() > 0.95) {
				System.out.println("亲，恭喜您，中奖了~~~");
			}
	}

}
