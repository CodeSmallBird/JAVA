package cn.tedu.reflect;

/**
 * ���ϵ�ͨ�÷���
 */
public class Demo02 {
	public static void main(String[] args) throws Exception {
		Class<Person> clz = Person.class;
		//1.����ǿת
//		Ani ani = new Person();
//		Person p1 = (Person)ani;
//		Person p2 = clz.cast(ani);
		
		//2.��ȡ��ʵ�ֵ����нӿ�
//		Class<?>[] intfs = clz.getInterfaces();
//		for(Class intf : intfs){
//			System.out.println(intf.getName());
//		}
		
		//3.��ȡ����
//		System.out.println(clz.getName());
//		System.out.println(clz.getSimpleName());
	
		//4.��ȡ����Ϣ
//		Package pg = clz.getPackage();
//		System.out.println(pg.getName());
	
		//5.��ȡ����
//		Class supClz = clz.getSuperclass();
//		System.out.println(supClz.getName());
	
		//6.�ж�Class������
//		System.out.println(clz.isInterface());
		
		//7.�������� -- ����������������ײ���޲ι��캯�� �������� ����Ҫ��Class��������� �������޲ι��캯���ſ���ʹ��
//		Person p = clz.newInstance();
//		p.say();
		
	}
}
