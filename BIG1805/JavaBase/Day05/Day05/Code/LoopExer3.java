import java.util.Scanner;
public class LoopExer3 {
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		// 规定如果为true，表示是一个质数
		boolean flag = true;
		
		for(int i = 2; i <= n / 2; i++){
			
			if(n % i == 0){
				flag = false;
				break;
			}
			
		}
		
		if(flag)
			System.out.println("是一个质数");
		else
			System.out.println("不是质数");
		
	}
	
}