package cn.tedu.regex;

import java.util.Scanner;

public class PatternExer5 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String str = s.nextLine();

		// ��¼�ַ�����ԭ����
		int len1 = str.length();

		// ������ĸ�ĸ���
		str = str.replaceAll("[a-zA-Z]", "");
		// ��¼�ַ������ڵĳ���
		int len2 = str.length();
		System.out.println(len1 - len2);

		// �������ֵĸ���
		str = str.replaceAll("\\d", "");
		System.out.println(len2 - str.length());

		// �������ŵĸ���
		System.out.println(str.length());
		
		count(str);

	}

	// "+"
	public static void count(String str){
		
		while(str.length() != 0){
			
			int len = str.length();
			
			// �Ȼ�ȡ��һ���ַ�
			char c = str.charAt(0);
			
			String pattern = "";
			
			if(c >= '0' && c <= '9' || c >= 'A' && c <= 'Z' || c >= 'a' && c <='z')
				pattern += c;
			else 
				pattern = "\\" + c;
			
			// �����е���ͬ���ַ��滻��
			str = str.replaceAll(pattern, "");
			
			System.out.println(c + ":" + (len - str.length()));
			
		}
		
	}

}
