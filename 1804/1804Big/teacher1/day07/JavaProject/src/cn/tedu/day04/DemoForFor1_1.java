package cn.tedu.day04;

import java.util.Scanner;

public class DemoForFor1_1 {
	/**
	 * •	3个班级各4名学员参赛，计算每个班级参赛学员的平均分
	 *     for
	 *     外层循环控制班级个数
	 *        内层循环控制学生个数
	 *        
	 *     在内层循环中计算某个班级学生成绩的总和
	 *     在外层循环计算平均分
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		for(int i=0;i<3;i++){//外层循环控制班级个数
			double sum=0;
			System.out.println("第"+(i+1)+"个班级");
			for(int j=0;j<4;j++){//内层循环控制学生数
				System.out.println("请输入第"+(i+1)+"个班级的第"+(j+1)+"个学生成绩");
				int score=input.nextInt();
				sum+=score;
			}
			System.out.println("第"+(i+1)+"平均分:"+(sum/4));
		}
		
		
	}
}
