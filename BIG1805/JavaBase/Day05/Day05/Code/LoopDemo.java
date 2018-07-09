public class LoopDemo {

	public static void main(String[] args){
		
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
			
			行数：1->n
			空格: 1->n-i
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
			
			行数：n->1
			空格：n-i->1
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