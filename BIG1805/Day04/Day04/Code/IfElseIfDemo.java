import java.util.Scanner;

public class IfElseIfDemo {
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		double score = s.nextDouble();
		
		// 判断分数是否合法
		if(score > 100 || score < 0){
			System.out.println("分数非法！！");
		} else if(score >= 90){
			System.out.println('A');
		} else if(score >= 80){
			System.out.println('B');
		} else if(score >= 70){
			System.out.println('C');
		} else if(score >= 60){
			System.out.println('D');
		} else {
			System.out.println('E');
		}
		
	}	
}