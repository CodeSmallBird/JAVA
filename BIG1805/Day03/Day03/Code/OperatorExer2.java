import java.util.Scanner; // �������
public class OperatorExer2 {
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		
		// ��ȡ����
		int year = s.nextInt();
		boolean b2 = year % 100 != 0 && year % 4 == 0;
		boolean b1 = year % 400 == 0;
		
		String str =  b2 || b1 ? "����" : "ƽ��";
		System.out.println(str);
		
	}
	
}