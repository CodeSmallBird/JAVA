package cn.tedu.packagex;

// 表示导入了java包下的util包下的所有的类但是不包括util的子包中的类
import java.util.*;
import java.util.concurrent.CyclicBarrier;

public class PackageDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// Scanner s = new Scanner(System.in);

		Arrays.toString(new int[] {});
		
		CyclicBarrier cb = new CyclicBarrier(3);

	}

}
