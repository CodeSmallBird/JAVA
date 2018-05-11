package cn.tedu.day05;

import java.util.ArrayList;

public class DemoArray7_3 {
	/**
	 * 縮容
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums = new int[] { 33, 22, 1, 66, 100, 23, 15 };
		nums=java.util.Arrays.copyOf(nums, 5);
		for(int num : nums){
			System.out.println(num);
		}
		System.out.println(nums);
		
	}
}
