package cn.tedu.assertion;

public class AssertDemo {

	public static void main(String[] args) {

		int i = 5;

		i += i <<= i / 3;

		// 断言 --- 如果断言成功，继续往下执行；如果断言失败，就此停止
		// assert i > 20 ;
		assert i > 20 : "预测结果应该是一个大于20的数字，但实际上是" + i;

		System.out.println(i);

	}

}
