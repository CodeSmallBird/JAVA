package cn.tedu.review;

public class WhileExer {

	public static void main(String[] args) {

		// for (int i = 1; i < 10; i++) {
		//
		// for (int j = 1; j <= i; j++) {
		//
		// System.out.print(j + "*" + i + "=" + i * j + "\t");
		//
		// }
		//
		// System.out.println();
		//
		// }

		for (int i = 1, j = 1; i < 10; j++) {

			System.out.print(j + "*" + i + "=" + i * j + "\t");

			if (j == i) {

				System.out.println();
				i++;
				j = 0;

			}

		}

	}

}
