package cn.tedu.regex;

public class PatternDemo7 {

	public static void main(String[] args) {

		// String str = "ks4sdlg3dkl0csbk2sbdk";

		// ���ַ����е����е������滻Ϊ-
		// System.out.println(str.replaceAll("\\d", "--"));

		// ���ַ����е����е����ֶ�ȥ����
		// System.out.println(str.replaceAll("\\d", ""));

		// ���ַ����е����еķ����ֿٵ�
		// str = str.replaceAll("\\D", "");
		// System.out.println(str);
		
		String str = "Cat Dog Pig Mouse Spider";
		System.out.println(str.replaceAll("(.*)(Dog)(.*)(Spider)", "$1$4$3$2"));

	}

}
