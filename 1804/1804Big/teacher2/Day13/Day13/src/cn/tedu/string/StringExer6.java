package cn.tedu.string;

/**
 * 截取字符串
 */
public class StringExer6 {

	// 在Java中指定范围的时候往往是包含小的而不包含大的
	public String substring(String str, int begin, int end) {

		// 字符串为null
		if (str == null) {
			return null;
		}

		// 越界
		if (begin < 0 || begin >= str.length() || end > str.length() || begin > end)
			return null;

		// 将字符串转化为字符数组
		char[] cs = str.toCharArray();

		// 截取字符串
		return new String(cs, begin, end - begin);

	}

}
