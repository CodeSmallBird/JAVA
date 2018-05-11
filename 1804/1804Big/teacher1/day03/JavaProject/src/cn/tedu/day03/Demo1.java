package cn.tedu.day03;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short s='A';
		System.out.println("s="+s);
		int i='a';
		System.out.println("i="+i);
		System.out.println("字符:"+(char)i);
		
		char c='a';
		System.out.println("c="+c);
		
		//short s1=c;//类型不匹配
		int i1=c;
		System.out.println("i1="+i1);
		
		byte b=12+3;
		System.out.println("b="+b);
		
		//int i2=4;
		//byte b2=i2+1;//错的 ,类型不匹配
		
		//int i3=100;
		//System.out.println("除="+(i3/0));//异常
		
		double d=123.4105;
		System.out.println("除="+(d/0));
		
		
		System.out.println("除:"+0.0/0);
	
		
	}

}
