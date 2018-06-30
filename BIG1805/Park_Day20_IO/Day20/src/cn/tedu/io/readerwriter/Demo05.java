package cn.tedu.io.readerwriter;
/**
 * 装饰设计模式！
 */

/**
 * 普通的Person
 * 只能 吃饭睡觉
 */
class Person{
	public void eat(){
		System.out.println("人在么么么么么的吃。。。。");
	}
	public void sleep(){
		System.out.println("人在呼噜呼噜的睡。。。。");
	}
}

/**
 * 超人 Super_Person
 * 可以传入一个Person 在原有Perosn的基础上 增加了打怪兽的能力
 * 
 * 实现步骤：
 * 	提供构造方法 将被装饰者传入 保存在类的内部
 *  对于不想改造的方法 直接提供相同方法 调用被装饰者相同的方法
 *  对于想改造的方法 直接改造
 *  对于想增加的方法 直接增加
 */
class Super_Person {
	private Person p = null;
	
	public Super_Person(Person p) {
		this.p = p;
	}
	
	public void hitMonster(){
		System.out.println("打怪兽。。。。");
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
		//--额外增加的能力！！！！！！
		sp.hitMonster();
	}
}
