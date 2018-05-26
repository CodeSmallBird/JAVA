package cn.tedu.assertion;

public class AssertDemo {

	public static void main(String[] args) {

		int i = 5;

		i += 7;

		// 会对结果进行断言
		// 如果断言成功，那么程序会继续往下执行
		// 如果断言失败，则会就此停止
		// assert i < 10;
		assert i < 10 : "值应该小于10，但是实际值是" + i;

		System.out.println(i);
	}

}
