package cn.tedu.exer;

public class LoopDemo {

	public static void main(String[] args) {

		// A:for (int i = 0; i < 3; i++) {
		// for (int j = 0; j < 5; j++) {
		// for (int k = 0; k < 4; k++) {
		//
		// if (k == 2)
		// continue A;
		//
		// System.out.println(i + "\t" + j + "\t" + k);
		//
		// }
		// }
		// }

		// for (int i = 1000000000; ; i+=100000000) {
		// System.out.println(i);
		// }

		// for(double d = 1e307; ; d -= 1e307){
		// System.out.println(d);
		// }

		// for (int i = 0; i != 10; i++)
		// System.out.println(i);
		// 在使用的时候，小数避免做精确判断
		for (double i = 0; i != 10; i += 0.1)
			System.out.println(i);
	}

}
