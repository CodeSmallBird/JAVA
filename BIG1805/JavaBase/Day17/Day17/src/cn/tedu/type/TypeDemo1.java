package cn.tedu.type;

import java.util.ArrayList;
//import java.util.Iterator;
import java.util.List;

public class TypeDemo1 {

	public static void main(String[] args) {

		// List list = new ArrayList();
		// ���ֶ�����ʽֻ������������
		// List list = new ArrayList<String>();
		// List<String> list = new ArrayList();
		// List<String> list = new ArrayList<String>();
		// ������ʽ�Ǵ�JDK1.7��ʼ���ֵģ�<>���ڱ����ʱ����������Զ��Ƶ����͵�����
		List<String> list = new ArrayList<>();

		list.add("abc");
		list.add("def");
		// list.add(5);
		// list.add(5.7);
		// list.add(true);

		// Iterator it = list.iterator();
		// while (it.hasNext()) {
		// Object o = it.next();
		//
		// if (o instanceof String) {
		// String str = (String) o;
		// } else if (o instanceof Integer) {
		// Integer in = (Integer) o;
		// }
		// }

	}

}
