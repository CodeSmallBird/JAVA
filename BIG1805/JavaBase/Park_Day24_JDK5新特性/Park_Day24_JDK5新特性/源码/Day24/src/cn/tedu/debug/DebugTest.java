package cn.tedu.debug;

public class DebugTest {
	public static int getMax(int [] nums){
		int i = Integer.MIN_VALUE;
		for(int num : nums){
			if(num>i){
				i = num;
			}
		}
		return i;
	}
	
	public static void main(String[] args) {
		int arr[] = {-3,-1,-9,-5,-7};
		int max = getMax(arr);
		System.out.println(max);
	}
}
