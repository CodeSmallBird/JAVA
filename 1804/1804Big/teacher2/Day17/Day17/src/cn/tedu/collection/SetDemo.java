package cn.tedu.collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {

		Set<String> set = new LinkedHashSet<String>();

		// 添加元素
		set.add("swa");
		set.add("eaf");
		set.add("abg");
		set.add("lmw");
		set.add("okd");
		// 出现重复元素之后是舍弃还是覆盖？---舍弃
		set.add(new String("swa"));
		
		for (String str : set) {
			System.out.println(str == "swa");
		}
		
		System.out.println(set);

	}

}
