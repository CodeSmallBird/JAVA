import java.util.Scanner;
public class IfElseIfExer {
	
	public static void main(String[] args){
		
		// 获取月份
		Scanner s = new Scanner(System.in);
		int month = s.nextInt();
		
		// 判断月份是否合法
		if(month > 12 || month < 1){
			System.out.println("月份非法！！！");
		} else if(month >= 3 && month <= 5){
			System.out.println("春季");
		} else if(month >= 6 && month <= 8){
			System.out.println("夏季");
		} else if(month >= 9 && month <= 11){
			System.out.println("秋季");
		} else {
			System.out.println("冬季");
		}
		
	}
	
}