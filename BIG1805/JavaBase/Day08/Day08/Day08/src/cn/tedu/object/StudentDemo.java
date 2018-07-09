package cn.tedu.object;

public class StudentDemo {

	public static void main(String[] args) {

		Student s = new Student("翠花", 15, '女');
		System.out.println(s);

		Student s2 = new Student("翠花", '女');
		System.out.println(s2);

		s.age += 5;
	}

}

class Student {

	String name;
	int age;
	char gender;
	String no;

	public Student(String name, char gender) {
		this.name = name;
		this.gender = gender;
	}

	public Student(String name, int age, char gender) {
		// this代替一个对象，用于调用属性
		// this代替当前在活动的这个对象
		// this.name = name;
		// this.gender = gender;
		// this() --- this语句，表示调用本类中其他的对应形式的构造方法
		// Student(String, char)
		this(name,gender);
		this.age = age;
		System.out.println(this);
	}

}