package cn.tedu.io.serial;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = -7125831326039L;
	// private static final long serialVersionUID = 4557575129L;

	private String name;
	private int age;
	private char gender;
	private double heigh;
	private transient double weight;
	// public static String hobby;

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

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public double getHeigh() {
		return heigh;
	}

	public void setHeigh(double heigh) {
		this.heigh = heigh;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

}
