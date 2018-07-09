package cn.tedu.staticx;

public class StaticDemo4 {

	public static void main(String[] args) {

		System.out.println(C.i);

	}

}

class C {

	// TODO Why?
	static {
		// i -= 7;
		i = 5;
		i = 2;
		i = 1;
		i = 4;
		i = 7;
		// System.out.println(i);
	}
	static int i;

}
