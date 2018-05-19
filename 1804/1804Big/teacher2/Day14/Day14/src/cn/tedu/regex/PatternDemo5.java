package cn.tedu.regex;

public class PatternDemo5 {

	public static void main(String[] args) {

		// 判断含有至少2个 ab 的字符串
		// () --- 捕获组
		// 注意：Java中正则表达式会对捕获组进行自动的编号，基数从1开始
		// \\n 表示引用前边编号为n的捕获组
		// String str = "ab9abo";
		// System.out.println(str.matches(".*(ab).*\\1.*"));

		// 判断叠字---哈哈哈 呵呵呵
		String str = "溜达溜达";
		System.out.println(str.matches("(.)\\1+"));
		// 表示长度至少为2的字符串
		System.out.println(str.matches("(.){2,}"));
		
		// 高高兴兴
		System.out.println(str.matches("(.)\\1(.)\\2"));
		
		// 溜达溜达
		System.out.println(str.matches("(..)\\1"));

		// 捕获组的编号是从(出现的位置来依次编号的
		// ((A(BC))(D))(E)
		// 1 (A(BC))(D)
		// 2 A(BC)
		// 3 BC
		// 4 D
		// 5 E

	}

}
