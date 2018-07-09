public class LoopDemo2 {
	
	public static void main(String[] args){
		
		/* 打印 
			******
			******
			******
			******
		*/
		/*
		for(int i = 1, j = 1; i <= 4; j++){
			// 先打印*
			System.out.print("*");
			// 判断是否打印到这一行的最后一个*
			if(j == 6){
				// 如果打印到了最后一个*，则这一行打印完毕需要换行
				System.out.println();
				// 因为产生了换行，所以行数自增1
				i++;
				// 到了新的一行，列数需要从头重新计算
				j = 0;
			}
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
		/*
		for(int i = 1, j = 1;i <= 6 ; j++){
			System.out.print("*");
			if(j == i){
				System.out.println();
				i++;
				j = 0;
			}
		}
		*/
		
		for(int i = 1, j = 1; i < 10; j++){
			System.out.print(j + "*" + i + "=" + j * i + "\t");
			if(j == i){
				System.out.println();
				i++;
				j = 0;
			}
		}
		
	}
	
}