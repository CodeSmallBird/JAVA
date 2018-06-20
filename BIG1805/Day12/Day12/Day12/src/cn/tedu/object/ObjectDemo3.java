package cn.tedu.object;

public class ObjectDemo3 {

	public static void main(String[] args) {

		Person p1 = new Person(null, 18, '女');
		Person p2 = new Person(null, 18, '女');

		// equals底层默认使用==判断两个对象的地址是否一致
		System.out.println(p1.equals(p2));

	}

}

class Person {

	private String name;
	private int age;
	private char gender;

	public Person(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
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

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public boolean equals(Object obj) {
		// 先判断两个对象的地址是否一致
		if (this == obj)
			return true;

		// 判断参数是否为空
		if (obj == null)
			return false;

		// 判断两个对象的类型是否一致
		if (this.getClass() != obj.getClass())
			return false;

		// 属性值的判断
		Person p = (Person) obj;

		// 判断年龄是否一致
		if (this.age != p.age)
			return false;

		// 判断性别是否一致
		if (this.gender != p.gender)
			return false;

		// 判断姓名是否一致
		// 表示调用String类中的equals
		if (this.name == null) {
			if (p.name != null) {
				return false;
			}
		} else if (!this.name.equals(p.name))
			return false;

		return true;
	}

}
