package cn.tedu.regex;

public class PatternDemo5 {

	public static void main(String[] args) {

		String str = "7853962";

		// ƥ����������ɵĳ�������Ϊ5���ַ���
		// {n,} ��ʾ����ַ����ٳ���n�� >= n
		// System.out.println(str.matches("\\d{5,}"));

		// ƥ����8-12���ַ���ɵ��ַ���
		// System.out.println(str.matches(".{8,12}"));

		// ƥ����6��������ɵ��ַ���
		System.out.println(str.matches("\\d{6}"));
	}

}
