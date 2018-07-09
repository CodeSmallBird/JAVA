package cn.tedu.exer;

import java.util.Scanner;

public class T0406 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// 获取行和列
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();

		// 定义一个二维数组来存储矩阵
		int[][] arr = new int[m][n];
		arr[0][0] = 1;

		// 定义变量来分别记录行和列
		int row = 0;
		int col = 0;

		// 定义一个二维数组来表示对应方向变化的下标变化
		int[][] direction = { { 0, 1 }, // 右
				{ 1, 0 }, // 下
				{ 0, -1 }, // 左
				{ -1, 0 } // 上
		};

		// 用这个变量来控制方向的变化
		// 0 右
		// 1 下
		// 2 左
		// 3 上
		int di = 0;

		for (int i = 2; i <= m * n; i++) {

			// 原来是什么方向，就按照原来的方向向前走一步
			row += direction[di][0];
			col += direction[di][1];

			if (col >= n || row >= m || col < 0 || arr[row][col] != 0) {

				// 回退一步
				row -= direction[di][0];
				col -= direction[di][1];

				// 转换方向
				di++;

				if (di == 4)
					di = 0;

				// 按照新方向走出一步
				row += direction[di][0];
				col += direction[di][1];
			}

			arr[row][col] = i;

		}

		for (int[] is : arr) {
			for (int i : is) {
				System.out.print(i + "\t");
			}
			System.out.println();
		}

	}

}
