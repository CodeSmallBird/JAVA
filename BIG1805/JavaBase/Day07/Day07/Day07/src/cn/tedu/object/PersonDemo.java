package cn.tedu.object;

public class PersonDemo {

	public static void main(String[] args) {

		// 创建了一个Person对象 --- 用new来创建一个对象
		// 构造方法 --- 构建创造对象的方法
		// Person p = new Person();
		Person p = new Person("似玉", -14);
		// . 理解为的
		// 给p的属性一一赋值
		p.name = "如花";
		p.age = 15;
		p.gender = 0;
		p.height = 198;

		p.age = 20;

		p.eat("草");

		p.name = "沉鱼";
	}

}

// 代表人的类
class Person {

	// 定义了一堆的属性来表示特征
	// 成员变量
	String name; // 姓名
	int age; // 年龄
	/** 规定0表示女，1表示男 */
	byte gender; // 性别
	double height; // 身高
	double weight; // 体重

	// 如果一个类中没有手动定义构造方法，那么程序在编译的时候默认添加一个构造方法 --- public Person(){}
	// 构造方法没有返回值类型
	// 构造方法的方法名必须和类名一致
	// 构造方法可以重载
	public Person() {
	}

	public Person(String n, int a) {
		
		// 规避不合法的数据
		if(a < 0)
			return;
		
		name = n;
		age = a;
	}

	public void eat(String food) {
		// 局部变量
		int num = 5;
		System.out.println(name + "吃了" + num + "个" + food);
	}

}