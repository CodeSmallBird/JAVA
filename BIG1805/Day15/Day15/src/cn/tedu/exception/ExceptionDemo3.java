package cn.tedu.exception;

//import java.sql.SQLException;

public class ExceptionDemo3 {

	public static void main(String[] args) {

		try {
			test();
		} catch (NullPointerException e) {
			// ��ӡ�쳣��ջ�켣
			e.printStackTrace();
			System.out.println("�����쳣��~~~");
		} catch (ArithmeticException e) {
			System.out.println("�����쳣~~~");
		} /*catch (SQLException e) {
		}*/
		
		System.out.println("hi~~~");
	}

	public static void test() {

		// �쳣�׳�֮����������޷�����ִ��
		throw new NullPointerException();

//		System.out.println("hello~~~");
	}

}
