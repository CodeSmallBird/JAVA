public class LoopDemo {

	public static void main(String[] args){
		
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
		/*
		for(int i = 6; i > 0; i--){
			
			for(int j = i; j > 0; j--){
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
			
			������1->n
			�ո�: 1->n-i
			*   : 1->i
		*/
		
		/*
		for(int i = 1; i <= 6; i++){
			for(int j = 1; j <= 6 - i; j++){
				System.out.print(" ");
			}
			
			for(int j = 1; j <= i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		/*
			******
			 *****
			  ****
			   ***
			    **
				 *
			
			������n->1
			�ո�n-i->1
			*   : i->1
		*/
		for(int i = 6; i > 0; i--){
			
			for(int j = 6 - i; j > 0; j--){
				System.out.print(" ");
			}
			
			for(int k = i; k > 0; k--){
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
			    *
			   ***
			  *****
			 *******
			*********
			 *******
			  *****
			   ***
			    *
		
		*/
	}

}