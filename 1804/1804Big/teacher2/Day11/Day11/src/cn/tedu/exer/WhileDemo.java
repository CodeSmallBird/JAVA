package cn.tedu.exer;

public class WhileDemo {

	public static void main(String[] args) {

		int i = 5;
		// 在java中，编译的时候只能运算字面量或者是比较变量的类型是否一致
		while (i < 10) 
			;
		{
			i++;
			System.out.println(i);
		}

	}

}
