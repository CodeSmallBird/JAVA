package cn.tedu.exer;

public class T321 {
	
	public static void main(String[] args) {
		
		// 记录圆周率
		double pi = 0;
		
		// 表示分母
		double base = 1;
		
		// 控制符号
		double sym = 1;
		
		// 记录次数
		int count = 0;
		
		while(pi < 3.1415926 || pi > 3.1415927){
			
			pi += 4 * sym / base;
			System.out.println(pi);
			
			base += 2;
			count++;
			sym *= -1;
			
		}
		
		System.out.println(count);
		
	}

}
