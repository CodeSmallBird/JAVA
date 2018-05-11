package cn.tedu.day05;

import java.util.ArrayList;

public class DemoArray7_2 {
	/**
	 * 縮容
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums = new int[] { 33, 22, 1, 66, 100, 23, 15 };
		int[] newNums=java.util.Arrays.copyOf(nums, 5);
		for(int num : newNums){
			System.out.println(num);
		}
		System.out.println(nums);
		System.out.println(newNums);
	}
}
