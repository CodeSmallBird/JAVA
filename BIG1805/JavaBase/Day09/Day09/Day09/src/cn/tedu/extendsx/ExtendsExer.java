package cn.tedu.extendsx;

public class ExtendsExer {
	
	public static void main(String[] args) {
		
		Rectangle r = new Rectangle(3.2, 2.5);
		System.out.println(r.getGirth());
		System.out.println(r.getArea());
		
		Square s = new Square(4.1);
		System.out.println(s.getGirth());
		System.out.println(s.getArea());
		
	}

}

// 代表矩形
class Rectangle {

	private double height;
	private double width;

	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

	public double getGirth() {
		return 2 * (height + width);
	}

	public double getArea() {
		return height * width;
	}
}

// 代表正方形
class Square extends Rectangle {

	public Square(double width) {
		super(width, width);
	}

}
