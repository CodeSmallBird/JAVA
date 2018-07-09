package cn.tedu.exception;

public class ErrorDemo {
	
	public static void main(String[] args) {
		
		System.out.println(sum(20000));
		
	}
	
	public static int sum(int n){
		
		if(n <= 1)
			return 1;
		
		return n + sum(--n);
		
	}

}
