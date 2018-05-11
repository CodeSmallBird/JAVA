package cn.tedu.day06;

import java.util.Scanner;

public class Demo1 {
	/**
	 * 3个班级各4名学员参赛，计算每个班级参赛学员的平均分
	 * 方案一:边录入,边运算,不能保留数据,不占用内存
	 * 方案二:录入数据存储二维数组中,然后再操作二维数据完成需求,数据能保留,占用内存
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int[][] scores=new int[3][4];
		for(int i=0;i<scores.length;i++){
			for(int j=0;j<scores[i].length;j++){
				System.out.println(scores[i][j]);
			}
		}
		System.out.println("------------分割线-------------");
		for(int i=0;i<scores.length;i++){
			//控制的时班级数
			System.out.println("第"+(i+1)+"个班级:");
			for(int j=0;j<scores[0].length;j++){
				//控制指定班级有多少个学生的成绩
				System.out.println("第"+(i+1)+"个班级的第"+(j+1)+"个学生的成绩:");
				scores[i][j]=input.nextInt();
			}
		}
		System.out.println("------------分割线-------------");
		for(int i=0;i<scores.length;i++){
			int sum=0;
			for(int j=0;j<scores[i].length;j++){
				sum=sum+scores[i][j];
			}
			System.out.println("第"+(i+1)+"个班级的平均分:"+(sum/scores[i].length));
		}
		
	}

	
	
	
	
	
	
	
	
	
}
