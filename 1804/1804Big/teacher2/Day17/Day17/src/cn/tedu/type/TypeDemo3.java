package cn.tedu.type;

public class TypeDemo3 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		TDemo td = new TDemo();
		td.m(3);
		td.m(true);
		td.m('a');
		td.m(3.24);
		
		String str = td.m();
		Integer in = td.m();

	}

}

class TDemo {

	// 需要一个参数，参数类型不确定，由调用这个方法的人来决定参数类型
	public <T> void m(T t) {
		System.out.println(t.getClass());
	}

	public <T> T m() {
		return null;
	}

}
