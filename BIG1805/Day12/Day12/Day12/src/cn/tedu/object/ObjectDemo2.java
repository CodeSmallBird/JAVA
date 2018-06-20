package cn.tedu.object;

public class ObjectDemo2 {
	
	public static void main(String[] args) {
		
		Object o = new Object();
		
		// 哈希码是根据哈西散列算法计算出来的
		// 根据哈希散列算法的特点，不同的对象计算出来的哈希码是均匀的散列分布在int的取值范围内
		// 因为不同对象的哈希值的重复概率非常小，所以人为的认为每一个对象的哈希值是唯一的
		// 所以在计算对象的存储位置的时候是根据对象的哈希值来分配的
		System.out.println(o.hashCode());
		System.out.println(o.hashCode());
		System.out.println(o.hashCode());
		System.out.println(o.hashCode());
		System.out.println(o.hashCode());
		System.out.println(o.hashCode());
		System.out.println(o.hashCode());
		
		System.out.println(o.toString());
		// 当直接打印一个对象的时候实际上是默认调用了这个对象的toString
		System.out.println(o);
	}

}
