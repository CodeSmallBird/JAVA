package cn.tedu.baozhuang;

public class HashCodeDemo {

	public static void main(String[] args) {

		Integer i = 10;
		System.out.println(i.hashCode());

		System.out.println(new Byte((byte) 3).hashCode());
		System.out.println(new Short((short) 3).hashCode());
		
		System.out.println(new Long(125).hashCode());
		System.out.println(new Double(12.5).hashCode());
		System.out.println(new Float(12.5f).hashCode());
		System.out.println(new Character('a').hashCode());
		System.out.println(new Boolean(true).hashCode());
	}

}
