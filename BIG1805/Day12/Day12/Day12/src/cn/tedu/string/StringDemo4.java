package cn.tedu.string;

public class StringDemo4 {

	public static void main(String[] args) {

		char[] cs = { 'a', 'd', 'e', 'r', 'f', 't', 'y' };

		// ���ַ�����ת��Ϊ�ַ���
		// System.out.println(cs.toString());
		// String str = new String(cs);
		// System.out.println(str);
		
		// ���ַ������е�һ����Ԫ����ת��Ϊ�ַ���
		String str = new String(cs, 2, 4);
		System.out.println(str);

	}

}
