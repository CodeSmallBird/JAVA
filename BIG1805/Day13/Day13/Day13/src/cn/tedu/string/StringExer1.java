package cn.tedu.string;

import java.util.Scanner;

public class StringExer1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// ��ȡһ���ַ�����һ������
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int n = s.nextInt();

		// ���ַ���ת��Ϊ�ֽ�����
		byte[] bs = str.getBytes();

		// ����ָ���ĸ��ֽڸ������н�ȡ
		String sub = new String(bs, 0, n);

		// Ҫ�Ƚ����ַ��������һλ�ַ���ԭ�ַ����Ķ�Ӧλ���ϵ��ַ��Ƿ�һ��
		if (sub.charAt(sub.length() - 1) != str.charAt(sub.length() - 1)) {
			sub = new String(bs, 0, n - 1);
		}
		
		System.out.println(sub);
	}

}
