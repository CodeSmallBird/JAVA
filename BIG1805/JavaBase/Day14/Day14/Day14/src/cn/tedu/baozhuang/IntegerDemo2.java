package cn.tedu.baozhuang;

public class IntegerDemo2 {

	public static void main(String[] args) {

		// ���Զ����������ʹ�õ�valueOf����
		// �����������Ͷ��ԣ����Զ������ʱ����з�Χ�ж�
		// �����Χ��-128~127֮�䣬��ô���ص��������е�ֵ
		// ������������Χ������һ���µĶ���
		// Integer i1 = 127;
		// Integer i2 = 127;

		// System.out.println(i1 == i2);

		Integer in = new Integer(5);
		int i = 5;
		// ����������ͺͶ�Ӧ���������ͽ������㣬��ô�������͵Ķ��������Զ�����
		System.out.println(in == i);
	}

}
