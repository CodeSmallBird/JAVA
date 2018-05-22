package cn.tedu.type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TypeDemo4 {

	public static void main(String[] args) {

		// List<Integer> ins = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		List<Integer> ins = new ArrayList<>();
		ins.add(3);
		List<Double> dos = Arrays.asList(1.2, 2.2, 3.3, 4.3, 5.4, 6.5, 7.1);

		print(ins);
		print(dos);
	}

	// 泛型的继承
	// 遍历元素类型是数字的列表
	// ? extends 类/接口 表示可以传入这个类/接口及其子类/子接口
	// ? extends Number 表示可以传入Number及其子类对象
	// 规定泛型的上限/上边界
	public static void print(List<? extends Number> list) {

		// 能否向集合中添加元素？---不能
		// 类型可能不匹配
		// list.add(3);
		list.add(null);

		for (Number number : list) {
			System.out.println(number);
		}
	}
	
	// List<String> strs;
	// 泛型的下限/下边界
	// 遍历元素类型是String或者其父类的列表
	public static void m(List<? super String> list){
		
		list.add("abc");
		
		for (Object object : list) {
			System.out.println(object);
		}
		
	}

}
