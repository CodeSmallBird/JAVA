package cn.tedu.day05;

import java.util.Arrays;

public class DemoArray3_1 {
	/**
	 * 数组的排序
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums=new int[]{33,22,1,66,100,23,15};
		System.out.println(nums);
		//排序
		Arrays.sort(nums);
		for(int num :nums){
			System.out.println(num);
		}
		System.out.println(nums);
		

	}

}
