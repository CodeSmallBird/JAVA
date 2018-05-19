package cn.tedu.exception;

public class ExceptionDemo7 {

	public static void main(String[] args) {

		System.out.println(m());

	}

	private static int m() {

		int i = 5;

		// 代码是从上到下依次编译执行的
		try {
			// 在计算区域将i的值5标记为结果，i继续运算，i自增为6
			return i++;
		} finally {
			// i自增为7
			i++;
			System.out.println("finally:" + i);
		}

	}

}
