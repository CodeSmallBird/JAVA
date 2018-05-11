package cn.tedu.day05;

import java.util.Scanner;

public class DemoArray1_2 {
   /**
    * 计算全班学员的平均分
    * 分析:
    *     1.从键盘获取学生的成绩
    *     2.先录入数据存储给数组
    *       然后再循环遍历数组,求和后再求平均分
    *     3.输出平均分
    *   优点:数据能保留
    *   缺点:占用内存空间
    * 
    * @param args
    */
	public static void main(String[] args) {
	
		Scanner input=new Scanner(System.in);
		int[] scores=new int[5];
		double sum=0;
		for(int i=0;i<5;i++){
			System.out.println("请输入第"+i+"个学生的成绩:");
			scores[i]=input.nextInt();
		}
		for(int i=0;i<5;i++){
			sum+=scores[i];
		}
		System.out.println("平均分:"+(sum/5));
	}

}
