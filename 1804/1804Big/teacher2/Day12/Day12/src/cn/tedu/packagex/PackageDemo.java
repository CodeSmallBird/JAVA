package cn.tedu.packagex;

// * ͨ���
// ��ʾ���뵱ǰ���µ����е�����������Ӱ��µ���
import java.util.*;
//import java.util.concurrent.Semaphore;

public class PackageDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}

		Arrays.sort(arr);

		// Semaphore se = new Semaphore(5);
	}

}
