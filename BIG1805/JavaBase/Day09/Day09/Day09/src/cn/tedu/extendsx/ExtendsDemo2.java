package cn.tedu.extendsx;

public class ExtendsDemo2 {

}

class Student {

	String name;
	int age;
	String no;

	public void study() {
		System.out.println("��ѧϰ��~~~");
	}

}

// ���������
class Junior extends Student {

	// ��������д
	public void study() {
		System.out.println("����ѧ����ѧϰ��~~~");
	}

}

// ���������
class Senior extends Student {
}