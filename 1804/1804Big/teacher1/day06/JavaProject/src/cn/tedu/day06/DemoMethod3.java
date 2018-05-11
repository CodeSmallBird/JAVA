package cn.tedu.day06;

import java.util.ArrayList;

public class DemoMethod3 {
	/**
	 * 如果传递参数是100以内就直接返回这个值
	 * 否则,给这个值减去100,再返回
	 * @param a
	 * @return
	 */
	public int method1(int a){
		if(a<100){
			return a;
		}else{
			return a-100;
		}
		//System.out.println("方法结束");//此代码永远不会执行
	}
	public static void main(String[] args) {
		DemoMethod3 dm3=new DemoMethod3();
		System.out.println(dm3.method1(10));
		System.out.println(dm3.method1(110));
		
	}

}
