package cn.tedu.baozhuang;

public class IntegerDemo1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// int i = 5;
		// ���û������͵ı����������˶�Ӧ���������͵Ķ��� --- ����
		// Integer in = new Integer(i);
		// �ײ���д��toString����
		// System.out.println(in);

		// �Զ�����/������JDK1.5������֮һ
		// ��һ���������͵ı���ֱ�Ӹ�ֵ����Ӧ���������͵Ķ��� --- �Զ�����
		// �Զ�������ԣ��ײ�ʵ�����ǵ���Integer�е�valueOf
		// Integer in = Integer.valueOf(i);
		// Integer in = i;

		// Double d = Double.valueOf(3.3);
		// Double d = 3.3;

		// Character c = Character.valueOf('f');
		// Character c = 'f';

		Integer in = new Integer(5);
		// ���������͵Ķ���ֱ�Ӹ�ֵ���˶�Ӧ�Ļ������͵ı��� --- �Զ�����
		// �ڵײ�ʵ�����ǵ����˶�Ӧ�������ϵ�***Value����
		// int i2 = in.intValue();
		int i2 = in;
		
		Double dou = new Double(3.1);
		// double d = dou.doubleValue();
		double d = dou;

		Boolean bo = new Boolean(true);
		// boolean b = bo.booleanValue();
		boolean b = bo;
		
		Character ch = new Character('f');
		// char c = ch.charValue();
		char c = ch;
	}

}
