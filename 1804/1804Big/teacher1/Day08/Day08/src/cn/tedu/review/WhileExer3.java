package cn.tedu.review;

import java.util.Scanner;

public class WhileExer3 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int num = s.nextInt();

		for (int i = 2; i <= num;) {

			if (num % i == 0) {
				System.out.println(i);
				num /= i;
			} else {
				i++;
			}

		}

	}

}
