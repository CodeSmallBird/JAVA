package cn.tedu.object;

public class PersonDemo {
	
	public static void main(String[] args) {
		
		Person p = new Person(12);
		p.name = "�仨";
		// p.age = -15;
		p.setAge(-13);
		p.gender = 'Ů';
		
		System.out.println(p.getAge());
	}

}

class Person {
	
	String name;
	// privateֻ���ڵ�ǰ����ʹ��
	private /*˽��*/ int age;
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
