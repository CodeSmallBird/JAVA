public class LoopExer2 {

	public static void main(String[] args){
		
		// 表示公鸡的数量
		for(int i = 0; i < 33; i++){
			
			// 表示母鸡的数量
			for(int j = 0; j < 50; j++){
				
				// 小鸡的数量
				int k = 100 - i - j;
				
				if(k % 3 == 0 && 3 * i + 2 * j + k / 3 == 100){
					
					System.out.println("公鸡：" + i);
					System.out.println("母鸡：" + j);
					System.out.println("小鸡：" + k);
					System.out.println("=================");
					
				}
				
			}
			
		}
		
	}
	
}