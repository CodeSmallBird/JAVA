package cn.tedu.day04;

import java.util.Scanner;

public class DemoFor1_3 {
	/**
	 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Scanner  input =new Scanner(System.in);
	   System.out.println("请输入一个数字");
	   int num=input.nextInt();
       for(int i=0,j=num;i<=num;i++,j--){
    	   System.out.println(i+"+"+j+"="+(i+j));
       }
	}

}
