package cn.tedu.regex;

public class PatternDemo2 {

	public static void main(String[] args) {

		String str = "+";

		// �ж�һ���ַ����Ƿ�����abc\def\opq���е��ַ����
		// System.out.println(str.matches("[bac][def][opq]"));

		// �ж��Ƿ���һ����һ����ĸ��ɵ��ַ���
		// System.out.println(str.matches("[a-zA-Z]"));
		
		// �ж�һ���ַ����Ƿ���һ���ַ���ɣ�������ַ�����a\b\c
		System.out.println(str.matches("[^abc]"));
	}

}
