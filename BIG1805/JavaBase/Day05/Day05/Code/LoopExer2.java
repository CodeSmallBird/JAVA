public class LoopExer2 {

	public static void main(String[] args){
		
		// ��ʾ����������
		for(int i = 0; i < 33; i++){
			
			// ��ʾĸ��������
			for(int j = 0; j < 50; j++){
				
				// С��������
				int k = 100 - i - j;
				
				if(k % 3 == 0 && 3 * i + 2 * j + k / 3 == 100){
					
					System.out.println("������" + i);
					System.out.println("ĸ����" + j);
					System.out.println("С����" + k);
					System.out.println("=================");
					
				}
				
			}
			
		}
		
	}
	
}