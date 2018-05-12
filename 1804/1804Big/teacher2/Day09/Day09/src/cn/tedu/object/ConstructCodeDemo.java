package cn.tedu.object;

public class ConstructCodeDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Baby b = new Baby("柱子");

	}

}

// 代表婴儿的类
class Baby {

	String name;

	// 构造代码块
	// 在创建对象的时候，无论调用哪个构造函数，都会在构造函数之前执行
	{
		this.cry();
		this.eat();
	}

	public Baby() {
	}

	public Baby(String name) {
		// this();
		this.name = name;
		System.out.println(name);
	}

	public void cry() {
		System.out.println("这个小孩哇哇的哭~~~");
	}

	public void eat() {
		System.out.println("这个小孩在找奶吃~~~");
	}

}