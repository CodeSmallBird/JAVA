public class BreakDemo {

	public static void main(String[] args){
		
		/*
		for(int i = 1; i < 20; i++){
			
			if(i % 7 == 0)
				// ÖÕÖ¹Ò»²ãÑ­»·
				break;
			
			System.out.println(i);
		}
		*/
		
		for(int i = 1; i < 5; i++){
			for(int j = 1; j < 4; j++){
				
				if(j == 2)
					break;
				
				System.out.println(i + "," + j);
			}
		}
		
	}

}