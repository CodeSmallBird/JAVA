import java.util.Scanner;
public class LoopExer3 {
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		// �涨���Ϊtrue����ʾ��һ������
		boolean flag = true;
		
		for(int i = 2; i <= n / 2; i++){
			
			if(n % i == 0){
				flag = false;
				break;
			}
			
		}
		
		if(flag)
			System.out.println("��һ������");
		else
			System.out.println("��������");
		
	}
	
}