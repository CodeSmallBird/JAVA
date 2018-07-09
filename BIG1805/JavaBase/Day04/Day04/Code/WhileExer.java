public class WhileExer {
	
	public static void main(String[] args){
		
		/*
		int number = 0;
		while(number <= 200){
			System.out.println(number);
			number += 7;
		}
		*/
		
		/*
		int num = 0;
		while(num <= 100){
			
			if(num % 7 != 0){
				System.out.println(num);
			}
			
			num += 3;
		}
		*/
		
		/*
		int num = 75235;
		int sum = 0;
		while(num != 0){
			
			sum += (num % 10);
			num /= 10;
			
		}
		System.out.println(sum);
		*/
		
		int num = 13;
		String str = "";
		while(num != 0){
			
			str = (num % 2) + str;
			num /= 2;
			
		}
		
		System.out.println(str);
	}
	
}