package cn.tedu.review;

import java.util.Scanner;

public class MethodExer {

	// ע��
	@SuppressWarnings("resource")  // SuppressWarnings --- ѹ�ƾ���
	public static void main(String[] args) {

		// ���� : Ctrl + Shift + o
		// ���� ---Warning --- ��ʾEclipse���뵽�����ʱ����Ϊ����ط����ܻ��������
		// ����һ�㲻Ӱ������ִ��
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		// ���� --- Error --- һ��Ҫ�Ķ�
		// System.out.println(aaaaaa);

		System.out.println(faibo(n));

	}

	// ��ȡ쳲��������еĵ�n��
	// �ӵ����ʼ��ÿһ������֮ǰ����ĺ�
	// n >= 3 f(n) = f(n - 1) + f(n - 2)
	public static int faibo(int n) {

		if (n == 1)
			return 0;

		if (n == 2)
			return 1;

		return faibo(n - 1) + faibo(n - 2);
	}

}
