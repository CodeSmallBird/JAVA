package cn.tedu.day07;

import java.util.Scanner;

/**
 * 求指定数据n之前整数和
 * 
 * @author adminitartor
 *
 */
public class Demo2 {
	// 非递归调用
	public int sum1(int n){
		int s=0;
		for(int i=1;i<=n;i++){
			s+=i;
		}
		return s;
	}
	//递归调用
	public int sum2(int n){
		if(n==1){
			return 1;
		}
		return n+sum2(n-1);
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		Demo2 d2=new Demo2();
		System.out.println(d2.sum1(n));
		System.out.println(d2.sum2(n));
	}
}
