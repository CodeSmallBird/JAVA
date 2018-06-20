package cn.tedu.object;

public class LocalCodeDemo {

	public static void main(String[] args) {

		int i = 5;

		// 局部代码块
		{
			// j的作用范围变小，j的生命周期也变短，提高了栈内存的利用率
			int j = 5;
			System.out.println(i + j);
		}

		// System.out.println(j);

	}

}
