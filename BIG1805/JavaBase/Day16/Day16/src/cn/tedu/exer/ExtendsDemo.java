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
		System.out.println("吃东西中~~~");
	}

	public void drink() {
		System.out.println("喝水中~~~");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

}

class Student extends Person {

	String name;

	public void drink() {
		System.out.println("这个学生喝了一口可乐~~~");
	}

	@Override
	public String toString() {
		System.out.println(super.toString());
		return "Student [name=" + name + "]";
	}

}
