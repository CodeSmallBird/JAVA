package cn.tedu.regex;

public class PatternDemo4 {

	public static void main(String[] args) {

		String str = "9hg";

		// ������ --- ÿһ���ַ����ֻ����һ��������������
		// ƥ����Сд��ĸ��ͷ�����ֽ������ַ���
		// * ��ʾǰ�ߵ�����ַ����Գ���Ҳ���Բ����� >=0
		// System.out.println(str.matches("[a-z].*\\d"));

		// ƥ�������ֿ�ͷ�����������ַ���ɵ��ַ���
		// + ��ʾǰ�ߵ�����ַ����ٳ���һ�� >=1
		// System.out.println(str.matches("\\d.+"));
		
		// ƥ�������ֿ�ͷ�����������ַ���ɵ��ַ���
		// ? ��ʾǰ�ߵ�����ַ�������һ�� <=1
		System.out.println(str.matches("\\d.?"));

	}

}
