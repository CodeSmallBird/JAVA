package cn.tedu.object;

public class ComplexExer {
	
	public static void main(String[] args) {
		
		Complex c1 = new Complex(3, 8);
		Complex c2 = new Complex(5, -3);
		
		Complex c = c1.add(c2);
		System.out.println(c.real);
		System.out.println(c.im);
		
	}

}

class Complex {

	// 定义两个属性分别表示实部和虚部
	double real; // 实部
	double im; // 虚部

	// 提供对应的构造方法将实部和虚部传入
	public Complex(double real, double im) {
		this.real = real;
		this.im = im;
	}

	// 将当前的复数和传递的参数进行求和
	public Complex add(Complex c) {

		// 计算实部
		double real = this.real + c.real;
		// 计算虚部
		double im = this.im + c.im;
		// 将计算结果放入一个新的对象中返回
		Complex co = new Complex(real, im);

		return co;

	}

}