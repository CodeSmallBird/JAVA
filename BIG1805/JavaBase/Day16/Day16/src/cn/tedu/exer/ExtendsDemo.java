package cn.tedu.exer;

public class ExtendsDemo {

	public static void main(String[] args) {

		Person p = new Student();
		p.eat();
		// p.setName("Amy");
		p.name = "Amy";
		System.out.println(p);
	}

}

class Person {

	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void eat() {
		drink();
		System.out.println("�Զ�����~~~");
	}

	public void drink() {
		System.out.println("��ˮ��~~~");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

}

class Student extends Person {

	String name;

	public void drink() {
		System.out.println("���ѧ������һ�ڿ���~~~");
	}

	@Override
	public String toString() {
		System.out.println(super.toString());
		return "Student [name=" + name + "]";
	}

}
