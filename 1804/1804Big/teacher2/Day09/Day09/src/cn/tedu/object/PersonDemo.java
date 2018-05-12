package cn.tedu.object;

public class PersonDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// 创建了一个Person对象p
		// 通过new关键字创建一个Person对象
		// 构造方法
		// 创建对象的时候需要调用这个类中提供的构造方法
		Person p = new Person("翠花");

		// . 理解为 的
		// p.name = "如花";
		p.gender = 0;
		// p.age = 18;

		// System.out.println(p.age);

		p.eat("米饭");

		Person p2 = p;
		// p2 = new Person();
		// 如果一个对象的值给为null，意味着不去堆内存开辟空间，也就是说没有指向堆内存的地址
		// NullPointerException---空指针异常
		// 凡是利用null去调用属性和方法都会出现空指针异常
		p2 = null;
		// p2.age = 15;
		// p2.eat("蔬菜");
		// System.out.println(p.age);

		Person p3 = new Person();
		// p3.a(15);
		p3.setAge(15);
		// System.out.println(p3.b());
		System.out.println(p3.getAge());

		// p3.age = -15;

	}

}

// 代表人的类
class Person {

	// 属性 --- 特征
	private String name;
	private /* 私有 */ int age;
	// 规定0表示女，1表示男
	byte gender;
	String no;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setAge(int age) {
		if (age >= 0 && age <= 150)
			this.age = age;
	}

	public int getAge() {
		return this.age;
	}

	// 构造方法在定义的时候，没有返回值类型，必须与类同名
	// 如果手动定义了构造方法，那么在编译的时候就不再添加默认的了
	public Person() {
	}

	// 在使用变量的时候遵循就近原则
	public Person(String name) {
		this.name = name;
	}

	public Person(String n, int a) {
		name = n;
		age = a;
	}

	// 方法 --- 行为
	public void eat(String food) {
		System.out.println(name + "吃了" + food);
	}

}