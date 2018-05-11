package cn.tedu.day03;

import java.util.Scanner;

public class DemoIF4 {
	/**
	 * 普通顾客购物满100元打9折；会员购物打8折；会员购物满200元打7.5折
	 * 分析:
	 *    1获取数据 从键盘获取消费金额
	 *    2.判断业务逻辑
	 *      -外层if 判断是否是会员
	 *        if(不是会员){
	 *        	//普通顾客
	 *          if(满100){
	 *          	//九折
	 *          }else{
	 *          	//原价
	 *          }
	 *        }else{
	 *        	//会员
	 *          if(大于200){
	 *          	7.5折扣
	 *          }else{
	 *          	八折
	 *          }
	 *        }
	 *    3.显示实际(折后)消费金额
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
		System.out.println("是否是会员(y/n)");
		String vip=input.next();
		System.out.println("消费金额");
		double money=input.nextDouble();
		if(!"y".equals(vip)){
			//不是会员
			if(money>=100){
				System.out.println("折后金额:"+(money*0.9));
			}else{
				System.out.println("折后金额:"+(money));
			}
		}else{
			//是会员
			if(money>=200){
				System.out.println("折后金额:"+(money*0.75));
			}else{
				System.out.println("折后金额:"+(money*0.8));
			}
		}	
		
		System.out.println("程序结束!");
	}

}
