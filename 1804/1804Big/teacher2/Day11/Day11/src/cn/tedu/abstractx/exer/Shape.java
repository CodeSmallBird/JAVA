package cn.tedu.abstractx.exer;

public abstract class Shape {

	private final double x;

	private final double y;

	Shape(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public abstract double getGirth();

	public abstract double getArea();

}
