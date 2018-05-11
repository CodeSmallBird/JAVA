package cn.tedu.day07.demo2;

public class Test1 {
	public Test2 test=new Test2();
	static{
		System.out.println("Test1.static block");
	}
	public Test1(){
		System.out.println("Test1.constructor");
	}
	{
		System.out.println("Test1.code block");
	}
}
