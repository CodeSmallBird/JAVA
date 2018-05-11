package cn.tedu.day06;

import java.util.ArrayList;

public class DemoMethod2 {
	public String sayHello(String name){
		
		return "hello "+name+"!";
	}
	public String hello(){
		return "大家好!";
	}
	public String hello1(){
		return "你好!";
	}
	public static void main(String[] args) {
		DemoMethod2 dm2=new DemoMethod2();
		String result=dm2.sayHello("zhangsan");
		System.out.println(result);
		System.out.println(dm2.hello());
		dm2.hello1();
		
	}

}
