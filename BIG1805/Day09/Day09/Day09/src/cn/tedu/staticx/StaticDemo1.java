package cn.tedu.staticx;

public class StaticDemo1 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		Person.gender = "��";

		Person p1 = new Person();
		p1.name = "����";
		p1.age = 18;
		p1.gender = "��";

		Person p2 = new Person();
		p2.name = "����";
		p2.age = 17;
		p2.gender = "Ů";

		System.out.println(p1.toStr());
		System.out.println(p2.toStr());

	}

}

class Person {

	String name;
	int age;
	static String gender;

	public String toStr() {
		return "name:" + name + "\t age:" + age + "\t gender:" + gender;
	}

}
