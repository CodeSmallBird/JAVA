import java.util.Scanner;
public class SwitchCaseExer2 {
	
	public static void main(String[] args){
		
		// ��ȡ������
		Scanner s = new Scanner(System.in);
		int year = s.nextInt();
		int month = s.nextInt();
		int day = s.nextInt();
		
		// ����һ����������¼�ܵ�����
		int sum = 0;
		
		switch(month){
			case 12: sum += 30; // �ӵ���11�µ�����
			case 11: sum += 31; // �ӵ���10�µ�����
			case 10: sum += 30;
			case 9: sum += 31;
			case 8: sum += 31;
			case 7: sum += 30;
			case 6: sum += 31;
			case 5: sum += 30;
			case 4: sum += 31;
			case 3:
				if(year % 100 != 0 && year % 4 == 0 || year % 400 == 0){
					sum += 29;
				} else {
					sum += 28;
				}
			case 2: sum += 31;
			case 1: sum += 0;
		}
		
		sum += day;
		System.out.println(sum);
		
	}
	
}