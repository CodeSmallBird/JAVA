package cn.tedu.assertion;

public class AssertDemo {

	public static void main(String[] args) {

		int i = 5;

		i += i <<= i / 3;

		// ���� --- ������Գɹ�����������ִ�У��������ʧ�ܣ��ʹ�ֹͣ
		// assert i > 20 ;
		assert i > 20 : "Ԥ����Ӧ����һ������20�����֣���ʵ������" + i;

		System.out.println(i);

	}

}
