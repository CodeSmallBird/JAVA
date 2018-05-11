package cn.tedu.day06.excercise;

import java.util.Scanner;

public class DemoIF_Method {
	public void rank(int score){
		if(score<=100 && score>=0){
			if(score>90){
				System.out.println("优");
			}else if(score>80){
				System.out.println("良");
			}else if(score>60){
				System.out.println("中");
			}else{
				System.out.println("差");
			}
		}else{
			System.out.println("输入不合法");
		}		
	}
	/**
	 * 不及格的人加10分,及格的人原分数返回
	 * @param score
	 * @return
	 */
	public int rank1(int score){
		if(score>0 && score<60){
			score+=10;
			return score;
		}
		return score;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入学生成绩");
		int score=input.nextInt();
		DemoIF_Method dm=new DemoIF_Method();
		dm.rank(score);
		
		
	    //score=dm.rank1(score);
	    //dm.rank(score);
	    dm.rank(dm.rank1(score));//合并写法

	}

}
