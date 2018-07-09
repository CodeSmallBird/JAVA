package cn.tedu.regex;

public class PatternDemo3 {
	
	public static void main(String[] args) {
		
		String str = "p";
		
		// �ж�һ���ַ���˵�Ƿ�����һ���ַ����
		// . �������б�ʾͨ���
		System.out.println(str.matches("."));
		
		// ƥ�� . 
		// \\. ����\\.�ᱻJavaת��Ϊ\.��Ȼ��������ת��Ϊ.
		System.out.println(str.matches("\\."));
		
		// ƥ�� \
		// \\\\ �ᱻJavaת��Ϊ\\,Ȼ��������ת��Ϊ\
		System.out.println(str.matches("\\\\"));
		
		System.out.println(str.matches("\\d"));
		
	}

}
