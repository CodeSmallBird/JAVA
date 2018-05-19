package cn.tedu.regex;

public class PatternExer3 {

	public static void main(String[] args) {

		String pwd = "sdhdkrdhl";

		System.out.println(checkPassword(pwd));

	}

	private static boolean checkPassword(String pwd) {

		// 判断参数是否为空
		if (pwd == null)
			return false;

		// 判断密码长度是否符合
		if (!pwd.matches("[a-zA-Z0-9 ]{8,12}")) {
			return false;
		}

		// 记录出现的字符的类型
		int i = 0;

		// 判断密码中是否出现了字母
		if (pwd.matches(".*[a-zA-Z].*"))
			i++;

		// 判断密码中是否出现了数字
		if (pwd.matches(".*\\d.*"))
			i++;

		// 判断密码中是否出现了空格
		if (pwd.matches(".* .*"))
			i++;

		return i >= 2;
	}

}
