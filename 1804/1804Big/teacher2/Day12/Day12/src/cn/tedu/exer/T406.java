package cn.tedu.exer;

import java.util.Scanner;

public class T406 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// 获取行和列
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();

		// 定义一个二维数组存储实际数据
		int[][] arr = new int[m][n];

		arr[0][0] = 1;

		// 定义两个变量记录行和列
		int row = 0;
		int col = 0;

		// 记录方向
		int[][] direction = {
				// 第一个数表示行的变化，第二个表示列的变化
				{ 0, 1 }, // 右
				{ 1, 0 }, // 下
				{ 0, -1 }, // 左
				{ -1, 0 } // 上

		};

		// 控制方向
		int di = 0;

		for (int i = 2; i <= m * n; i++) {

			// 原来是向哪个方向走的，先按照原来的方向继续向前走一步
			row += direction[di][0];
			col += direction[di][1];

			// 判断这一步是否越界
			if (col >= n || row >= m || col < 0 || arr[row][col] != 0) {

				// 回退这一步
				row -= direction[di][0];
				col -= direction[di][1];

				// 改变方向
				di++;

				if (di == 4)
					di = 0;

				// 按照新的方向走出一步
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
