package cn.tedu.staticx;

public class StaticDemo5 {

	public static void main(String[] args) {

		System.out.println(SDemo.i);

	}

}

class SDemo {

	static {
		i = 7;
	}
	static int i;

}
