package cn.tedu.day04;

import java.util.Scanner;

public class DemoSwitch1_3 {
	/**
	 * 小王参加计算机编程大赛
		如果获得第一名，将参加麻省理工大学组织的1个月夏令营
		如果获得第二名，将奖励惠普笔记本电脑一部
		如果获得第三名，将奖励移动硬盘一个
		否则，不给任何奖励
		分析:
		    从键盘获取名次
		  分支处理业务(switch)
		  显示处理后的结果

	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("请输入小王的名次");
		int rank=input.nextInt();
		switch(rank){
		case 1:
			System.out.println("奖励山沟一日游");
			break;			
		case 2:
			System.out.println("奖励玉米饼子一个");
			break;
		case 3:
			System.out.println("奖励黄瓜一根");
			break;
		default:
			System.out.println("没有奖励");
			break;
		
		}
	}

}
