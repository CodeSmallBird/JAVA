package cn.tedu.baozhuang;

public class VoidDemo {

	public static void main(String[] args) {

	}

	public void m() {
		System.out.println("m~~~");
	}
	
	// 必须有返回值，而且只能是null
	public Void m2() {
		System.out.println("m2~~~");
		return null;
	}

}
