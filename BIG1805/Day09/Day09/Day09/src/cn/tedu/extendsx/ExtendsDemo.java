package cn.tedu.extendsx;

public class ExtendsDemo {

	public static void main(String[] args) {

		Dog dog = new Dog();
		dog.eat();
		dog.species = "��ë";

	}

}

// �������
// ����/����/����
class Pet {

	String species;
	String color;
	
	public Pet(String color){}

	public void eat() {
		System.out.println("�ڳ�ʳ��~~~");
	}

}

// ����
// ����extends��Dog���Pet������˹�ϵ --- �̳�
// ����/������
class Dog extends Pet {

	public Dog() {
		// ���������Ĺ��캯����û���ֶ�����super���
		// ��ô�ڱ����ʱ��super()������һ���������
		// super��� --- ��ʾ���ø����ж�Ӧ��ʽ�Ĺ��췽��
		super("��ɫ");
	}

	public void play() {

		System.out.println("��ֻ������ˣ~~~���湻�˳Ի������~~~");
		// ����eat�������͵���Ҫһ������ 
		// eat�ǴӸ������ģ��͵���Ҫһ���������
		super.eat();

	}

}

// ����è
class Cat extends Pet {
	
	public Cat(){
		super("��ɫ");
	}
	
	// Cat c = new Cat("��ɫ");
	public Cat(String color){
		// ��Ȼ������췽���в���дsuper���
		// ���ǿ���ͨ��this()����Ӧ�Ĺ��췽��������һ���������
		this();
	}

}
