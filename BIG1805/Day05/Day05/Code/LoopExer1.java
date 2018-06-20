public class LoopExer1 {

	public static void main(String[] args){
		
		for(int row = 1; row < 10; row++){ // ¿ØÖÆÐÐÊý
			
			for(int col = 1; col <= row; col++){
				System.out.print(col + "*" + row + "=" + col * row + "\t");				
			}
			
			System.out.println();
			
		}
		
	}
	
}