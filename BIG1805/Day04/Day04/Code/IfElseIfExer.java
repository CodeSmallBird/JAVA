import java.util.Scanner;
public class IfElseIfExer {
	
	public static void main(String[] args){
		
		// ��ȡ�·�
		Scanner s = new Scanner(System.in);
		int month = s.nextInt();
		
		// �ж��·��Ƿ�Ϸ�
		if(month > 12 || month < 1){
			System.out.println("�·ݷǷ�������");
		} else if(month >= 3 && month <= 5){
			System.out.println("����");
		} else if(month >= 6 && month <= 8){
			System.out.println("�ļ�");
		} else if(month >= 9 && month <= 11){
			System.out.println("�＾");
		} else {
			System.out.println("����");
		}
		
	}
	
}