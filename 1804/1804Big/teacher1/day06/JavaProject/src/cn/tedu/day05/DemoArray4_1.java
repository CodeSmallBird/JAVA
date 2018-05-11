package cn.tedu.day05;

public class DemoArray4_1 {
	/**
	 * 数组的反转
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums = new int[] { 33, 22, 1, 66, 100, 23, 15 };
		for (int start = 0, end = nums.length - 1; start < end; start++, end--) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
		}
		for(int num : nums){
			System.out.println(num);
		}

	}

}
