package cn.tedu.string;

public class StringDemo8 {

	public static void main(String[] args) {

		// String str = new String("abc");

		// String中的hashcode做了重写
		// 字符串的哈希码是固定的，不随时间和系统而改变
		// System.out.println(str.hashCode());

		String str = "hfdaoal";

		// 获取指定的字符最后一次出现的位置
		System.out.println(str.lastIndexOf('a'));
		// 从指定下标开始向前寻找
		System.out.println(str.lastIndexOf('a', 3));

		// 获取指定的字符或者字符串在对象字符串中第一次出现的位置的
		// 如果元素找不到返回-1
		// System.out.println(str.indexOf("ao"));
		// 表示从第几位开始向后寻找这个字符第一个出现的位置
		// System.out.println(str.indexOf('l', 3));

	}

	public static void printAllIndex(String str, String sub) {

		// 记录下标
		int index = 0;

		while (index < str.length()) {
			// 从指定位置开始查找子字符串
			index = str.indexOf(sub, index);

			// 判断下标是否有效
			if (index == -1) {
				return;
			} else {
				System.out.println(index);
				index++;
			}
		}

	}

}
