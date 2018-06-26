package cn.tedu.exception;

public class ExceptionDemo8 {

	public static void main(String[] args) {
		System.out.println(m());
	}

	public static Person m() {

		Person p = new Person();

		try {
			p.setName("翠花");
			p.setAge(18);
			// p是一个对象 --- p在栈内存中存储的是地址
			// 标记的结果是p的地址
			return p;
		} finally {
			// p = new Person();
			p.setName("小草");
			p.setAge(16);
		}

	}

}

class Person {

	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
