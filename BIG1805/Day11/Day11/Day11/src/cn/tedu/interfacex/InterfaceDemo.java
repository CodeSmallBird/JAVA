package cn.tedu.interfacex;

public class InterfaceDemo {

	public static void main(String[] args) {

		Animal a = new Pig();
		a.eat();

		System.out.println(Animal.age);

	}

}

// ��interface������ӿ�
interface Animal {

	public static final int age = 0;

	// public Animal(){}

	// Ĭ��Ҳ����public abstract������
	void eat();

	public void drink();

}

interface Pet extends Animal, Cloneable {
}

// ��ͽӿ�֮����implements�ؼ�����������ϵ---ʵ��
class Pig implements Animal, Pet {

	@Override
	public void eat() {
		System.out.println("��ֻ���ڳ�ʳ~~~");
	}

	@Override
	public void drink() {
		System.out.println("��ֻ���ں�ˮ~~~");
	}

}
