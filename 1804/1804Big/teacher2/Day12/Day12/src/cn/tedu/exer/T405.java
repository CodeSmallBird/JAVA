package cn.tedu.exer;

public class T405 {

	public static void main(String[] args) {

		// �涨�����false��˵������û����̭�������true��˵������̭
		boolean[] monkeys = new boolean[15];

		// ��¼����
		int count = 0;

		// ��¼ʣ��ĺ��ӵĸ���
		int left = 15;

		// �����±�
		int index = 0;

		while (left > 1) {

			// �жϺ����Ƿ���̭
			if (!monkeys[index]) {

				count++;

				if (count == 7) {
					monkeys[index] = true;
					count = 0;
					left--;
				}

			}

			index++;

			if (index == 15)
				index = 0;

		}

		for (int i = 0; i < monkeys.length; i++) {
			if (!monkeys[i])
				System.out.println(i + 1);
		}

	}

}
