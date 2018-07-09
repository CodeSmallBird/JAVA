package cn.tedu.exception;

public class ExceptionDemo7 {

	public static void main(String[] args) {

		System.out.println(m());

	}

	public static int m() {

		int i = 6;

		try {
			// 程序依然是从上到下依次编译执行的
			// 由于++在后所以会先把i的值6取出来，作为结果进行标记 --- 此时将6标记为了结果
			// return 6; --- 在return之前，去检查是否有其他的操作需要执行
			// 如果有其他的操作需要执行，那么这个返回的操作会被暂时挂起
			// i -> 7
			// 当finally执行完成之后，return结果之前的所有操作都已经执行完了
			// 执行返回操作return，需要将结果返回，此时标记的结果是6，所以返回的也是6
			return i++;
		} finally {
			// i->8
			i++;
			System.out.println("finally:" + i);
		}

	}

}
