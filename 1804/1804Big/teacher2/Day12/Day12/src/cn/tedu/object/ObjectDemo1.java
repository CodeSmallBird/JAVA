package cn.tedu.object;

public class ObjectDemo1 implements Cloneable {

	int i;

	public static void main(String[] args) throws Exception {

		ObjectDemo1 o1 = new ObjectDemo1();
		o1.i = 7;

		// ��¡�ǲ���һ���µĶ���
		ObjectDemo1 o2 = (ObjectDemo1) o1.clone();
		System.out.println(o2.i);
		
		System.out.println(o1 == o2);
		
		Object o = "abc";
		// ��ȡ�����ʵ������
		System.out.println(o.getClass());
		
	}

}
