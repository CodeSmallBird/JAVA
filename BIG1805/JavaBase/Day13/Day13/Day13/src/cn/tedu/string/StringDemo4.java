package cn.tedu.string;

public class StringDemo4 {

	public static void main(String[] args) {

		String str1 = "gsdbkfb";

		// ��ȡ���ַ��� --- ���󲻰��� --- ��С������
		// System.out.println(str1.substring(1, 4));
		// Ĭ�ϴ���һλ��ʼ��ȡ�����
		System.out.println(str1.substring(2));

		// �滻ָ�����ַ�
		// System.out.println(str1.replace('b', '+'));

		// System.out.println(str1.lastIndexOf('b', 4));

		// �жϴ��ַ����Ƿ�Ϊ�� --- �ж��ַ��������Ƿ�Ϊ0
		// System.out.println(str1.isEmpty());

		// ��ϣ��ļ��㷽��������д --- ��֤��ͬһ���ַ������κγ����µĹ�ϣֵһ����һ��
		// System.out.println(str1.hashCode());

		// intern��ʾǿ�Ʒ��ش��ַ����ڳ������еĵ�ַ
		// String str2 = new String("abc").intern();

		// System.out.println(str1 == str2);

	}

}
