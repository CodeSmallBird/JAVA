package cn.tedu.object;

public class ObjectDemo1 implements Cloneable {

	int i;

	public static void main(String[] args) throws Exception {

		ObjectDemo1 od1 = new ObjectDemo1();
		od1.i = 5;

		// ��¡һ������
		ObjectDemo1 od2 = (ObjectDemo1) od1.clone();
		System.out.println(od2.i);
		
		System.out.println(od1);
		System.out.println(od2);
		
		Object o = "abc";
		// ��ȡ�Ķ����ʵ����
		System.out.println(o.getClass());

	}

}
