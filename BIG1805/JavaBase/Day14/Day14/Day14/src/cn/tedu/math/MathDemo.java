package cn.tedu.math;

public class MathDemo {

	public static void main(String[] args) {

		// System.out.println(Math.E);

		// ����ȡ��
		// System.out.println(Math.ceil(3.05));

		// ����ȡ��
		// System.out.println(Math.floor(-8.79));

		// ��������
		// System.out.println(Math.round(4.46));

		// ��ȡһ��[0,1)�����С��
		// System.out.println(Math.random());

		// ��ȡ30-70֮����������
		// int i = (int) (Math.random() * 41 +30);
		// System.out.println(i);

		// 0.15%
		for (int i = 0; i < 10000; i++)
			if (Math.random() * Math.random() > 0.95) {
				System.out.println("�ף���ϲ�����н���~~~");
			}
	}

}
