package cn.tedu.collection;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {

		Stack<String> s = new Stack<String>();

		// ��ջ
		s.push("a");
		s.push("b");
		s.push("c");
		s.push("d");

		// ��ջ����ջ�����β��ң�����Ϊ1
		System.out.println(s.search(""));

		// �ж�ջ�Ƿ�Ϊ��
		// System.out.println(s.empty());

		// ��ȡ�����Ƴ�ջ��Ԫ��
		// ���ջΪ�յĻ������׳�һ��EmptyStackException---��ջ�쳣
		// System.out.println(s.peek());

		// ��ջ
		// System.out.println(s.pop());

		System.out.println(s);
	}

}
