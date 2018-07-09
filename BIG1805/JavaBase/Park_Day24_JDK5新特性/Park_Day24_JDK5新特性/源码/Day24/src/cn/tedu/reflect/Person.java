package cn.tedu.reflect;

public class Person extends Ani implements DriveSkill,CodeSkill {
	public static String addr = "China";
	public String name;
	public int age;
	private String gender = "��";
	
	public Person() {
	}
	
	private Person(String name){
		this.name = name;
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void sleep(){
		System.out.println("˯��������");
	}
	
	private void say(){
		System.out.println("˵...");
	}
	
	public void eat(String food){
		System.out.println("��..."+food);
	}

	@Override
	public void code() {
		System.out.println("дjava���롣����");
	}

	@Override
	public void dirver() {
		System.out.println("����������");
	}
}
