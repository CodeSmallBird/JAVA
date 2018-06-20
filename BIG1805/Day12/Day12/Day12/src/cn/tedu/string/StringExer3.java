package cn.tedu.string;

import java.util.Arrays;
import java.util.Scanner;

public class StringExer3 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		
		// 将字符串转化为字符数组
		char[] cs = str.toCharArray();
		
		// 定义一个新的数组存储提取之后的结果
		char[] result = new char[cs.length];
		
		// 定义一个变量来记录提取的数字的个数
		int count = 0;
		
		for (char c : cs) {
			if(c >= '0' && c <= '9'){
				result[count] = c;
				count++;
			}
		}
		
		// 将数组变为实际使用的大小
		result = Arrays.copyOf(result, count);
		
		// 对数组进行排序
		Arrays.sort(result);
		
		System.out.println(new String(result));
		
	}

}
