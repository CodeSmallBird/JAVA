package cn.tedu.day06;

public class DemoMethod4 {
	public int method1(){
		int i=0;
		while(true){
			System.out.println(i++);
			if(i==100){
				return i;
			}
		}
		//System.out.println("程序结束");//Unreachable code
	}
	public void method2(){
		int i=0;
		while(true){
			System.out.println(i++);
			if(i==100){
				break;
			}
		}
		System.out.println("程序结束");
	}
	public int method3(){
		int i=0;
		while(true){
			System.out.println(i++);
		}
		//System.out.println("程序结束");//Unreachable code
	}
	public static void main(String[] args) {
		DemoMethod4 dm4=new DemoMethod4();
		
	}

}
