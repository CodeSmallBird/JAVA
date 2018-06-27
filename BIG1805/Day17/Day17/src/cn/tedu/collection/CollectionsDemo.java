package cn.tedu.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class CollectionsDemo {

	public static void main(String[] args) {

		TreeSet<Senior> set = new TreeSet<Senior>();
		set.add(new Senior("Amy", 15, 58));
		set.add(new Senior("Sam", 17, 87));
		set.add(new Senior("Bob", 19, 43));
		set.add(new Senior("Tom", 14, 59));

		// System.out.println(Collections.max(set));

		List<Senior> list = new ArrayList<Senior>();
		list.add(new Senior("Amy", 15, 58));
		list.add(new Senior("Sam", 17, 87));
		list.add(new Senior("Bob", 19, 43));
		list.add(new Senior("Tom", 14, 59));
		// Collections.sort(list);
		Collections.sort(list, new Comparator<Senior>() {

			@Override
			public int compare(Senior o1, Senior o2) {
				return o1.getScore() - o2.getScore();
			}

		});
		for (Senior senior : list) {
			System.out.println(senior);
		}

	}

}

class Senior implements Comparable<Senior> {

	private String name;
	private int age;
	private int score;

	public Senior(String name, int age, int score) {
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
		return "Senior [name=" + name + ", age=" + age + ", score=" + score + "]";
	}

	@Override
	public int compareTo(Senior o) {
		return this.age - o.age;
	}

}
