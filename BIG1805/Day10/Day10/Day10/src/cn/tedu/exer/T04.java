package cn.tedu.exer;

import java.util.Arrays;

public class T04 {
	
	public static void main(String[] args) {
		
		int[] arr = new int[3];
		System.out.println(arr);
		
		Arrays.copyOf(arr, 10);
		System.out.println(arr);
	}

}
