import java.util.Scanner;
public class ForExer {
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		// 定义一个变量来记录次数
		int count = 0;
		
		// 因为这个整数是int类型，所以有32位二进制
		// 就意味着只需要依次判断32位是否为1就够了
		for(int i = 1; i <= 32; i++){
			
			// 说明补码的最后一位为1
			if((num & 1) == 1){
				count++;
			}
			
			// 无论最后一位是否为1，都已经经过判断，就需要把这一位挪走，来判断下一位
			num >>= 1;
			
		}
		
		System.out.println(count);
		
	}
	
}