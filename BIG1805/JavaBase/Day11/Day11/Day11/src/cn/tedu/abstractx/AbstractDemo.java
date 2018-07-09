package cn.tedu.abstractx;

public class AbstractDemo {

	public static void main(String[] args) {

		Pet p = new Cat();
		p.eat();
		p.sleep();

		// �ܷ����ó��������������� ---����
		// Pet p = new Pet();
		// p.eat();
		// Pet p = new Pet() {
		//
		// @Override
		// public void eat() {
		//
		// }
		// }; // �����ڲ���
		// Animal a = new Animal();
	}

}

// Animal a = new Animal����();

// �������в�һ���г��󷽷�
abstract class Animal {

	public void drink() {
		System.out.println("�ں�ˮ~~~");
	}

}

// ������
abstract class Pet {

	public Pet() {
	}

	// ���󷽷�
	// ���󷽷����ڵ���һ���ǳ�����
	// Pet.eat();
	abstract void eat();

	// public abstract void eat(String food);

	public void eat(int count) {
		System.out.println("����" + count + "���ʳ��~~~");
	}

	public void sleep() {
		System.out.println("��˯��~~~");
	}

}

// �����ڼ̳г�����֮�������д���еĳ��󷽷�
class Spider extends Pet {

	@Override
	public void eat() {
		System.out.println("��ֻ֩���ڳԳ���~~~");
	}
}
// abstract class Spider extends Pet {
//
// }

class Cat extends Pet {

	public Cat() {
		// ȷʵ�ᴴ��������󣬵��ǵײ���C����ʵ�ֵ�
		super();
	}

	@Override
	public void eat() {
		System.out.println("��ֻè�ڳԲ�~~~");
	}

}

class Dog extends Pet {

	@Override
	public void eat() {
		System.out.println("��ֻ���ڳ���~~~");
	}

}