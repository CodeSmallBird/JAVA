package cn.tedu.exer;

public class T322 {

	public static void main(String[] args) {

		int n = 10;

		if (n == 1)
			System.out.println(0);
		else if (n == 2)
			System.out.println("0, 1 ");
		else {
			System.out.print("0, 1");
			int first = 0, second = 1;
			for (int i = 3; i <= n; i++) {
				int third = first + second;
				System.out.print(", " + third);
				first = second;
				second = third;
			}
		}

	}

}
