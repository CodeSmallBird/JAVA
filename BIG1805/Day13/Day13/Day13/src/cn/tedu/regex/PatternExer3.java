package cn.tedu.regex;

public class PatternExer3 {

	public static void main(String[] args) {

		String email = "";

		System.out.println(email.matches("\\w{6,32}@[0-9a-z]{1,8}(\\.com)")
				|| email.matches("\\w{6,32}@[0-9a-z]{1,8}(\\.com)?(\\.cn)"));

	}

}
