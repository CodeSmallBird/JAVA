package cn.tedu.day07;

public class Demo1 {
	public int sum(int a,int b){
		return a+b;
	}
	public float sum(float a,float b){
		return a+b;
	}
	
	public int sum(int a,int b,int c){
		return a+b+c;
	}

	public static void main(String[] args) {
		Demo1 d1=new Demo1();
		System.out.println(d1.sum(1,2));
		System.out.println(d1.sum(1f,2f));
	}

}
