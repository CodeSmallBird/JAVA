package cn.tedu.day06;

public class DemoMethod5 {
	public void method1(int a){
		int sum=0;
		for(int i=0;i<a;i++){
			if(i==20){
				return;
			}
			sum+=i;
		}
		System.out.println("sum="+sum);//不会执行这句话
	}
	public  void method2(int a){
		int sum=0;
		for(int i=0;i<a;i++){
			if(i==20){
				break;
			}
			sum+=i;
		}
		System.out.println("sum="+sum);
	}
	public static void main(String[] args) {
		DemoMethod5 dm5=new DemoMethod5();
		dm5.method1(100);//没有结果
		dm5.method2(100);
	}

}
