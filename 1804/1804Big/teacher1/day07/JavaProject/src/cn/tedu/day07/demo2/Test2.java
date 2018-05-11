package cn.tedu.day07.demo2;

public class Test2 {
	static{
		System.out.println("Test2.static block");
	}
	public Test2(){
		System.out.println("Test2.contructor()");
	}
	{
		System.out.println("Test2.code block");
	}
}
