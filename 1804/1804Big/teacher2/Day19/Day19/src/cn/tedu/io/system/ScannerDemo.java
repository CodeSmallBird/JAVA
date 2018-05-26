package cn.tedu.io.system;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		// 对于nextInt,nextDouble,next都是以空白字符作为结束
		// System.out.println(s.nextInt());
		System.out.println(s.nextInt());
		System.out.println(s.next());
		// 只以回车换行结束
		// System.out.println(s.nextLine().trim());

		s.close();

	}

}
