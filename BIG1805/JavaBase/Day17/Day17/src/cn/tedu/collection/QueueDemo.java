package cn.tedu.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {

		Queue<String> queue = new LinkedList<String>();

		// 添加元素
		queue.add(null);
		queue.add("b");
		queue.add("c");
		queue.add("d");

		// 获取而不移除队头元素
		// 如果队列为空，则抛出一个NoSuchElementException
		// System.out.println(queue.element());
		// 如果队列为空，则返回null
		System.out.println(queue.peek());

		System.out.println(queue);

	}

}
