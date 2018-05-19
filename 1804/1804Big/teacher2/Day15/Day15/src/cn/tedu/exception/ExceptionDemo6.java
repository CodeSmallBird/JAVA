package cn.tedu.exception;

public class ExceptionDemo6 {

	public static void main(String[] args) {

		// try {
		// System.out.println(1 / 0);
		// } catch (Exception e) {
		// e.printStackTrace();
		// } finally {
		// System.out.println("执行了一次~~~");
		// }

		System.out.println(m());

	}

	@SuppressWarnings("finally")
	public static int m() {

		try {
			return 1;
		} catch (Exception e) {
			return 2;
		} finally {
			try {
				return 3;
			} finally {
				return 4;
			}
			// return 5;
		}

	}

}
