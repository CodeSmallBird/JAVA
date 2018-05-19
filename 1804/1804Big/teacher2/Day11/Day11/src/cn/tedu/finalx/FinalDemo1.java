package cn.tedu.finalx;

import java.util.Arrays;

public class FinalDemo1 {

	public static void main(String[] args) {

		// 定义好之后不能二次赋值
		final int i = 5;
		add(i);

		int j = 5;
		print(j);

		// 数组是一个引用类型的数据，那么arr存储的值是地址
		final int[] arr = new int[3];
		arr[0] = 15;

		changeRef(arr);
		System.out.println(arr.length);
		// arr.length = 7;

	}

	public static void changeRef(int[] arr) {

		// arr = new int[5];
		// arr[0] += 5;
		arr = Arrays.copyOf(arr, arr.length * 2);

	}

	public static void print(final int j) {
		System.out.println(j);
	}

	public static void add(int i) {
		i++;
		System.out.println(i);
	}

}
