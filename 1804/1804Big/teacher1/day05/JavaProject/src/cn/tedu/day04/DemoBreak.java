package cn.tedu.day04;

public class DemoBreak {
	/**
	 * •	1~10之间的整数相加，得到累加值大于20的当前数
	 *  用for循环
	 * @param args
	 */
	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=10;i++){
			sum+=i;
			if(sum>20){
				System.out.println("i="+i);
				break;
			}
		}
	}
}
