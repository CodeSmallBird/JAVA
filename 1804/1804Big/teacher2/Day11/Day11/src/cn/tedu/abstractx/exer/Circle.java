package cn.tedu.abstractx.exer;

public class Circle extends Shape {

	public Circle(double d) {
		super(d, d);
	}

	@Override
	public double getGirth() {
		return 3.14 * this.getX();
	}

	@Override
	public double getArea() {
		return 3.14 * (this.getX() / 2) * (this.getX() / 2);
	}

}
