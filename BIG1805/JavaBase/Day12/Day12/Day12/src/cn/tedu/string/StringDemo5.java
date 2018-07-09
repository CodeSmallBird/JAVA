package cn.tedu.string;

public class StringDemo5 {

	public static void main(String[] args) {

		String str = "ahongedsnga";

		// 找指定字符第一次出现的位置
		// 如果字符不存在，则返回-1
		// int index = str.indexOf('g');
		// int index = str.indexOf('g', 0);
		int index = str.indexOf("ng", 5);
		System.out.println(index);
	}

	// 输入一个字符串，以及一个子字符串，打印这个子字符串出现的所有的位置
	public static void allIndex(String str, String sub) {

		// 记录下标
		int index = 0;

		// 保证下标小于字符串的长度
		while (index < str.length()) {

			// 找子字符串出现的下标
			index = str.indexOf(sub, index);

			if (index == -1) {
				break;
			} else {
				System.out.println(index);
				// 打印完成之后，跳过当前的子字符串，从子字符串后一位开始继续查找
				index += sub.length();
			}

		}

	}

}
