package cn.tedu.string;

public class StringDemo3 {

	public static void main(String[] args) {

		String str = "shonagiebfgd";
		
		// ��ȡ�ַ����ĳ���
		System.out.println(str.length());

		// ��ȡָ���±�λ���ϵ��ַ�
		// char c = str.charAt(3);
		// System.out.println(c);

		// ��ȡ�ַ�����Ӧ���ַ�����
		char[] cs = str.toCharArray();
		/*
		 public char[] toCharArray() {
	        char result[] = new char[value.length];
	        System.arraycopy(value, 0, result, 0, value.length);
	        return result;
	     }
	    */
		// ֮���Բ�ֱ�ӷ���ԭ���飬��Ϊ�˱�֤�ַ����Ĳ����ԡ�
		// ��Ϊ���ֱ�ӷ���ԭ���飬��ô�ͻᵼ�²����ַ������ʱ��ᵼ��ԭ�ַ��������ı�
		// ������ص��Ǹ���֮������飬��ô������ô����������鶼����ı�ԭ�ַ���
		cs[0] = 'd';
		// for (char c : cs) {
		// System.out.println(c);
		// }

	}

}
