package cn.tedu.string;

public class StringDemo3 {

	public static void main(String[] args) {

		String str = "shonagiebfgd";
		
		// 获取字符串的长度
		System.out.println(str.length());

		// 获取指定下标位置上的字符
		// char c = str.charAt(3);
		// System.out.println(c);

		// 获取字符串对应的字符数组
		char[] cs = str.toCharArray();
		/*
		 public char[] toCharArray() {
	        char result[] = new char[value.length];
	        System.arraycopy(value, 0, result, 0, value.length);
	        return result;
	     }
	    */
		// 之所以不直接返回原数组，是为了保证字符串的不变性。
		// 因为如果直接返回原数组，那么就会导致操作字符数组的时候会导致原字符串产生改变
		// 如果返回的是复制之后的数组，那么无论怎么操作这个数组都不会改变原字符串
		cs[0] = 'd';
		// for (char c : cs) {
		// System.out.println(c);
		// }

	}

}
