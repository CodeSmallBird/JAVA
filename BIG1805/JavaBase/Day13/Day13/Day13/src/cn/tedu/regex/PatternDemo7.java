package cn.tedu.regex;

public class PatternDemo7 {

	public static void main(String[] args) {

		// String str = "ks4sdlg3dkl0csbk2sbdk";

		// 将字符串中的所有的数字替换为-
		// System.out.println(str.replaceAll("\\d", "--"));

		// 将字符串中的所有的数字都去除掉
		// System.out.println(str.replaceAll("\\d", ""));

		// 将字符串中的所有的非数字抠掉
		// str = str.replaceAll("\\D", "");
		// System.out.println(str);
		
		String str = "Cat Dog Pig Mouse Spider";
		System.out.println(str.replaceAll("(.*)(Dog)(.*)(Spider)", "$1$4$3$2"));

	}

}
