package cn.tedu.exer;

public class T03 {

	public static void main(String[] args) {

		// final int i = 3;
		// int i = 3;
		// i是一个变量，在编译的时候不会检查这个变量的具体的值
		// 在编译期间，认为i的值可能会产生变化从而导致条件不成立
		// while (i <= 3)
		// ;
		// true是一个字面量，在编译期间是确定具体值
		// 那么编译的时候就会直接判断条件是否成立
		// 因为是true，所以表示条件永远成立，后续代码就无法执行
		// while (true)
		// ;
		// 因为3和5是两个字面量，字面量在编译期间就会自动运算
		// 这句话编译完成之后就是while(true);
		// while(3 < 5);
		// {
		// System.out.println(i);
		// i++;
		// }

		// int i = 5;
		// switch(i){
		// default:
		// int y = 5;
		// case 4:
		// y += 4;
		// case 3:
		// y += 3;
		// case 2:
		// y += 2;
		// case 1:
		// y += 1;
		// System.out.println(y);
		// }
	}

}
