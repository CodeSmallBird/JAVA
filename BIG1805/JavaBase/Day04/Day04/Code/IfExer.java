import java.util.Scanner;
public class IfExer {
	/**
		输入2/3个数字，获取最大值
	*/
	public static void main(String[] args){
		
		/*
		// 获取两个数字
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		int j = s.nextInt();
		
		// 对i和j做比较
		if(i > j){
			System.out.println("最大值:" + i);
		} else {
			System.out.println("最大值:" + j);
		}
		*/
		
		// 获取到了3个数字
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		/*
		if(a > b) {
			if(a > c) {
				System.out.println("最大值：" + a);
			} else {
				System.out.println("最大值：" + c);
			}			
		} else {
			if(b > c){
				System.out.println("最大值：" + b);
			} else {
				System.out.println("最大值：" + c);
			}
		}
		*/
		
		// 定义一个变量来记录最大值
		int max = a;
		
		// 如果max小于了b，说明max记录的不是最大值，需要将最大值赋予max
		if(max < b) {
			max = b;
		}  
		if(max < c) {
			max = c;
		}
		System.out.println("最大值：" + max);
		
	}
	
}