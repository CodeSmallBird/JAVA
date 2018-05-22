package cn.tedu.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {

		Queue<String> queue = new LinkedList<String>();

		// queue.add("a");
		// queue.offer("b");

		// 获取而不移除队头元素
		// 如果队列为空，则返回null
		System.out.println(queue.peek());
		// 如果队列为空，则会抛出一个异常---NoSuchElementException
		System.out.println(queue.element());

		System.out.println(queue);

	}

}
