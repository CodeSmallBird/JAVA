package cn.tedu.baozhuang;

public class IntegerDemo4 {

	public static void main(String[] args) {

		// System.out.println(new Integer(968).hashCode());
		// System.out.println(new Byte((byte) 68).hashCode());
		// System.out.println(new Long(854720463628624L).hashCode());
		// System.out.println(new Double(5.2).hashCode());
		// System.out.println(new Character('d').hashCode());
		// System.out.println(new Boolean(false).hashCode());

		// System.out.println(Double.NaN == Double.NaN);

		System.out.println(new Double(0.0 / 0).isNaN());
		System.out.println(Double.isNaN(Double.NaN));

	}

}
