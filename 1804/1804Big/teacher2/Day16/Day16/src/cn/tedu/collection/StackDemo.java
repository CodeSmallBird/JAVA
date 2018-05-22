package cn.tedu.collection;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {

		Stack<String> stack = new Stack<String>();

		// 入栈
		stack.push("a");
		stack.push("b");
		stack.push("c");
		stack.push("d");

		// 从栈顶到栈底来依次寻找，从1开始计数
		System.out.println(stack.search("b"));

		// 判断栈是否为空
		// System.out.println(stack.empty());

		// 出栈 ---获取并且移除栈顶元素
		// 如果栈为空，则抛出EmptyStackException
		// String str = stack.pop();
		// System.out.println(str);

		// 获取而不移除栈顶元素
		// String str = stack.peek();
		// System.out.println(str);

		System.out.println(stack);

	}

}

class LinkStack2 {

	private Node first;
	private Node last;
	private int size = 0;

	public void push(String str) {

		Node node = new Node(null, str, null);

		if (first == null) {
			this.first = node;
			this.last = node;
		} else {
			this.last.next = node;
			node.prev = this.last;
			this.last = node;
		}

		size++;

	}

	public String peek() {

		if (size == 0)
			throw new EmptyStackException();

		return this.last.data;

	}

	public String pop() {

		String str = this.peek();

		this.last = this.last.prev;
		this.last.next = null;
		size--;
		return str;

	}

	public int search(String str) {

		Node node = this.last;
		for (int i = 1; i <= size; i++) {

			if (node.data == str || str != null && str.equals(node.data))
				return i;

			node = node.prev;

		}

		return -1;

	}

	// 代表节点的类
	private class Node {

		Node prev;
		String data;
		@SuppressWarnings("unused")
		Node next;

		public Node(Node prev, String data, Node next) {
			this.prev = prev;
			this.data = data;
			this.next = next;
		}

	}

}

class LinkStack {

	private Node first;
	private Node last;
	private int size = 0;

	public void push(String str) {

		Node node = new Node(null, str, null);

		// 最后是否为null
		if (last == null) {

			this.last = node;
			this.first = node;

		} else {

			this.first.prev = node;
			node.next = this.first;
			this.first = node;

		}

		size++;

	}

	public String peek() {

		if (size == 0)
			throw new EmptyStackException();

		return this.first.data;

	}

	public String pop() {

		String str = this.peek();

		this.first = this.first.next;
		this.first.prev = null;
		size--;

		return str;

	}

	public boolean empty() {
		return size == 0;
	}

	public int search(String str) {

		Node node = this.first;
		for (int i = 1; i <= size; i++) {

			if (node.data == str || str != null && str.equals(node.data))
				return i;

			node = node.next;

		}

		return -1;
	}

	// 代表节点的类
	private class Node {

		@SuppressWarnings("unused")
		Node prev;
		String data;
		Node next;

		public Node(Node prev, String data, Node next) {
			this.prev = prev;
			this.data = data;
			this.next = next;
		}

	}

}

class ArrStack {

	// 存储数据
	private String[] data = new String[10];

	// 记录元素个数
	private int size = 0;

	public void push(String str) {

		// 判断扩容
		if (size >= data.length)
			data = Arrays.copyOf(data, data.length * 2);

		data[size++] = str;

	}

	public String peek() {

		// 判断栈是否为空
		if (size == 0)
			throw new EmptyStackException();

		return data[size - 1];

	}

	public String pop() {

		String str = this.peek();
		size--;
		return str;

	}

	public boolean empty() {
		return size == 0;
	}

	public int search(String str) {

		for (int i = size - 1; i >= 0; i--) {

			if (data[i] == str || data[i] != null && data[i].equals(str))
				return size - i;

		}

		return -1;

	}

}
