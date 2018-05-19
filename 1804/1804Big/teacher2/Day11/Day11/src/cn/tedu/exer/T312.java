package cn.tedu.exer;

public class T312 {
	
	public static void main(String[] args) {
		
		for(int i = 0; i < 33; i++ ){
			
			for(int j = 0; j < 50; j++){
				
				int k = 100 - i - j;
				
				if(k % 3 == 0 && 3 *  i + 2 * j + k / 3 == 100){
					System.out.println("公鸡:" + i);
					System.out.println("母鸡:" + j);
					System.out.println("小鸡:" + k);
					System.out.println("=========");
				}
				
			}
			
		}
		
	}

}
