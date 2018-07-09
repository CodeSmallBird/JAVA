package cn.tedu.collection;

public class LinedListExer {

	public static void main(String[] args) {

		LinkList list = new LinkList();

		list.add("a");
		list.add("b");
		list.add("c");
		// list.add(0, "d");
		// list.add(1, "d");

		// list.remove(0);
		// list.remove(2);
		// list.remove(1);
		System.out.println(list);

		System.out.println(list.reverse());
	}

}

class LinkList {

	private int size; // 节点个数
	private Node first; // 头节点
	private Node last; // 尾节点

	/**
	 * 添加元素
	 * 
	 * @param str
	 *            元素
	 */
	public void add(String str) {

		// 先定义一个节点存储数据
		Node node = new Node(null, str, null);

		// 链表中原来是否有节点
		if (size == 0) {
			this.first = node;
			this.last = node;
		} else {

			// 原来最后一个节点下一位指向新节点
			this.last.next = node;
			// 新节点的上一位指向原来的节点
			node.prev = this.last;
			// 将last挪到新节点上
			this.last = node;

		}

		size++;
	}

	public void add(int index, String str) {

		// 判断下标是否越界
		if (index > size)
			throw new IndexOutOfBoundsException("Index:" + index + ", Size:" + size);

		// 判断是否是向最后一位放
		if (index == size) {
			add(str);
		} else if (index == 0) {

			Node node = new Node(null, str, null);

			node.next = this.first;
			this.first.prev = node;
			this.first = node;

			size++;

		} else {

			Node no = getNode(index);

			Node node = new Node(null, str, null);

			// no的上一个节点的下一位指向新的节点
			no.prev.next = node;
			// 新节点的上一位指向原节点的上一位
			node.prev = no.prev;
			// 新节点的下一位指向原节点
			node.next = no;
			// 原节点的上一位指向新节点
			no.prev = node;

			size++;

		}
	}

	private Node getNode(int index) {
		Node no = this.first;
		for (int i = 0; i < index; i++) {
			no = no.next;
		}
		return no;
	}

	private void out(int index) {
		if (index >= size)
			throw new IndexOutOfBoundsException("Index:" + index + ", Size:" + size);
	}

	/**
	 * 删除指定位置上的节点
	 * 
	 * @param index
	 *            下标
	 */
	public void remove(int index) {

		out(index);

		// 是否是头节点
		if (index == 0) {
			this.first = this.first.next;
			this.first.prev = null;
		} else if (index == size - 1) {
			this.last = this.last.prev;
			this.last.next = null;
		} else {
			// 找这个节点
			Node no = getNode(index);

			no.prev.next = no.next;
			no.next.prev = no.prev;
		}

		size--;

	}

	/**
	 * 查找指定元素出现的下标
	 * 
	 * @param str
	 *            元素
	 * @return 第一次出现的下标
	 */
	public int indexOf(String str) {

		Node no = this.first;
		for (int i = 0; i < size; i++) {

			String data = no.data;
			if (data == str || data != null && data.equals(str))
				return i;

			no = no.next;

		}

		return -1;

	}

	/**
	 * 移除指定的元素
	 * 
	 * @param str
	 *            元素
	 */
	public void remove(String str) {

		int index = indexOf(str);

		if (index != -1)
			remove(index);

	}

	/**
	 * 替换指定下标位置上的元素
	 * 
	 * @param index
	 *            下标
	 * @param str
	 *            元素
	 */
	public void set(int index, String str) {

		out(index);

		Node no = getNode(index);

		no.data = str;

	}

	/**
	 * 获取指定下标位置上的元素
	 * 
	 * @param index
	 *            下标
	 * @return 对应的元素
	 */
	public String get(int index) {

		out(index);

		Node no = getNode(index);

		return no.data;

	}

	/**
	 * 判断是否包含指定的元素
	 * 
	 * @param str
	 *            元素
	 * @return true表示包含
	 */
	public boolean contains(String str) {

		return indexOf(str) != -1;

	}

	/**
	 * 清空集合
	 */
	public void clear() {

		size = 0;

	}

	/**
	 * 获取元素个数
	 * 
	 * @return 元素个数
	 */
	public int size() {
		return size;
	}

	/**
	 * 判断列表中是否存储了元素
	 * 
	 * @return true表示列表中没有元素
	 */
	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * 反转链表，产生一个新的链表
	 * 
	 * @return 反转之后的新链表
	 */
	public LinkList reverse() {

		LinkList list = new LinkList();

		Node no = this.last;
		for (int i = 0; i < size; i++) {
			list.add(no.data);
			no = no.prev;
		}

		return list;

	}

	/**
	 * 将列表中的元素转化为字符串
	 */
	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder("[");

		Node no = this.first;
		for (int i = 0; i < size; i++) {

			sb.append(no.data).append(", ");
			no = no.next;

		}

		String str = sb.toString();

		if (size > 0)
			str = str.substring(0, str.length() - 2);

		return str += "]";
	}

	/**
	 * 代表节点的类
	 */
	private class Node {

		Node prev; // 上一个节点
		String data; // 数据
		Node next; // 下一个节点

		public Node(Node prev, String data, Node next) {
			this.prev = prev;
			this.data = data;
			this.next = next;
		}

	}

}
