package cn.tedu.math;

import java.math.BigDecimal;

public class BigDecimalDemo {

	// strictfpֻ�����η�������ʾ�����ڼ������������80λ�����������е�
	// �������Ĵ洢��Ȼ��64λ������
	public strictfp static void main(String[] args) {
		
		// Java������64λ���������洢double���͵�����
		// ��͵���С���ڴ洢��ʱ�����־�����ʧ
		double d1 = 3.13;
		double d2 = 2.79;
		System.out.println(d1 - d2);
		
		// ��Ҫ���������ַ�����ʽ����
		BigDecimal bd1 = new BigDecimal("3.13762");
		BigDecimal bd2 = new BigDecimal("2.7963");
		System.out.println(bd1.subtract(bd2));
		
		
	}
	
}
