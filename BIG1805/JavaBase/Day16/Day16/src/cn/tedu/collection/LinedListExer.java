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

	private int size; // �ڵ����
	private Node first; // ͷ�ڵ�
	private Node last; // β�ڵ�

	/**
	 * ���Ԫ��
	 * 
	 * @param str
	 *            Ԫ��
	 */
	public void add(String str) {

		// �ȶ���һ���ڵ�洢����
		Node node = new Node(null, str, null);

		// ������ԭ���Ƿ��нڵ�
		if (size == 0) {
			this.first = node;
			this.last = node;
		} else {

			// ԭ�����һ���ڵ���һλָ���½ڵ�
			this.last.next = node;
			// �½ڵ����һλָ��ԭ���Ľڵ�
			node.prev = this.last;
			// ��lastŲ���½ڵ���
			this.last = node;

		}

		size++;
	}

	public void add(int index, String str) {

		// �ж��±��Ƿ�Խ��
		if (index > size)
			throw new IndexOutOfBoundsException("Index:" + index + ", Size:" + size);

		// �ж��Ƿ��������һλ��
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

			// no����һ���ڵ����һλָ���µĽڵ�
			no.prev.next = node;
			// �½ڵ����һλָ��ԭ�ڵ����һλ
			node.prev = no.prev;
			// �½ڵ����һλָ��ԭ�ڵ�
			node.next = no;
			// ԭ�ڵ����һλָ���½ڵ�
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
	 * ɾ��ָ��λ���ϵĽڵ�
	 * 
	 * @param index
	 *            �±�
	 */
	public void remove(int index) {

		out(index);

		// �Ƿ���ͷ�ڵ�
		if (index == 0) {
			this.first = this.first.next;
			this.first.prev = null;
		} else if (index == size - 1) {
			this.last = this.last.prev;
			this.last.next = null;
		} else {
			// ������ڵ�
			Node no = getNode(index);

			no.prev.next = no.next;
			no.next.prev = no.prev;
		}

		size--;

	}

	/**
	 * ����ָ��Ԫ�س��ֵ��±�
	 * 
	 * @param str
	 *            Ԫ��
	 * @return ��һ�γ��ֵ��±�
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
	 * �Ƴ�ָ����Ԫ��
	 * 
	 * @param str
	 *            Ԫ��
	 */
	public void remove(String str) {

		int index = indexOf(str);

		if (index != -1)
			remove(index);

	}

	/**
	 * �滻ָ���±�λ���ϵ�Ԫ��
	 * 
	 * @param index
	 *            �±�
	 * @param str
	 *            Ԫ��
	 */
	public void set(int index, String str) {

		out(index);

		Node no = getNode(index);

		no.data = str;

	}

	/**
	 * ��ȡָ���±�λ���ϵ�Ԫ��
	 * 
	 * @param index
	 *            �±�
	 * @return ��Ӧ��Ԫ��
	 */
	public String get(int index) {

		out(index);

		Node no = getNode(index);

		return no.data;

	}

	/**
	 * �ж��Ƿ����ָ����Ԫ��
	 * 
	 * @param str
	 *            Ԫ��
	 * @return true��ʾ����
	 */
	public boolean contains(String str) {

		return indexOf(str) != -1;

	}

	/**
	 * ��ռ���
	 */
	public void clear() {

		size = 0;

	}

	/**
	 * ��ȡԪ�ظ���
	 * 
	 * @return Ԫ�ظ���
	 */
	public int size() {
		return size;
	}

	/**
	 * �ж��б����Ƿ�洢��Ԫ��
	 * 
	 * @return true��ʾ�б���û��Ԫ��
	 */
	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * ��ת��������һ���µ�����
	 * 
	 * @return ��ת֮���������
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
	 * ���б��е�Ԫ��ת��Ϊ�ַ���
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
	 * ����ڵ����
	 */
	private class Node {

		Node prev; // ��һ���ڵ�
		String data; // ����
		Node next; // ��һ���ڵ�

		public Node(Node prev, String data, Node next) {
			this.prev = prev;
			this.data = data;
			this.next = next;
		}

	}

}
