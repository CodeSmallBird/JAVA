package cn.tedu.exception;

public class ExceptionDemo4 {

	public static void main(String[] args) {

	}

	@SuppressWarnings("finally")
	public static int m() {

		try {
			// return 1;
		} catch (Exception e) {
			e.printStackTrace();
			// return 1;
		} finally {
			return 1;
		}

		// return 1;
	}

}
