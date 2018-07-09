package cn.tedu.regex;

public class PatternExer1 {

	public static void main(String[] args) {

		String str = "10.859";

		System.out.println(str.matches("0\\.\\d+") || 
				str.matches("[1-9]\\d*\\.\\d+"));

	}

}
