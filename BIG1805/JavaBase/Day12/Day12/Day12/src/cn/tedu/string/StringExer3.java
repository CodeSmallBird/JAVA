package cn.tedu.string;

import java.util.Arrays;
import java.util.Scanner;

public class StringExer3 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		
		// ���ַ���ת��Ϊ�ַ�����
		char[] cs = str.toCharArray();
		
		// ����һ���µ�����洢��ȡ֮��Ľ��
		char[] result = new char[cs.length];
		
		// ����һ����������¼��ȡ�����ֵĸ���
		int count = 0;
		
		for (char c : cs) {
			if(c >= '0' && c <= '9'){
				result[count] = c;
				count++;
			}
		}
		
		// �������Ϊʵ��ʹ�õĴ�С
		result = Arrays.copyOf(result, count);
		
		// �������������
		Arrays.sort(result);
		
		System.out.println(new String(result));
		
	}

}
