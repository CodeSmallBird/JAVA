package cn.tedu.string;

public class StringDemo1 {

	public static void main(String[] args) {

		// ֱ��ָ������ڳ����صĵ�ַ
		String str1 = "ab";
		// ָ���˶��ڴ棬���ڴ�ָ���˳�����
		String str2 = new String("ab");
		// ��Ϊ"a"��"b"��������
		// ���������������㣬Ϊ�����Ч�ʣ��ڱ���ʱ�ڻ��Զ�����
		// ������仰�������֮�����String str3 = "ab";
		String str3 = "a" + "b";

		// ʹ��+ƴ�������ַ������ײ�ʵ���ϵ�����StringBuilder�е�append����
		String str4 = "a";
		// str4 = new StringBuilder(str4).append("b").toString();
		str4 = str4 + "b";

		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str1 == str4);
		System.out.println(str2 == str4);

	}

}
