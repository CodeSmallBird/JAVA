import java.util.Scanner;
public class SwitchCaseDemo {
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		
		// 输入一个数字表示月份，输出这一月有几天
		switch(m){
			case 1: 
			case 3:
			case 5:
			case 7: 
			case 8:
			case 10:
			case 12:System.out.println(31);break;
			case 4:
			case 6:
			case 9:
			case 11:System.out.println(30);break;
			case 2:System.out.println(28);break;
		}
		
		/*
		int n = 0;
		switch(m){
			case 2: n += 2;
			case 3: n += 3;
			case 1: n += 1;
			case 4: n += 4;
		}
		System.out.println(n);
		*/
		
		/*
		switch(m){
			case 2:System.out.println("Tuesday");break;
			case 3:System.out.println("Wednesday");break;
			default:System.out.println("星期非法");break;
			case 1:System.out.println("Monday");break;
			case 6:System.out.println("Saturday");break;
			case 4:System.out.println("Thursday");break;
			case 7:System.out.println("Sunday");break;
			case 5:System.out.println("Friday");break;
		}
		*/
	}
}