package cn.tedu.exer;

public class ExtendsDemo {

	public static void main(String[] args) {

		// 方法从子向父看，属性从父向子看
		Person p = new Doctor();
		p.eat();

		p.name = "Sam";
		// p.setName("Sam");
		System.out.println(p);

	}

}

class Person {

	String name;

	public void setName(String name) {
		this.name = name;
	}

	public void eat() {
		this.drink();
		System.out.println("吃东西~~~");
	}

	public void drink() {
		System.out.println("喝了一口水~~~");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

}

class Doctor extends Person {

	String name;

	@Override
	public void drink() {
		System.out.println("喝了一口药~~~");
	}

	@Override
	public String toString() {
		System.out.println(super.toString());
		return "Doctor [name=" + name + "]";
	}

}