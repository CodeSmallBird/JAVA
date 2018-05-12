package cn.tedu.staticx;

public class StaticDemo6 {

	public static void main(String[] args) {
		System.out.println("main:" + Sc.i);
	}

}

class Sc {

	static int i;

	static {
		new Sc();
		System.out.println("Static:" + Sc.i);
	}

	public Sc() {
		Sc.i++;
	}

}
