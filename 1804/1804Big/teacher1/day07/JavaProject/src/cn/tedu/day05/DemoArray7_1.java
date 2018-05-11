package cn.tedu.day05;

public class DemoArray7_1 {
	/**
	 * 擴容
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums = new int[] { 33, 22, 1, 66, 100, 23, 15 };
		int[] newNums=java.util.Arrays.copyOf(nums, 10);
		for(int num : newNums){
			System.out.println(num);
		}
	}
}
