package cn.tedu.object;

public class PersonDemo {
	
	public static void main(String[] args) {
		
		Person p = new Person(12);
		p.name = "翠花";
		// p.age = -15;
		p.setAge(-13);
		p.gender = '女';
		
		System.out.println(p.getAge());
	}

}

class Person {
	
	String name;
	// private只能在当前类中使用
	private /*私有*/ int age;
	char gender;
	
	public Person(int age) {
		if(age > 0)
			this.age = age;
	}
	
	public void setAge(int age){
		if(age > 0)
			this.age = age;
	}
	
	public int getAge(){
		return this.age;
	}
	
	
}
