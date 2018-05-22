package cn.tedu.collection;

import java.util.Arrays;

public class ListExer {

	public static void main(String[] args) {

		ArrList list = new ArrList(3);

		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");

		// list.add(0, "e");

		list.remove(0);

		System.out.println(list);

	}

}

class ArrList {

	// 存储数据
	private String[] data;
	// 记录元素个数
	private int size = 0;

	public ArrList() {
		this.data = new String[10];
	}

	public ArrList(int initialCapacity) {

		if (initialCapacity < 0)
			throw new IllegalArgumentException("" + initialCapacity);

		this.data = new String[initialCapacity];
	}

	private void grow() {

		if (data.length <= 1) {
			data = Arrays.copyOf(data, data.length + 1);
		} else {
			data = Arrays.copyOf(data, data.length + (data.length >> 1));
		}
	}

	public void add(String str) {

		// 判断扩容
		if (size >= data.length)
			this.grow();

		data[size++] = str;
	}

	public void add(int index, String str) {

		// 判断下标是否越界
		if (index > size)
			throw new IndexOutOfBoundsException("Index:" + index + ", Size:" + size);

		// 判断扩容
		if (size >= data.length)
			this.grow();

		// for (int i = size - 1; i >= index; i--) {
		// data[i + 1] = data[i];
		// }

		System.arraycopy(data, index, data, index + 1, size - index);

		data[index] = str;

		size++;

	}

	private void out(int index) {
		if (index >= size)
			throw new IndexOutOfBoundsException("Index:" + index + ", Size:" + size);
	}

	public void remove(int index) {

		// 判断越界
		this.out(index);

		// for(int i = index; i < size - 1; i++){
		// data[i] = data[i + 1];
		// }
		System.arraycopy(data, index + 1, data, index, size - index - 1);
		size--;

	}

	public void remove(String str) {

		// 获取这个元素的下标
		int index = this.indexOf(str);

		if (index != -1)
			this.remove(index);
	}

	public void set(int index, String str) {

		this.out(index);

		data[index] = str;
	}

	public String get(int index) {

		this.out(index);

		return data[index];

	}

	public int indexOf(String str) {

		for (int i = 0; i < size; i++) {

			if (data[i] == str || data[i] != null && data[i].equals(str)) {
				return i;
			}

		}

		return -1;

	}

	public boolean contains(String str) {
		return this.indexOf(str) > -1;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size <= 0;
	}

	public String toString() {

		StringBuilder sb = new StringBuilder("[");

		for (int i = 0; i < size; i++) {
			sb.append(data[i]).append(", ");
		}

		String str = sb.toString();

		if (size > 0)
			str = str.substring(0, str.length() - 2);

		return str += "]";

	}

}