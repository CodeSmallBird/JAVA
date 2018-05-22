package cn.tedu.collection;

public class LinkedListExer {

	public static void main(String[] args) {

		LinkList list = new LinkList();

		list.add("a");
		list.add("b");
		list.add("c");

		list.add(0, "d");

		list.add(2, "e");

		list.remove(3);

		System.out.println(list);

	}

}

class LinkList {

	private Node first; // 第一个节点
	private Node last; // 最后一个节点
	private int size; // 节点的个数

	public void add(String str) {

		// 创建一个节点存储数据
		Node node = new Node(null, str, null);

		// 判断是否是第一个节点
		if (size == 0) {
			this.first = node;
			this.last = node;
		} else {

			// 将最后一个节点的下一位指向新节点
			this.last.next = node;
			// 将新节点的上一位指向原来的最后一个节点
			node.prev = this.last;
			// 需要将新节点设置为最后一个节点
			this.last = node;
		}

		size++;

	}

	private Node getNode(int index) {

		// 先记录第一个节点
		Node no = this.first;
		for (int i = 0; i < index; i++) {
			no = no.next;
		}
		return no;

	}

	public void add(int index, String str) {

		// 判断下标越界
		if (index > size)
			throw new IndexOutOfBoundsException("Index:" + index + ", Size:" + size);

		// 是否是向尾部添加
		if (index == size) {
			this.add(str);
			return;
		}

		// 将元素放入一个新的节点中
		Node node = new Node(null, str, null);

		// 判断是否是在头部插入
		if (index == 0) {

			// 原来的第一个节点的上一个节点变成新节点
			this.first.prev = node;
			// 新节点的下一位成为原来的第一个节点
			node.next = this.first;
			// 新节点成为第一个节点
			this.first = node;

		} else {

			Node no = this.getNode(index);

			// 原节点的上一位的下一位指向新节点
			no.prev.next = node;
			// 新节点的上一位变成要原节点的上一位
			node.prev = no.prev;
			// 新节点的下一位变成原节点
			node.next = no;
			// 原节点的上一位变成新节点
			no.prev = node;

		}

		size++;

	}

	private void out(int index) {
		if (index >= size)
			throw new IndexOutOfBoundsException("Index:" + index + ", Size:" + size);
	}

	public void remove(int index) {

		// 判断越界
		this.out(index);

		// 判断是否移除第一个元素
		if (index == 0) {

			// 第一位元素实际上是原来的第二位
			this.first = this.first.next;
			// 第一位元素的上一位置为null
			this.first.prev = null;

		} else if (index == size - 1) {

			// 将倒数第二个元素变为最后一位元素
			this.last = this.last.prev;
			// 新的最后一位的下一位置为null
			this.last.next = null;
		} else {

			// 先找到移除的这个节点
			Node node = this.getNode(index);

			// 上一个节点的下一位指向下一个节点
			node.prev.next = node.next;
			// 下一个节点的上一位指向上一个节点
			node.next.prev = node.prev;

		}

		size--;

	}

	public void remove(String str) {

		int index = this.indexOf(str);

		if (index != -1) {
			remove(index);
		}

	}

	public int indexOf(String str) {

		// 记录第一个节点
		Node node = this.first;
		for (int i = 0; i < size; i++) {

			if (node.data == str || str != null && str.equals(node.data)) {
				return i;
			}

			node = node.next;

		}

		return -1;

	}

	public String get(int index) {

		this.out(index);

		return this.getNode(index).data;

	}

	public void set(int index, String str) {

		this.out(index);

		this.getNode(index).data = str;

	}

	public String toString() {

		StringBuilder sb = new StringBuilder("[");

		// 记录第一个节点
		Node node = this.first;

		for (int i = 0; i < size; i++) {

			sb.append(node.data).append(", ");

			node = node.next;

		}

		String str = sb.toString();

		if (size > 0)
			str = str.substring(0, str.length() - 2);

		return str += "]";
	}

	// 因为不需要对外公开，所以将节点类设置为私有的内部类
	private class Node {

		Node prev; // 上一个节点
		String data; // 存储数据
		Node next; // 下一个节点

		public Node(Node prev, String data, Node next) {
			this.prev = prev;
			this.data = data;
			this.next = next;
		}

	}

}