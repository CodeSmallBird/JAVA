package cn.tedu.finalx;

public class FinalDemo2 {
	
	public static void main(String[] args) {
		
		new B2().m();
		
	}

}

class B {

	public final void m() {
		System.out.println("m~~~");
	}

	public final void m(int i) {
		System.out.println("m(int)~~~");
	}

}

class B2 extends B {

}