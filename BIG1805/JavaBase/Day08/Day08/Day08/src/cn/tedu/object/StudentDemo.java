package cn.tedu.object;

public class StudentDemo {

	public static void main(String[] args) {

		Student s = new Student("�仨", 15, 'Ů');
		System.out.println(s);

		Student s2 = new Student("�仨", 'Ů');
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
		// this����һ���������ڵ�������
		// this���浱ǰ�ڻ���������
		// this.name = name;
		// this.gender = gender;
		// this() --- this��䣬��ʾ���ñ����������Ķ�Ӧ��ʽ�Ĺ��췽��
		// Student(String, char)
		this(name,gender);
		this.age = age;
		System.out.println(this);
	}

}