package cn.tedu.string;

public class StringDemo3 {

	public static void main(String[] args) throws Exception {

		String s = "�ֽ�����";

		// ���ַ���ת��Ϊ�ֽ�����
		// ��ת����ʱ�����û��ָ�����������ƽ̨��������ת��
		// byte[] bs = s.getBytes();
		byte[] bs = s.getBytes("utf-8");
		System.out.println(bs.length);

		// ���ֽ�����ת��Ϊ�ַ���
		// String str = new String(bs);
		// String str = new String(bs, "utf-8");
		String str = new String(bs, 3, 6, "utf-8");
		System.out.println(str);

	}

}
