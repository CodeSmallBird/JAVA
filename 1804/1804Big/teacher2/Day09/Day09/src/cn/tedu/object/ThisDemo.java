package cn.tedu.object;

public class ThisDemo {

	public static void main(String[] args) {

		Student s = new Student("翠花", 12, (byte) 0);
		System.out.println(s);

		Student s2 = new Student("翠花", 12, (byte) 0);
		System.out.println(s2);

		// s.name = "如花";

	}

}

class Student {

	private String name;
	private int age;
	private byte gender;

	public Student(String name) {
		this.name = name;
	}

	public Student(String name, int age) {
		// this.name = name;
		this(name);
		this.age = age;
	}

	public Student(String name, int age, byte gender) {

		// this用于代替对象---虚拟对象
		// this.name = name;
		// this.age = age;

		// this不能调用构造方法
		// this.Student(name, age);
		// this语句 --- 表示调用本类中的对应形式的构造方法
		// name->String , age->int ->Student(String, int)
		this(name, age);
		this.gender = gender;

		System.out.println(this);

	}

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
		if (age >= 6 && age <= 12)
			this.age = age;
	}

	public byte getGender() {
		return gender;
	}

	public void setGender(byte gender) {
		this.gender = gender;
	}

}
