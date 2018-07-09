package cn.tedu.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		// TreeSet<String> set = new TreeSet<String>();

		// ���Ԫ�ص�ʱ����Ԫ�ؽ�����Ȼ����---����
		// set.add("dsh");
		// set.add("qah");
		// set.add("abe");
		// set.add("abc");
		// set.add("hre");
		// set.add("jst");

		// System.out.println(set);

		TreeSet<Student> set = new TreeSet<Student>(new Comparator<Student>() {

			@Override
			// �������һ��������o1������o2�ĺ��
			// �������һ��������o1������o2��ǰ��
			public int compare(Student o1, Student o2) {
				return -(o1.getAge() - o2.getAge());
			}

		});

		set.add(new Student("�Ŵ�ɽ", 18, 50));
		set.add(new Student("������", 16, 80));
		set.add(new Student("���޼�", 20, 53));
		set.add(new Student("����", 19, 85));
		set.add(new Student("��üӥ��", 60, 60));
		// System.out.println(set);
		for (Student student : set) {
			System.out.println(student);
		}
		System.out.println("===========");

		TreeSet<Student> set2 = new TreeSet<Student>();
		set2.add(new Student("�Ŵ�ɽ", 18, 50));
		set2.add(new Student("������", 16, 80));
		set2.add(new Student("���޼�", 20, 53));
		set2.add(new Student("����", 19, 85));
		set2.add(new Student("��üӥ��", 60, 60));
		for (Student student : set2) {
			System.out.println(student);
		}

	}

}

class Student implements Comparable<Student> {

	private String name;
	private int age;
	private int score;

	public Student(String name, int age, int score) {
		this.name = name;
		this.age = age;
		this.score = score;
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
		this.age = age;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}

	@Override
	// �������ֵ��һ��������˵�������������ʱ��Ҫ�ŵ������ĺ���ȥ
	// �������ֵ��һ��������˵�������������ʱ��Ҫ�ŵ�������ǰ��ȥ
	public int compareTo(Student o) {
		return -(this.score - o.score);
	}

}
