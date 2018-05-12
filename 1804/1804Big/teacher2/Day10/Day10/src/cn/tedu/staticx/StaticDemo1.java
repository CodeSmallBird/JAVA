package cn.tedu.staticx;

public class StaticDemo1 {

	public static void main(String[] args) {

		Person p1 = new Person();
		p1.name = "苏东坡";
		p1.age = 80;
		// p1.gender = '男';

		Person p2 = new Person();
		p2.name = "妲己";
		p2.age = 800;
		// p2.gender = '女';

		Person.gender = '男';

		System.out.println(p1.toStr());
		System.out.println(p2.toStr());

	}

}

class Person {

	String name;
	int age;
	static char gender;

	public String toStr() {

		return name + "\t" + age + "\t" + gender;
	}

}