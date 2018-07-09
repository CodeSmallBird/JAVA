import java.util.Scanner;
public class SwitchCaseExer1 {
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		
		// 获取符号
		String symbol = s.nextLine();
		// 获取2个数字
		int a = s.nextInt();
		int b = s.nextInt();
		
		switch(symbol) {
			case "-" : System.out.println(a - b);
			case "+" : System.out.println(a + b);		
			case "*" : System.out.println(a * b);break;
			case "/" : System.out.println(a / b);break;
			default:System.out.println("没有这个符号~~~");break;
		}
		
	}
	
}