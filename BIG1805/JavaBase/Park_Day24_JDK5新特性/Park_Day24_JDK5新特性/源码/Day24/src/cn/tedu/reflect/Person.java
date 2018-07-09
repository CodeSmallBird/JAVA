package cn.tedu.reflect;

public class Person extends Ani implements DriveSkill,CodeSkill {
	public static String addr = "China";
	public String name;
	public int age;
	private String gender = "男";
	
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
		System.out.println("睡。。。。");
	}
	
	private void say(){
		System.out.println("说...");
	}
	
	public void eat(String food){
		System.out.println("吃..."+food);
	}

	@Override
	public void code() {
		System.out.println("写java代码。。。");
	}

	@Override
	public void dirver() {
		System.out.println("开车。。。");
	}
}
