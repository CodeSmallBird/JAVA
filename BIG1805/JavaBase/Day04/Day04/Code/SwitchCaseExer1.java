import java.util.Scanner;
public class SwitchCaseExer1 {
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		
		// ��ȡ����
		String symbol = s.nextLine();
		// ��ȡ2������
		int a = s.nextInt();
		int b = s.nextInt();
		
		switch(symbol) {
			case "-" : System.out.println(a - b);
			case "+" : System.out.println(a + b);		
			case "*" : System.out.println(a * b);break;
			case "/" : System.out.println(a / b);break;
			default:System.out.println("û���������~~~");break;
		}
		
	}
	
}