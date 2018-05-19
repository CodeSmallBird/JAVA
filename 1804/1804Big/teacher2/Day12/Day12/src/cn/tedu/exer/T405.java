package cn.tedu.exer;

public class T405 {

	public static void main(String[] args) {

		// 规定如果是false，说明猴子没有淘汰；如果是true，说明被淘汰
		boolean[] monkeys = new boolean[15];

		// 记录报数
		int count = 0;

		// 记录剩余的猴子的个数
		int left = 15;

		// 控制下标
		int index = 0;

		while (left > 1) {

			// 判断猴子是否被淘汰
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
