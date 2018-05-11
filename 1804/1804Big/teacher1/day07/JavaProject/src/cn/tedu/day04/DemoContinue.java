package cn.tedu.day04;

import java.util.Scanner;

public class DemoContinue {
	/**
	 * •	循环录入Java课的学生成绩，统计分数大于等于80分的学生比例 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入班级的总人数");
		int num=input.nextInt();
		double count=0;//计数器
		for(int i=0;i<num;i++){
			System.out.println("请输入第"+(i+1)+"个学生的成绩");
			int score=input.nextInt();
			if(score<80){
				continue;
			}
			count++;
		}
		System.out.println("count="+count);

	}

}
