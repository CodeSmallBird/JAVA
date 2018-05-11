package cn.tedu.review;

public class WhileExer2 {

	public static void main(String[] args) {

		System.out.println(isPrime(78));

	}

	public static boolean isPrime(int number) {

		if (number < 2) {
			return false;
		}

		if (number == 2) {
			return true;
		}

		for (int i = 3; i <= number/2; i += 2) {

			if (number % i == 0) {
				return false;
			}

		}

		return true;

	}
}
