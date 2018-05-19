package cn.tedu.finalx;

public class FinalDemo2 {

}

class Fa {
	
	int i;
	// 常量属性在定义好之后，需要在对象创建完成之前给值
	// 在构造方法执行完成之前给值
	final int j;
	
	static int x;
	// 静态常量在定义好之后要求在类加载完成之前给值
	static final int y;
	
	static {
		y = 10;
	}
	// {
	// j = 10;
	// }
	
	// public Fa() {
	// this.j = 10;
	// }
	public Fa(int j) {
		this.j = j;
	}
	
}