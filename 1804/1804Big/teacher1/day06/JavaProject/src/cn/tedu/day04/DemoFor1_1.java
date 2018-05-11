package cn.tedu.day04;

public class DemoFor1_1 {
	/**
	 * •	求1~100之间不能被3整除的数之和
	 * 分析
	 *    数据是1---100
	 *    有固定次数,用for 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int sum=0;
		for(int i=1;i<=100;i++){
        	if(i%3!=0){
        		sum+=i;
        	}
        }
		System.out.println("sum="+sum);
        /*for(int i=100;i>0;i--){
        	
        }*/
	}

}
