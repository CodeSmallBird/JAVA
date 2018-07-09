package cn.tedu.object;

public class CodeDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Baby b = new Baby();

	}

}

// 定义一个类表示婴儿
class Baby {

	String name;
	String id;

	// 构造代码块 --- 初始化代码块
	// 无论利用哪一个构造方法来创建对象，这个构造代码块都会执行
	// 先于构造方法执行
	{
		this.cry();
		this.eat();
	}

	public Baby() {
		System.out.println("孩子出生了~~~");
	}

	public Baby(String name) {
		// this();
		this.name = name;
		// this.cry();
		// this.eat();
	}

	public Baby(String name, String id) {
		// this();
		this.name = name;
		this.id = id;
		// this.cry();
		// this.eat();
	}

	public void cry() {
		System.out.println("这个孩子在哇哇的哭~~~");
	}

	public void eat() {
		System.out.println("这个还在吃奶~~~");
	}

}