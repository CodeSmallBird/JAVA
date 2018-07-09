package cn.tedu.io.seria;

import java.io.Serializable;

public class Person implements Serializable {
	private static final long serialVersionUID = 12345l;
	private String name;
	private int age;
	private transient String psw;

	public Person() {
	}

	public Person(String name, int age,String psw) {
		this.name = name;
		this.age = age;
		this.psw = psw;
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

	public String getPsw() {
		return psw;
	}

	public void setPsw(String psw) {
		this.psw = psw;
	}
}
