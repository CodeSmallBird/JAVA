package cn.tedu.io.system;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		// ����nextInt,nextDouble,next�����Կհ��ַ���Ϊ����
		// System.out.println(s.nextInt());
		System.out.println(s.nextInt());
		System.out.println(s.next());
		// ֻ�Իس����н���
		// System.out.println(s.nextLine().trim());

		s.close();

	}

}
