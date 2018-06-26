package cn.tedu.collection;

import java.util.Arrays;

public class ListExer {

	public static void main(String[] args) {

		ArrList list = new ArrList(3);

		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");

		list.add(0, "f");

		// list.remove(0);

		System.out.println(list);

	}

}

class ArrList {

	private String[] data;
	private int size;

	/**
	 * 初始化列表，并且默认容量为10
	 */
	public ArrList() {
		data = new String[10];
	}

	/**
	 * 利用指定的容量来创建一个列表
	 * 
	 * @param initialCapacity
	 *            初始容量
	 */
	public ArrList(int initialCapacity) {

		// 判断容量是否合法
		if (initialCapacity < 0)
			throw new IllegalArgumentException();

		data = new String[initialCapacity];
	}

	/**
	 * 添加元素
	 * 
	 * @param str
	 *            元素
	 */
	public void add(String str) {

		// 判断数组是否需要扩容
		if (size >= data.length)
			grow();

		data[size++] = str;
	}

	private void grow() {
		if (data.length <= 1)
			data = Arrays.copyOf(data, data.length + 1);
		else
			data = Arrays.copyOf(data, data.length + (data.length >> 1));
	}

	/**
	 * 在指定的下标位置上插入元素
	 * 
	 * @param index
	 *            下标
	 * @param str
	 *            元素
	 */
	public void add(int index, String str) {

		// 判断下标越界
		if (index > size)
			throw new IndexOutOfBoundsException("Index:" + index + ", Size:" + size);

		// 判断是否需要扩容
		if (size >= data.length)
			grow();

		// for(int i = size - 1; i >= index; i--){
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

	/**
	 * 移除指定下标上的元素
	 * 
	 * @param index
	 *            下标
	 */
	public void remove(int index) {

		out(index);

		// for(int i = index; i < size - 1; i++){
		// data[i] = data[i + 1];
		// }

		System.arraycopy(data, index + 1, data, index, size - index - 1);

		size--;

	}

	/**
	 * 获取指定的元素第一次出现的下标
	 * 
	 * @param str
	 *            元素
	 * @return 第一次出现的下标
	 */
	public int indexOf(String str) {

		for (int i = 0; i < size; i++) {
			if (str == data[i] || str != null && str.equals(data[i]))
				return i;
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

		// 先获取这个元素的第一次出现的下标
		int index = indexOf(str);

		if (index != -1)
			remove(index);

	}

	/**
	 * 替换指定位置上的元素
	 * 
	 * @param index
	 *            下标
	 * @param str
	 *            元素
	 */
	public void set(int index, String str) {

		out(index);

		data[index] = str;
	}

	/**
	 * 获取指定位置上的元素
	 * 
	 * @param index
	 *            下标
	 * @return 元素
	 */
	public String get(int index) {

		out(index);

		return data[index];

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
	 * 清空集合
	 */
	public void clear() {
		// 方式一：遍历数组，逐个删除
		// 方式二：重建数组
		// data = new String[10];
		// 方式三：size表示元素个数，同时控制着要操作的下标
		size = 0;
	}

	/**
	 * 将列表中的元素转化为字符串
	 */
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