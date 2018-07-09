package cn.tedu.io.readerwriter;
/**
 * װ�����ģʽ��
 */

/**
 * ��ͨ��Person
 * ֻ�� �Է�˯��
 */
class Person{
	public void eat(){
		System.out.println("����ôôôôô�ĳԡ�������");
	}
	public void sleep(){
		System.out.println("���ں�������˯��������");
	}
}

/**
 * ���� Super_Person
 * ���Դ���һ��Person ��ԭ��Perosn�Ļ����� �����˴���޵�����
 * 
 * ʵ�ֲ��裺
 * 	�ṩ���췽�� ����װ���ߴ��� ����������ڲ�
 *  ���ڲ������ķ��� ֱ���ṩ��ͬ���� ���ñ�װ������ͬ�ķ���
 *  ���������ķ��� ֱ�Ӹ���
 *  ���������ӵķ��� ֱ������
 */
class Super_Person {
	private Person p = null;
	
	public Super_Person(Person p) {
		this.p = p;
	}
	
	public void hitMonster(){
		System.out.println("����ޡ�������");
	}
	
	public void eat() {
		p.eat();
	}

	public void sleep() {
		p.sleep();
	}
	
}

public class Demo05{
	public static void main(String[] args) {
		Person p = new Person();
		Super_Person sp = new Super_Person(p);
		sp.eat();
		sp.sleep();
		//--�������ӵ�����������������
		sp.hitMonster();
	}
}
