package cn.tedu.type;

import java.util.ArrayList;
import java.util.List;

public class TypeDemo5 {

	public static void main(String[] args) {

		List<Double> list = new ArrayList<Double>();
		list.add(null);

		print(list);

	}

	// 遍历列表，不允许向原列表中添加元素
	public static void print(List<?> list) {

		// list.add("abc");

	}

}
