package cn.tedu.string;

public class StringDemo5 {

	public static void main(String[] args) {

		String str = "ahongedsnga";

		// ��ָ���ַ���һ�γ��ֵ�λ��
		// ����ַ������ڣ��򷵻�-1
		// int index = str.indexOf('g');
		// int index = str.indexOf('g', 0);
		int index = str.indexOf("ng", 5);
		System.out.println(index);
	}

	// ����һ���ַ������Լ�һ�����ַ�������ӡ������ַ������ֵ����е�λ��
	public static void allIndex(String str, String sub) {

		// ��¼�±�
		int index = 0;

		// ��֤�±�С���ַ����ĳ���
		while (index < str.length()) {

			// �����ַ������ֵ��±�
			index = str.indexOf(sub, index);

			if (index == -1) {
				break;
			} else {
				System.out.println(index);
				// ��ӡ���֮��������ǰ�����ַ����������ַ�����һλ��ʼ��������
				index += sub.length();
			}

		}

	}

}
