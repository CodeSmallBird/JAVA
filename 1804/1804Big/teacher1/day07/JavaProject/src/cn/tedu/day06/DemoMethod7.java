package cn.tedu.day06;

public class DemoMethod7 {
	/**
	 * 定义  基本数据类型   变量名;
	 *   比如   int  a; 开辟空间
	 * @param a
	 */
	//值传递
	public void transferValue(int a){
		//参数int  a   以a为理由开辟了新的空间4个字节
		//作用域到本方法右大括号之前结束
		a=100;
		System.out.println("transferValue   a="+a);
	}
	/**
	 * 
	 * @param a 可以是数组,接口或类的对象
	 */
	//引用传递
	public void tranferReference(int[] a){
		//参数int[]  a   以a为理由声明了一个数组,没有内存空间
		//接收的时一个"引用",引用就是一个地址
		//作用域到本方法右大括号之前结束
		a[0]=90;
		a[1]=100;
		a[2]=110;
		System.out.println(a[0] +"    "+a[1]+"     "+a[2]);
		
	}
	public static void main(String[] args) {
		DemoMethod7 dm7=new DemoMethod7();
		System.out.println("---------值传测试---------");
		//值传测试
		int a=10;
		dm7.transferValue(a);
		System.out.println("main     a="+a);
		System.out.println("---------引用传递测试--------");
		//引用传递测试
		int[] aa=new int[]{1,2,3};
		dm7.tranferReference(aa);
		System.out.println(aa[0] +"    "+aa[1]+"     "+aa[2]);
	}

}
