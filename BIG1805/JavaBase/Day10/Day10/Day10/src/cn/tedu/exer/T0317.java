package cn.tedu.exer;

public class T0317 {

	public static void main(String[] args) {

		for (int i = 100; i < 1000; i++) {

			// ��ȡ��λ
			int a = i % 10;
			// ��ȡʮλ
			int b = i / 10 % 10;
			// ��ȡ��λ
			int c = i / 100;

			// ��a��b�η� --- a,b����double
			// double d = Math.pow(a, 3);

			if ((int) (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3)) == i)
				System.out.println(i);

		}
		System.out.println(Math.pow(3.6, 4.1));

	}

}
