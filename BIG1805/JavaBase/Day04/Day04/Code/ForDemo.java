public class ForDemo {
	
	public static void main(String[] args){
		
		/*
		for(int i = 1; i <= 10; i++){
			System.out.println("Hello World~~~");
		}
		*/
		
		// 求1-10的和
		int sum = 0;
		int i = 1;
		// for循环的中间判断条件如果不写，那么默认为true
		for( ; i <= 10; ){
			sum += i;
			i += 2;
		}
		// System.out.println(sum);
	}
	
}