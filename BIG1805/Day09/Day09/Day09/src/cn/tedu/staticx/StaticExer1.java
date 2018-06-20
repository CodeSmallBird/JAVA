package cn.tedu.staticx;

public class StaticExer1 {

	public static void main(String[] args) {

		// ÄäÃû//¶ÔÏó
		new MyClass();
		new MyClass();
		System.out.println(MyClass.count);

	}

}

class MyClass {

	static int count = 0;

	public MyClass() {
		count++;
	}

}