package cn.tedu.exer;

public class T0321 {

	public static void main(String[] args) {

		// ����һ����������¼PI
		double PI = 0;
		// ����һ����������¼����
		int count = 0;
		// ����һ��������ʾ��ĸ
		int base = 1;
		// ����һ�����������Ʒ��ŵı仯
		int sym = 1;
		while (PI > 3.1415927 || PI < 3.1415926) {
			PI += (4.0 * sym / base);
			// ��ĸ+2
			base += 2;
			// ����+1
			count++;
			// �ı����λ
			sym *= -1;
			System.out.println(PI);
		}
		System.out.println(count);
	}

}
