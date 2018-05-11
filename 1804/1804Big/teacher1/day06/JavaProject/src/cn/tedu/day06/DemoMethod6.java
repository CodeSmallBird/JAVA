package cn.tedu.day06;

public class DemoMethod6 {
	//给参数赋值更灵活和方便
	public int sum(int...a){
		int s=0;
		for(int i : a){
			s+=i;
		}
		return s;
	}
	public static void main(String[] args) {
		DemoMethod6 dm6=new DemoMethod6();
		System.out.println(dm6.sum());
		System.out.println(dm6.sum(1));
		System.out.println(dm6.sum(1,2));
		System.out.println(dm6.sum(1,2,3));
		System.out.println(dm6.sum(new int[]{1,2,3,4}));
	}

}
