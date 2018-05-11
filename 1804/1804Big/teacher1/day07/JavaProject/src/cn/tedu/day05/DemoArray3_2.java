package cn.tedu.day05;

import java.util.Arrays;

public class DemoArray3_2 {
	/**
	 * 数组的排序
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums = new int[] { 33, 22, 1, 66, 100, 23, 15 };
		System.out.println(nums);
		//快速排序
		for (int i = 1; i < nums.length; i++) { // 控制轮数和选择的下标
			for (int j = 1 + i; j <= nums.length; j++) { // 控制次数和比 较的下标
				if (nums[i - 1] > nums[j - 1]) {
					int temp = nums[i - 1];
					nums[i - 1] = nums[j - 1];
					nums[j - 1] = temp;
				}
			}
		}

		for (int num : nums) {
			System.out.println(num);
		}
		System.out.println(nums);

	}

}
