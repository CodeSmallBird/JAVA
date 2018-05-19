package cn.tedu.abstractx.exer;

public class Rectangle extends Shape {

	public Rectangle(double x, double y) {
		super(x, y);
	}

	@Override
	public double getGirth() {
		return 2 * (this.getX() + this.getY());
	}

	@Override
	public double getArea() {
		return this.getX() * this.getY();
	}

}
