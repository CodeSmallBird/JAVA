public class WhileDemo {
	
	public static void main(String[] args){
		
		/*
		System.out.println("Hello World ~~~");
		System.out.println("Hello World ~~~");
		System.out.println("Hello World ~~~");
		System.out.println("Hello World ~~~");
		System.out.println("Hello World ~~~");
		System.out.println("Hello World ~~~");
		System.out.println("Hello World ~~~");
		System.out.println("Hello World ~~~");
		System.out.println("Hello World ~~~");
		System.out.println("Hello World ~~~");
		*/
		/*
		// 记录循环的次数
		int count = 0;
		
		while(count < 100){
			System.out.println("Hello World ~~~");
			// 计数+1
			count++;
		}
		*/
		
		// 打印数字1-10
		/*
		int num = 1;
		
		while(num <= 10){
			System.out.println(num);
			num++;
		}
		*/
		
		/*
		// 求1-100中所有的奇数的和
		// 控制次数的变量---循环变量
		int num = 1;
		// 定义一个变量来记录和
		int sum = 0;
		
		while(num <= 100){
			sum += num;
			num += 2;
		}
		System.out.println(sum);
		*/
		
		/*
		int num = 100;
		int sum = 0;
		
		while(num > 0){
			sum += num;
			num--;			
		}
		*/
		
		// 输入一个数字，判断这个数字是一个几位数
		int num = 75235;
		// 记录位数
		int count = 0;
		
		while(num != 0){
			count++;
			num /= 10;
		}
		
		System.out.println(count);
		
		
		
	}
	
}