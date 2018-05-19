package cn.tedu.baozhuang;

public class Complex {

	private double real; // ʵ��
	private double im; // �鲿

	public Complex(double real, double im) {
		this.real = real;
		this.im = im;
	}

	public Complex(double im) {
		this.im = im;
	}

	public Complex add(Complex c) {
		double real = this.real + c.real;
		double im = this.im + c.im;
		return new Complex(real, im);
	}

	public Complex add(double real) {
		return new Complex(this.real + real, this.im);
	}

	public Complex minus(Complex c) {
		double real = this.real - c.real;
		double im = this.im - c.im;
		return new Complex(real, im);
	}

	public Complex mutiply(Complex c) {

		double real = this.real * c.real - this.im * c.im;
		double im = this.real * c.im + this.im * c.real;

		return new Complex(real, im);

	}

	public String toString() {

		String result = "";

		if (this.real != 0)
			result += this.real;

		if (this.im < 0) {
			result += this.im + "i";
		} else if (this.im > 0) {
			result += (this.real == 0 ? "" : "+") + this.im + "i";
		}

		return result;

	}

}
