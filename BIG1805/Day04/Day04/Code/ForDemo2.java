public class ForDemo2 {

	public static void main(String[] args){
		
		/* ��ӡ 
			******
			******
			******
			******
		*/
		
		/*
		for(int count = 1; count <= 5; count++){
			
			for(int i = 1; i <= 8; i++){
				System.out.print("*");
			}
			System.out.println();
			
		}
		*/
		
		/*
			*
			**
			***
			****
			*****
			******
			
			������ 1 -> n
			ÿһ�е�*���� : 1 -> ����
		*/
		
		for(int i = 1; i <= 6; i++){
			
			for(int j = 1; j <= i; j++){
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		/*
			******
			*****
			****
			***
			**
			*
			
			������n -> 1
			ÿһ�е�*���������� -> 1
		*/
		
	}

}