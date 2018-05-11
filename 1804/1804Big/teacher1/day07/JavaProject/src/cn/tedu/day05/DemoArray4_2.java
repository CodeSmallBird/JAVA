package cn.tedu.day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoArray4_2 {
	/**
	 * 数组的反转(现阶段超纲)
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//int[] nums = new int[] { 33, 22, 1, 66, 100, 23, 15 };
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(33);
		list.add(22);
		list.add(1);
		list.add(66);
		list.add(100);
		list.add(23);
		list.add(15);
		Collections.reverse(list);
		System.out.println(list.toString());

	}

}
