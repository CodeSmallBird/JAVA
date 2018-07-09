import java.util.Scanner; // 导包语句
public class OperatorExer2 {
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		
		// 获取整数
		int year = s.nextInt();
		boolean b2 = year % 100 != 0 && year % 4 == 0;
		boolean b1 = year % 400 == 0;
		
		String str =  b2 || b1 ? "闰年" : "平年";
		System.out.println(str);
		
	}
	
}