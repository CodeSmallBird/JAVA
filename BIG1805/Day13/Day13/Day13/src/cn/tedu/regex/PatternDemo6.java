package cn.tedu.regex;

public class PatternDemo6 {

	public static void main(String[] args) {

		String str = "���";

		// �ж��ַ����Ƿ����ٳ���������"a789vbnrfbmgbvb"
		// () ����һ�����壬��ô��һ�������֮Ϊ��һ��������
		// System.out.println(str.matches(".*(ab).*\\1.*"));

		// �ж��ַ����Ƿ���һ������
		// System.out.println(str.matches("(.)\\1+"));
		// ��ʾ����2���ַ���ɵ��ַ���
		// System.out.println(str.matches("(.){2,}"));

		// ABAB ������
		// System.out.println(str.matches("(..)\\1"));
		
		// AABB �߸�����
		System.out.println(str.matches("(.)\\1(.)\\2"));

		// \\n��֮Ϊ�ǲ�����ı��
		// ��Java�У���Բ���������Զ��ı�ţ�����Ǵ�1��ʼ��
		// ������ı���Ǵ�(���ֵ�λ�ÿ�ʼ�����
		// (A((BC)D)E)(F)
		// \\1 A((BC)D)E
		// \\2 (BC)D
		// \\3 BC
		// \\4 F

	}

}
