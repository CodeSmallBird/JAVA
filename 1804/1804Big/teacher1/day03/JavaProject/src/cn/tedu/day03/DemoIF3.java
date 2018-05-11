package cn.tedu.day03;

import java.util.Scanner;

public class DemoIF3 {
	/**
	 * 张浩Java成绩大于98分，而且音乐成绩大于80分，老师奖励他；
	 * 或者Java成绩等于100分，音乐成绩大于70分，老师也可以奖励他
	 * 分析:
	 *     int java;
	 *     int music;
	 *     从键盘录入两个整型数据
	 *     处理业务:
	 *         java>98 && music>80
	 *         或者 ||
	 *         java==100 && music>70
	 *         (java>98 && music>80) || (java==100 && music>70)
	 *         条件为真值  奖励金子一锭
	 *         
	 *     
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
		//获取数据
		Scanner input=new Scanner(System.in);
		System.out.println("请输入张浩的java成绩:");
		int zhang_Java=input.nextInt();
		System.out.println("请输入张浩的music成绩");
		int zhang_Music=input.nextInt();
		//处理数据
		/*if((zhang_Java>98 && zhang_Music>80) || 
				(zhang_Java==100 && zhang_Music>70)){
			//显示数据
			System.out.println("奖励金子一锭");
		}	*/
		if(zhang_Java>98 && zhang_Music>80 || 
			zhang_Java==100 && zhang_Music>70){
			//显示数据
			System.out.println("奖励金子一锭");
		}
		System.out.println("程序结束!");
	}

}
