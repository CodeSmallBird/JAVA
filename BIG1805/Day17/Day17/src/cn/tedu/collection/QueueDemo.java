package cn.tedu.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {

		Queue<String> queue = new LinkedList<String>();

		// ���Ԫ��
		queue.add(null);
		queue.add("b");
		queue.add("c");
		queue.add("d");

		// ��ȡ�����Ƴ���ͷԪ��
		// �������Ϊ�գ����׳�һ��NoSuchElementException
		// System.out.println(queue.element());
		// �������Ϊ�գ��򷵻�null
		System.out.println(queue.peek());

		System.out.println(queue);

	}

}
