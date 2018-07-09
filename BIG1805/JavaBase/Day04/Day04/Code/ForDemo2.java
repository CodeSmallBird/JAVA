public class ForDemo2 {

	public static void main(String[] args){
		
		/* 打印 
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
			
			行数： 1 -> n
			每一行的*个数 : 1 -> 行数
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
			
			行数：n -> 1
			每一行的*个数：行数 -> 1
		*/
		
	}

}