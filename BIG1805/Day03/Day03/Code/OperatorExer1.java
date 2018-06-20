import java.util.Scanner;
public class OperatorExer1 {

	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		
		double score = s.nextDouble();
		
		String level = score >= 90 ? "A" : (score >= 80 ? "B" : (score >= 70 ? "C": (score >= 60 ? "D" : "E")));
		
		System.out.println(level);
		
	}

}