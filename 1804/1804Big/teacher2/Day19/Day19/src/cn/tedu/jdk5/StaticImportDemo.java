package cn.tedu.jdk5;

//import java.util.Arrays;
import static java.util.Arrays.sort;

public class StaticImportDemo {

	public static void main(String[] args) {

		int[] arr = { 3, 1, 5, 3, 8, 2, 6 };

		// Arrays.sort(arr);
		sort(arr);

		for (int i : arr) {
			System.out.println(i);
		}

	}

	// public static void sort() {
	// }

}
