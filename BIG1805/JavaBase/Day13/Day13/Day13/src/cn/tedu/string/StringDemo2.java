package cn.tedu.string;

public class StringDemo2 {

	public static void main(String[] args) {

		String s1 = "dhvoanhln";

		// ��ָ�����ַ���ƴ�ӵ�ԭ�ַ���ĩβ
		// System.out.println(s1.concat(""));
		// System.out.println(s1);

		// �ж��Ƿ����ָ�������ַ���
		// System.out.println(s1.contains("0"));

		// �ж��Ƿ���ָ���Ľ�β
		// System.out.println(s1.endsWith("a"));

		// �ж��Ƿ���ָ���Ŀ�ͷ
		System.out.println(s1.startsWith("d"));
		
		// ת��Ϊ�ַ�����֮����λ�Ƚ�
		System.out.println(s1.equals(new String("DHVOANHLN")));
		System.out.println(s1.equalsIgnoreCase("DHVOANHLN"));
	}

}
