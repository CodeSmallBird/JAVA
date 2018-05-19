package cn.tedu.abstractx;

import cn.tedu.abstractx.exer.Rectangle;
import cn.tedu.abstractx.exer.Shape;

public class AbstractExer {
	
	public static void main(String[] args) {
		
		Shape s1 = new Rectangle(3.54, 5.2);
		System.out.println(s1.getArea());
		System.out.println(s1.getGirth());
	}

}