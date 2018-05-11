package cn.tedu.day03;

import java.util.Scanner;

public class DemoIF2 {
	/**
	 * 如果张浩Java考试成绩大于98分，老师就奖励他一个MP4，否则老师就罚他进行编码
	 * 分析:
	 *    定义一个变量存储java的成绩,从键盘录入java成绩
	 *    判断成绩是否大于98 if()
	 *    不大于会有惩罚  else{}
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 实例化Scanner 对象input  从键盘获取数据
		 * 需要导入Scanner隶属哪个包中
		 * ctrl+shift+o    
		 * 注意,按快捷键的时候,注意输入法不要中文的,尤其是搜狗输入法
		 *     把书法法关掉,或切换成英文
		 */
		Scanner input=new Scanner(System.in);
		System.out.println("请输入张浩的java成绩:");
		int zhangScore=input.nextInt();
		
		if(zhangScore>98){
			System.out.println("奖励一个女朋友");
		}else{
			System.out.println("give hand on face!");
		}		
		System.out.println("程序结束!");
	}

}
