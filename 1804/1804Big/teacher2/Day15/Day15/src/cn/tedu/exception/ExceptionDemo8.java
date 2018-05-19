package cn.tedu.exception;

public class ExceptionDemo8 {

	public static void main(String[] args) {
		System.out.println(m());
	}

	public static Person m() {

		Person p = new Person();

		try {
			p.name = "翠花";
			p.gender = '女';
			// p是对象，所以此处编译产生的是地址
			// 地址没有发生变化
			return p;
		} finally {
			// p = new Person();
			p.name = "酸菜";
			p.gender = '男';
		}

	}

}

class Person {

	String name;
	char gender;

	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + "]";
	}

}
