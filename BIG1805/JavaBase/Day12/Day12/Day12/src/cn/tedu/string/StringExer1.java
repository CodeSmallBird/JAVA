package cn.tedu.string;

import java.util.Scanner;

public class StringExer1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// ��ȡ�ַ���
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();

		// ���������¼��ĸ����
		int letter = 0;
		// ���������¼���ָ���
		int number = 0;
		// ��¼�������ŵĸ���
		int symbol = 0;

		// �����ַ����������ж�ÿһλ��һ��ʲô���͵��ַ�
		for (int i = 0; i < str.length(); i++) {

			// ��ȡ��һλ�ϵ��ַ�
			char c = str.charAt(i);

			if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') {
				letter++;
			} else if (c >= '0' && c <= '9') {
				number++;
			} else {
				symbol++;
			}

		}

		System.out.println("��ĸ��" + letter);
		System.out.println("���֣�" + number);
		System.out.println("���ţ�" + symbol);
	}

}
