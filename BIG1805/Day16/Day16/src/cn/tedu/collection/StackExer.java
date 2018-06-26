package cn.tedu.collection;

import java.util.Arrays;
import java.util.EmptyStackException;

public class StackExer {

}

class LinkedStack {

	private int size = 0;
	private Node first;

	public void push(String str) {

		Node node = new Node(str, null);

		node.next = this.first;
		this.first = node;
		size++;

	}

	public String peek() {

		if (size == 0)
			throw new EmptyStackException();

		return this.first.data;

	}

	public String pop() {

		String str = peek();

		this.first = this.first.next;
		size--;
		return str;

	}

	public boolean empty() {
		return size == 0;
	}

	public int search(String str) {

		Node node = this.first;

		for (int i = 0; i < size; i++) {
			if (node.data == str || str != null && str.equals(node.data))
				return i + 1;

			node = node.next;
		}

		return -1;

	}

	private class Node {

		String data;
		Node next;

		public Node(String data, Node next) {
			this.data = data;
			this.next = next;
		}

	}
}

class ArrayStack {

	private String[] data = new String[10];
	private int size = 0;

	public void push(String str) {

		if (size >= data.length)
			data = Arrays.copyOf(data, data.length * 2);

		data[size++] = str;

	}

	public String peek() {

		if (size == 0)
			throw new EmptyStackException();

		return data[size - 1];

	}

	public String pop() {

		String str = peek();

		size--;
		return str;

	}

	public boolean empty() {
		return size == 0;
	}

	public int search(String str) {

		for (int i = size - 1; i >= 0; i--) {

			if (data[i] == str || str != null && str.equals(data[i]))
				return size - i;

		}

		return -1;

	}

}