package cn.tedu.string;

public class StringDemo1 {

	public static void main(String[] args) {

		String s1 = "ashol";
		String s2 = "ASHOL";

		// 1. s1��s2�ڵײ������ַ��������ʽ���洢
		// 2. ���������ַ����飬�ڱ��������ж�Ӧλ���ϵ��ַ��������
		// 3. �������0����ô������һλ�����������0����ôֱ�ӽ�������
		// 4. �����һ���ַ������ȱ����꣬��ô���������ַ����ĳ���֮��
		// �������ֵ����0��˵�������ַ���һ��
		// �������ֵ����0�� s1>s2
		// �������ֵС��0�� s1<s2
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		
		// ���ַ���ת��Ϊ��д
		System.out.println(s1.toUpperCase());
		System.out.println(s1);

		// ���ַ���ת��ΪСд
		System.out.println(s2.toLowerCase());
	}

}
