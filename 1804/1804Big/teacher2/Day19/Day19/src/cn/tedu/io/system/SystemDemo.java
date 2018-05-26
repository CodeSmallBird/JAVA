package cn.tedu.io.system;

public class SystemDemo {

	public static void main(String[] args) throws Exception {

		int i = System.in.read();
		
		// 习惯上打印结果的时候用的是输出流
		// 如果是报错用的是错误流
		System.out.println(i);
		System.err.println(i);

	}

}
