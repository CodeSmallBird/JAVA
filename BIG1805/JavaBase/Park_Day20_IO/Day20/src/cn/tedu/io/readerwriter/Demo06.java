package cn.tedu.io.readerwriter;

class Person2{

	public void eat(){
		System.out.println("����ôôôôô�ĳԡ�������");
	}
	public void sleep(){
		System.out.println("���ں�������˯��������");
	}
}

class Super_Person2 extends Person2 {
	private Person2 p = null;
	public Super_Person2(Person2 p) {
		this.p = p;
	}
	public void hitMonster(){
		System.out.println("����ޡ�������");
	}
}

public class Demo06{
	public static void main(String[] args) {
		Person2 p2 = new Person2(); 
		Super_Person2 sp2 = new Super_Person2(p2);
		sp2.eat();
		sp2.sleep();
		sp2.hitMonster();
	}
}
