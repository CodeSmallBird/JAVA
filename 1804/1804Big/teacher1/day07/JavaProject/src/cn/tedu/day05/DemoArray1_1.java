package cn.tedu.day05;

import java.util.Scanner;

public class DemoArray1_1 {
   /**
    * 计算全班学员的平均分
    * 分析:
    *     1.从键盘获取学生的成绩
    *     2.遍录入边累和
    *       再算平均分
    *     3.输出平均分
    *   优点,省内存
    *   缺点,数据无法保留
    * 
    * @param args
    */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double sum=0;
		for(int i=1;i<=5;i++){
			System.out.println("请输入第"+i+"个学生的成绩:");
			int score=input.nextInt();
			sum+=score;
		}
		System.out.println("平均分:"+(sum/5));
	}

}
