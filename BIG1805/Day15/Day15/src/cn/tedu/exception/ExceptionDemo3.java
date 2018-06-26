package cn.tedu.exception;

//import java.sql.SQLException;

public class ExceptionDemo3 {

	public static void main(String[] args) {

		try {
			test();
		} catch (NullPointerException e) {
			// 打印异常的栈轨迹
			e.printStackTrace();
			System.out.println("处理异常中~~~");
		} catch (ArithmeticException e) {
			System.out.println("算术异常~~~");
		} /*catch (SQLException e) {
		}*/
		
		System.out.println("hi~~~");
	}

	public static void test() {

		// 异常抛出之后后续代码无法继续执行
		throw new NullPointerException();

//		System.out.println("hello~~~");
	}

}
