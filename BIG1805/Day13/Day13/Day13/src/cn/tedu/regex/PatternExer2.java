package cn.tedu.regex;

public class PatternExer2 {

	public static void main(String[] args) {

		System.out.println(checkPassword("123adc _"));

	}

	public static boolean checkPassword(String password) {

		// �жϲ����Ƿ�Ϊ��
		if (password == null)
			return false;

		// �ж������λ��
		if (!password.matches("[\\w ]{8,12}"))
			return false;

		int count = 0;

		// �ж��Ƿ������ĸ
		if (password.matches(".*[a-zA-Z].*"))
			count++;

		// �ж��Ƿ��������
		if (password.matches(".*[0-9].*"))
			count++;

		// �ж��Ƿ����_
		if (password.matches(".*_.*"))
			count++;

		// �ж��Ƿ�����ո�
		if (password.matches(".* .*"))
			count++;

		return count >= 3;

	}

}
