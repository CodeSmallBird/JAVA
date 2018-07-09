package cn.tedu.innerclass;

public class InnerDemo5 implements Outer5.Inner5 {

}

class Outer5 {

	// 内部接口默认是static的
	static interface Inner5 {
	}

}

// Outer6.Inner6 oi6 = new Outer6.Inner6();
interface Outer6 {

	// 接口中定义的内部类默认是static的
	class Inner6 {
	}

	// 接口中定义的内部接口默认是static的
	interface Inner7 {
	}

}