package cn.tedu.regex;

public class PatternExer2 {

	public static void main(String[] args) {

		System.out.println(checkPassword("123adc _"));

	}

	public static boolean checkPassword(String password) {

		// ÅÐ¶Ï²ÎÊýÊÇ·ñÎª¿Õ
		if (password == null)
			return false;

		// ÅÐ¶ÏÃÜÂëµÄÎ»Êý
		if (!password.matches("[\\w ]{8,12}"))
			return false;

		int count = 0;

		// ÅÐ¶ÏÊÇ·ñ°üº¬×ÖÄ¸
		if (password.matches(".*[a-zA-Z].*"))
			count++;

		// ÅÐ¶ÏÊÇ·ñ°üº¬Êý×Ö
		if (password.matches(".*[0-9].*"))
			count++;

		// ÅÐ¶ÏÊÇ·ñ°üº¬_
		if (password.matches(".*_.*"))
			count++;

		// ÅÐ¶ÏÊÇ·ñ°üº¬¿Õ¸ñ
		if (password.matches(".* .*"))
			count++;

		return count >= 3;

	}

}
