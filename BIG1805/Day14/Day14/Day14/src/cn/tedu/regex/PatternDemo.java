package cn.tedu.regex;

import java.util.Arrays;

public class PatternDemo {
	
	public static void main(String[] args) {
		
		String str = "1sdf9fcs06cbk2bxcck4fd77";
		
		// ��������Ϊ�߽�����ַ��������з�
		// ��������߽���������и��������һ�� ""
		// ֻҪ�߽���������ֱ�������е�
		String[] ss = str.split("\\d");
		
		System.out.println(Arrays.toString(ss));
		
	}

}
