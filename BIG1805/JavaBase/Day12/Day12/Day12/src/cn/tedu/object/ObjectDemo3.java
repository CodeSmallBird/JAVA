package cn.tedu.object;

public class ObjectDemo3 {

	public static void main(String[] args) {

		Person p1 = new Person(null, 18, 'Ů');
		Person p2 = new Person(null, 18, 'Ů');

		// equals�ײ�Ĭ��ʹ��==�ж���������ĵ�ַ�Ƿ�һ��
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
		// ���ж���������ĵ�ַ�Ƿ�һ��
		if (this == obj)
			return true;

		// �жϲ����Ƿ�Ϊ��
		if (obj == null)
			return false;

		// �ж���������������Ƿ�һ��
		if (this.getClass() != obj.getClass())
			return false;

		// ����ֵ���ж�
		Person p = (Person) obj;

		// �ж������Ƿ�һ��
		if (this.age != p.age)
			return false;

		// �ж��Ա��Ƿ�һ��
		if (this.gender != p.gender)
			return false;

		// �ж������Ƿ�һ��
		// ��ʾ����String���е�equals
		if (this.name == null) {
			if (p.name != null) {
				return false;
			}
		} else if (!this.name.equals(p.name))
			return false;

		return true;
	}

}
