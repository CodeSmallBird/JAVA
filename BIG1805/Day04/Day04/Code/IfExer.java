import java.util.Scanner;
public class IfExer {
	/**
		����2/3�����֣���ȡ���ֵ
	*/
	public static void main(String[] args){
		
		/*
		// ��ȡ��������
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		int j = s.nextInt();
		
		// ��i��j���Ƚ�
		if(i > j){
			System.out.println("���ֵ:" + i);
		} else {
			System.out.println("���ֵ:" + j);
		}
		*/
		
		// ��ȡ����3������
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		/*
		if(a > b) {
			if(a > c) {
				System.out.println("���ֵ��" + a);
			} else {
				System.out.println("���ֵ��" + c);
			}			
		} else {
			if(b > c){
				System.out.println("���ֵ��" + b);
			} else {
				System.out.println("���ֵ��" + c);
			}
		}
		*/
		
		// ����һ����������¼���ֵ
		int max = a;
		
		// ���maxС����b��˵��max��¼�Ĳ������ֵ����Ҫ�����ֵ����max
		if(max < b) {
			max = b;
		}  
		if(max < c) {
			max = c;
		}
		System.out.println("���ֵ��" + max);
		
	}
	
}