package cn.tedu.object;

public class ObjectDemo2 {
	
	public static void main(String[] args) {
		
		Object o = new Object();
		
		// ��ϣ���Ǹ��ݹ���ɢ���㷨���������
		// ���ݹ�ϣɢ���㷨���ص㣬��ͬ�Ķ����������Ĺ�ϣ���Ǿ��ȵ�ɢ�зֲ���int��ȡֵ��Χ��
		// ��Ϊ��ͬ����Ĺ�ϣֵ���ظ����ʷǳ�С��������Ϊ����Ϊÿһ������Ĺ�ϣֵ��Ψһ��
		// �����ڼ������Ĵ洢λ�õ�ʱ���Ǹ��ݶ���Ĺ�ϣֵ�������
		System.out.println(o.hashCode());
		System.out.println(o.hashCode());
		System.out.println(o.hashCode());
		System.out.println(o.hashCode());
		System.out.println(o.hashCode());
		System.out.println(o.hashCode());
		System.out.println(o.hashCode());
		
		System.out.println(o.toString());
		// ��ֱ�Ӵ�ӡһ�������ʱ��ʵ������Ĭ�ϵ�������������toString
		System.out.println(o);
	}

}
