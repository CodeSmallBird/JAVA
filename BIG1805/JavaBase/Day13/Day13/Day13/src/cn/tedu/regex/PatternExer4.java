package cn.tedu.regex;

public class PatternExer4 {
	
	public static void main(String[] args) {
		
		String str = "�������������������Ұ�����������ѧѧѧ�����̳�";
		
		System.out.println(str.replaceAll("(.)\\1+", "$1"));
		
	}

}
