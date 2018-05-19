package cn.tedu.exception;

public class ExceptionDemo3 {

	public static void main(String[] args) {

		long begin = System.currentTimeMillis();

		// System.out.println(1 / 0);

		try {
			System.out.println(1 / 0);
		} catch (Exception e) {
			e.printStackTrace();
		}

		long end = System.currentTimeMillis();
		System.out.println(end - begin);
	}

}
