import java.util.Scanner;

public class LoopExer4 {
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for(int i = 2; n != 1; ){
			
			if(n % i == 0){
				System.out.println(i);
				n /= i;
			} else {
				i++;
			}
			
		}
		
	}
	
}