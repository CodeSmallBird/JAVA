package cn.tedu.day03;

public class DemoIF {
	public static void main(String[] args) {
		System.out.println("main方法开始");
		int i=100;
		if(i>10){
			//能进这里来,说明条件为真值true
			System.out.println("条件为真");
		}else{
			//能进这里来,说明条件为价值false
			System.out.println("条件为假");
		}
		
		System.out.println("main方法结束");
	}
}
