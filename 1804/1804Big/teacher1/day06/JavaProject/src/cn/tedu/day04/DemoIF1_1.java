package cn.tedu.day04;

import java.util.Scanner;

public class DemoIF1_1 {
	/**
	 * 对学员的结业考试成绩评测
 	          成绩>=90 ：优秀
 		成绩>=80 ：良好 	
 		成绩>=60 ：中等
 		成绩<60   ：差
 		分析:
 		    1.从键盘录入成绩
 		    2.判断业务操作
 	                             下面的代码业务,没有完成需求
 		    3.显示结果(优良中差)提示

	 * @param args
	 */
	public static void main(String[] args) {
		//构建数据
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个成绩:");
		int score=input.nextInt();
		//业务操作
		if(score>=90){
			System.out.println("优");
		}
		if(score>=80){
			System.out.println("良");
		}
		if(score>=60){
			System.out.println("中");
		}
		if(score<60){
			System.out.println("差");
		}
		

	}

}
