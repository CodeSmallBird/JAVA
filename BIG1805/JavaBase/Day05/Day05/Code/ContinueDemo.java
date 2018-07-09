public class ContinueDemo {

	public static void main(String[] args){
	
		/*
		for(int i = 1; i < 10; i++){
			
			if(i % 3 == 0)
				continue;
			
			System.out.println(i);
			
		}
		*/
		
		for(int i = 1; i < 5; i++){
			
			for(int j = 1; j < 4; j++){
				if(j == 2)
					continue;
				System.out.println(i + "," + j);
				
			}
			
		}
		
	
	}

}