package cn.tedu.regex;

public class PatternExer2 {

	public static void main(String[] args) {

		String email = "langang@sina.com.cn";

		System.out.println(checkEmail(email));

	}

	private static boolean checkEmail(String email) {
		return email.matches("\\w{6,32}@[a-zA-Z0-9]{1,5}(\\.com)")
				|| email.matches("\\w{6,32}@[a-zA-Z0-9]{1,5}(\\.com)?(\\.cn)");
	}

}
