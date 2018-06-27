package cn.tedu.type;

import java.util.ArrayList;
import java.util.List;

public class TypeDemo4 {

	public static void main(String[] args) {

		// List<?> list = new ArrayList<Integer>();
		// List list = new ArrayList<Integer>();

		// list.add(4);

		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(5);
		list.add(6);

		print(list);

	}

	public static void print(List<?> list) {

		// list.add("abc");

		for (Object object : list) {
			System.out.println(object);
		}
	}

}
