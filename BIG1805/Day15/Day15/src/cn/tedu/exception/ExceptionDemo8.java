package cn.tedu.exception;

public class ExceptionDemo8 {

	public static void main(String[] args) {
		System.out.println(m());
	}

	public static Person m() {

		Person p = new Person();

		try {
			p.setName("�仨");
			p.setAge(18);
			// p��һ������ --- p��ջ�ڴ��д洢���ǵ�ַ
			// ��ǵĽ����p�ĵ�ַ
			return p;
		} finally {
			// p = new Person();
			p.setName("С��");
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
