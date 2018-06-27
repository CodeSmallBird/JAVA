package cn.tedu.type;

import java.util.ArrayList;
import java.util.List;

public class TypeDemo3 {

	public static void main(String[] args) {

		// Number[] ns = new Integer[5];
		// List<Number> ns = new ArrayList<Integer>();

		List<Integer> ins = new ArrayList<>();
		ins.add(1);
		ins.add(2);
		ins.add(3);
		ins.add(4);

		List<Double> dos = new ArrayList<>();
		dos.add(1.5);
		dos.add(2.8);
		dos.add(3.4);
		dos.add(4.9);

		// print(ins);
		print(dos);
		// print(new ArrayList<String>());
	}

	// 写一个方法，遍历元素类型是数值类型的列表
	// ? extends Number 表示元素类型可以是Number及其子类
	// ? extends 类/接口 表示传入这个类/接口及其子类/子接口对象
	// 所能传入的元素的最大类型是Number --- 规定了泛型的上限
	public static void print(List<? extends Number> list) {

		// 能否向list中添加元素？ ---只能添加null
		list.add(null);
		// list.add(new Integer(3));

		for (Number number : list) {
			System.out.println(number);
		}

	}

	// 泛型的下限
	// 参数：元素类型为String及其父类的列表
	// ? super String  表示元素类型是String及其父类
	// ? super 类/接口  表示传入这个类/接口及其父类/父接口对象
	// 注意：在同一个泛型中，不允许同时规定上下限
	public static void m(List<? super String> list) {
		
		// 能否向list中添加元素？---可以添加下限对应的类型的对象
		list.add("abc");
		list.add(null);
		
		for (Object object : list) {
			System.out.println(object);
		}
		
	}

}
