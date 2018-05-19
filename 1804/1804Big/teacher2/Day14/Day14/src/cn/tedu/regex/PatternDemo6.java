package cn.tedu.regex;

public class PatternDemo6 {

	public static void main(String[] args) {

		// String str = "hdik29sdf5gdsa6g7";

		// 将字符串中所有的数字替换为 *
		// System.out.println(str.replaceAll("[abcd]", "*"));

		String str = "Amy Sam Tom Grace Bob";
		// 交换Sam和Bob的位置
		// System.out.println(str.replaceAll("(Amy) (Sam) (Tom) (Grace) (Bob)", "$1 $5
		// $3 $4 $2"));

		// 将第一个m替换为*
		System.out.println(str.replaceFirst("m", "*"));

		// 去除这个字符串中所有的 m
		System.out.println(str.replaceAll("[A-Z]", ""));

	}

}
