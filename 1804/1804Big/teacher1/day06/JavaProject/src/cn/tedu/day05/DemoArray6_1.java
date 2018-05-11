package cn.tedu.day05;

public class DemoArray6_1 {
	public static void main(String[] args) {
		int[] nums = new int[] { 33, 22, 1, 66, 100, 23, 15 };
		int[] dest=new int[nums.length];
		System.arraycopy(nums, 1, dest, 2, 5);
		for(int n: dest){
			System.out.println(n);
		}
	}
}
