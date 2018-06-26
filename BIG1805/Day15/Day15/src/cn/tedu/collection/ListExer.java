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
	 * ��ʼ���б�����Ĭ������Ϊ10
	 */
	public ArrList() {
		data = new String[10];
	}

	/**
	 * ����ָ��������������һ���б�
	 * 
	 * @param initialCapacity
	 *            ��ʼ����
	 */
	public ArrList(int initialCapacity) {

		// �ж������Ƿ�Ϸ�
		if (initialCapacity < 0)
			throw new IllegalArgumentException();

		data = new String[initialCapacity];
	}

	/**
	 * ���Ԫ��
	 * 
	 * @param str
	 *            Ԫ��
	 */
	public void add(String str) {

		// �ж������Ƿ���Ҫ����
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
	 * ��ָ�����±�λ���ϲ���Ԫ��
	 * 
	 * @param index
	 *            �±�
	 * @param str
	 *            Ԫ��
	 */
	public void add(int index, String str) {

		// �ж��±�Խ��
		if (index > size)
			throw new IndexOutOfBoundsException("Index:" + index + ", Size:" + size);

		// �ж��Ƿ���Ҫ����
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
	 * �Ƴ�ָ���±��ϵ�Ԫ��
	 * 
	 * @param index
	 *            �±�
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
	 * ��ȡָ����Ԫ�ص�һ�γ��ֵ��±�
	 * 
	 * @param str
	 *            Ԫ��
	 * @return ��һ�γ��ֵ��±�
	 */
	public int indexOf(String str) {

		for (int i = 0; i < size; i++) {
			if (str == data[i] || str != null && str.equals(data[i]))
				return i;
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

		// �Ȼ�ȡ���Ԫ�صĵ�һ�γ��ֵ��±�
		int index = indexOf(str);

		if (index != -1)
			remove(index);

	}

	/**
	 * �滻ָ��λ���ϵ�Ԫ��
	 * 
	 * @param index
	 *            �±�
	 * @param str
	 *            Ԫ��
	 */
	public void set(int index, String str) {

		out(index);

		data[index] = str;
	}

	/**
	 * ��ȡָ��λ���ϵ�Ԫ��
	 * 
	 * @param index
	 *            �±�
	 * @return Ԫ��
	 */
	public String get(int index) {

		out(index);

		return data[index];

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
	 * ��ռ���
	 */
	public void clear() {
		// ��ʽһ���������飬���ɾ��
		// ��ʽ�����ؽ�����
		// data = new String[10];
		// ��ʽ����size��ʾԪ�ظ�����ͬʱ������Ҫ�������±�
		size = 0;
	}

	/**
	 * ���б��е�Ԫ��ת��Ϊ�ַ���
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