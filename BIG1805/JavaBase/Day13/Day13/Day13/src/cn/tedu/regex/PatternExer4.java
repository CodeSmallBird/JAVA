package cn.tedu.regex;

public class PatternExer4 {
	
	public static void main(String[] args) {
		
		String str = "我我我我我我我我我我爱爱爱爱爱爱学学学编编编编程程";
		
		System.out.println(str.replaceAll("(.)\\1+", "$1"));
		
	}

}
