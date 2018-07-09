package cn.tedu.exer;

public class T0321 {

	public static void main(String[] args) {

		// 定义一个变量来记录PI
		double PI = 0;
		// 定义一个变量来记录次数
		int count = 0;
		// 定义一个变量表示分母
		int base = 1;
		// 定义一个变量来控制符号的变化
		int sym = 1;
		while (PI > 3.1415927 || PI < 3.1415926) {
			PI += (4.0 * sym / base);
			// 分母+2
			base += 2;
			// 次数+1
			count++;
			// 改变符号位
			sym *= -1;
			System.out.println(PI);
		}
		System.out.println(count);
	}

}
