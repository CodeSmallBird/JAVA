import java.util.Scanner;

public class IfExer2 {
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		// 210
		double score = s.nextDouble();
		
		/*
		if(score > 100 || score < 0) {
			System.out.println("分数非法！！！");
		} else {
			if(score >= 90){
				System.out.println('A');
			} else {
				if(score >= 80){
					System.out.println('B');
				} else {
					if(score >= 70){
						System.out.println('C');
					} else {
						if(score >= 60){
							System.out.println('D');
						} else {
							System.out.println('E');
						}
					}
				}
			}
		}
		*/
		// 98
		if(score > 100 || score < 0){
			System.our.println("分数非法！！！");
		}
		if(score <= 100 && score >= 90){
			System.out.println("A");
		}
		if(score < 90 && score >= 80){
			System.out.println("B");
		}
		if(score < 80 && score >= 70){
			System.out.println("C");
		}
		if(score < 70 && score >= 60){
			System.out.println("D");
		}
		if(score < 60 && score >= 0){
			System.out.println("E");
		}
		
	}
	
}