package cn.tedu.object;

public class CodeDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Baby b = new Baby();

	}

}

// ����һ�����ʾӤ��
class Baby {

	String name;
	String id;

	// �������� --- ��ʼ�������
	// ����������һ�����췽����������������������鶼��ִ��
	// ���ڹ��췽��ִ��
	{
		this.cry();
		this.eat();
	}

	public Baby() {
		System.out.println("���ӳ�����~~~");
	}

	public Baby(String name) {
		// this();
		this.name = name;
		// this.cry();
		// this.eat();
	}

	public Baby(String name, String id) {
		// this();
		this.name = name;
		this.id = id;
		// this.cry();
		// this.eat();
	}

	public void cry() {
		System.out.println("������������۵Ŀ�~~~");
	}

	public void eat() {
		System.out.println("������ڳ���~~~");
	}

}