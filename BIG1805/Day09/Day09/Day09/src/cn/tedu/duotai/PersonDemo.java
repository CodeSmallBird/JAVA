package cn.tedu.duotai;

public class PersonDemo {

	public static void main(String[] args) {

		// �ø���������һ�����������ഴ����������� --- ��������
		// ��ʹ���������͵�ʱ��ֻ�����������ʵ����֮���Ƿ��м̳й�ϵ
		// ��������ȡ����������һ��ʵ����
		// ֻ�������е�ʱ��Żῴ����һ����������࣬Ȼ��������������ٿռ���д洢
		Person p = new Doctor();
		// �����������ʹ����Ķ�����÷������õ�����д֮���
		p.eat();
		// ���õ����������������������������ζ���ڱ����ڼ䲻ȷ�����������
		// ��Ϊ�ڱ����ڼ䲻ȷ�����࣬���Ҳ���ÿһ�������ж���treat����
		// ����Ϊ�˷�ֹ���ó������Դ�ʱ��������������е�������ķ���
		// p.treat();

	}

}

class Person {

	String name;
	int age;

	public void eat() {
		System.out.println("�ڳԶ���~~~");
	}

}

class Doctor extends Person {

	public void eat() {
		System.out.println("��ҽԺʳ�óԷ�~~~");
	}

	public void treat() {
		System.out.println("ҽ�����β�����~~~");
	}

}

class Worker extends Person {

	public void eat() {
		System.out.println("�ڹ��سԷ�~~~~");
	}

	public void work() {
		System.out.println("�����ڹ���~~~");
	}

}