package cn.tedu.interfacex.exer;

public class Triangle implements Shape {

	private double a;
	private double b;
	private double c;

	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public double getGirth() {
		return a + b + c;
	}

	@Override
	public double getArea() {

		double p = getGirth() / 2;

		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

}
