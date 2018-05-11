package cn.tedu.day04;

import java.util.Scanner;

public class DemoDoWhile1_1 {
	public static void main(String[] args) {
		System.out.println("******************");
		System.out.println("1.鞋\t2.衣服\t3.裤子");
		System.out.println("******************");
		Scanner input=new Scanner(System.in);
		String answer="";
		
		do{
			System.out.println("请输入商品的编号");
			int num=input.nextInt();
			
			switch(num){
			case 1:
				System.out.println("鞋 1000");
				break;
			case 2:
				System.out.println("衣服 2000");
				break;
			case 3:
				System.out.println("裤子  500");
				break;
			}
			System.out.println("是否继续(y/n)");
			answer=input.next();
		}while("y".equals(answer));
		
		
		System.out.println("程序结束!");
		
	}
}
