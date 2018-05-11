package cn.tedu.day06;

public class DemoMethod1 {
	public int sum(int a,int b){
		int result=a+b;
		return result;
	}
	
	public static void main(String[] args) {
		DemoMethod1 dm1=new DemoMethod1();
		int result=dm1.sum(2, 3);
		System.out.println("result="+result);
		
	}

}
