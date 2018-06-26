package cn.tedu.collection;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {

		Stack<String> s = new Stack<String>();

		// 入栈
		s.push("a");
		s.push("b");
		s.push("c");
		s.push("d");

		// 从栈顶到栈底依次查找，基数为1
		System.out.println(s.search(""));

		// 判断栈是否为空
		// System.out.println(s.empty());

		// 获取而不移除栈顶元素
		// 如果栈为空的话，会抛出一个EmptyStackException---空栈异常
		// System.out.println(s.peek());

		// 出栈
		// System.out.println(s.pop());

		System.out.println(s);
	}

}
