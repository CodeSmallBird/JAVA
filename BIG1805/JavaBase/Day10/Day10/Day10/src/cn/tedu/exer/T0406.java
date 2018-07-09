package cn.tedu.exer;

import java.util.Scanner;

public class T0406 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// ��ȡ�к���
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();

		// ����һ����ά�������洢����
		int[][] arr = new int[m][n];
		arr[0][0] = 1;

		// ����������ֱ��¼�к���
		int row = 0;
		int col = 0;

		// ����һ����ά��������ʾ��Ӧ����仯���±�仯
		int[][] direction = { { 0, 1 }, // ��
				{ 1, 0 }, // ��
				{ 0, -1 }, // ��
				{ -1, 0 } // ��
		};

		// ��������������Ʒ���ı仯
		// 0 ��
		// 1 ��
		// 2 ��
		// 3 ��
		int di = 0;

		for (int i = 2; i <= m * n; i++) {

			// ԭ����ʲô���򣬾Ͱ���ԭ���ķ�����ǰ��һ��
			row += direction[di][0];
			col += direction[di][1];

			if (col >= n || row >= m || col < 0 || arr[row][col] != 0) {

				// ����һ��
				row -= direction[di][0];
				col -= direction[di][1];

				// ת������
				di++;

				if (di == 4)
					di = 0;

				// �����·����߳�һ��
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
