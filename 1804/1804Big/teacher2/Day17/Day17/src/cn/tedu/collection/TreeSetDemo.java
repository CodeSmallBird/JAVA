package cn.tedu.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		// 会对元素进行自然排序---默认为升序排序
		// TreeSet<String> set = new TreeSet<String>();
		//
		// set.add("swa");
		// set.add("eaf");
		// set.add("abg");
		// set.add("lmw");
		// set.add("okd");
		// set.add("aaa");
		//
		// System.out.println(set);

		// 如果这个对象没有指定排序规则，则会存储失败
		TreeSet<Student> set = new TreeSet<Student>();

		set.add(new Student("唐三藏", 59));
		set.add(new Student("孙悟空", 79));
		set.add(new Student("猪悟能", 61));
		set.add(new Student("沙悟净", 38));
		set.add(new Student("白龙马", 80));

		// for (Student s : set) {
		// System.out.println(s);
		// }

		// 按照姓氏来进行升序排序
		// 如果需要给set单独指定规则，需要添加一个Comparator接口
		TreeSet<Student> set2 = new TreeSet<Student>(new Comparator<Student>() {

			@Override
			// 如果返回正数，则意味着o1>o2,那么o1就会排在o2的后边
			// 如果返回负数，则意味着o1<o2,那么o1就会排在o2的前边
			public int compare(Student o1, Student o2) {
				return o1.getName().charAt(0) - o2.getName().charAt(0);
			}
		});

		set2.add(new Student("唐三藏", 59));
		set2.add(new Student("孙悟空", 79));
		set2.add(new Student("猪悟能", 61));
		set2.add(new Student("沙悟净", 38));
		set2.add(new Student("白龙马", 80));
		for (Student s : set2) {
			System.out.println(s);
		}

	}

}

class Student implements Comparable<Student> {

	private String name;
	private int score;

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}

	@Override
	// 排序规则就是写在这儿
	// 如果返回一个正数，则意味着当前对象会比较大，那么排序的时候会排在参数对象后边
	// 如果返回一个负数，则意味着当前对象会比较小，那么排序的时候回排在参数对象前边
	public int compareTo(Student o) {
		return o.getScore() - this.getScore();
	}

}
