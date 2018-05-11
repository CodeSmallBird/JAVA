package cn.tedu.review;

import java.util.Scanner;

public class ArrayExer {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// 获取数字
		Scanner s = new Scanner(System.in);
		int row = s.nextInt();

		// 定义二维数组
		int[][] arr = new int[row][];

		for (int i = 0; i < arr.length; i++) {

			// 初始化每一行
			arr[i] = new int[i + 1];

			for (int j = 0; j < arr[i].length; j++) {

				if (j == 0 || j == i) {
					arr[i][j] = 1;
				} else {
					arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
				}
				System.out.print(arr[i][j] + "\t");

			}

			System.out.println();

		}

	}

}
