package cn.tedu.exer;

import java.util.Scanner;

public class T0322 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// ��ȡҪ���������
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		if (n <= 0)
			System.out.println("�����Ƿ�������");
		else if (n == 1)
			System.out.println("0");
		else if (n == 2)
			System.out.println("0,1");
		else {
			// �������һ��͵ڶ���
			System.out.print("0,1");

			// ����һ����������¼��һ��
			int first = 0;

			// ����һ����������¼�ڶ���
			int second = 1;

			for (int i = 3; i <= n; i++) {

				// ���������
				int third = first + second;
				System.out.print("," + third);

				first = second;
				second = third;
			}

		}

	}

}
