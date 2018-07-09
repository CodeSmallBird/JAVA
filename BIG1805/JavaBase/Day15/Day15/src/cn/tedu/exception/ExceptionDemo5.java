package cn.tedu.exception;

public class ExceptionDemo5 {

	public static void main(String[] args) {

		// try {
		// System.out.println(1 / 1);
		// } catch (Exception e) {
		// } finally {
		// System.out.println("running~~~");
		// }
		
		System.out.println(m());

	}

	@SuppressWarnings("finally")
	public static int m() {

		try {
			return 1;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// return 2;
		} finally {
			return 3;
		}

		// return 2;
	}

}
