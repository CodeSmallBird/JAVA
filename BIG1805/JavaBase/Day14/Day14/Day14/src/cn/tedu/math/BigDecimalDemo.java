package cn.tedu.math;

import java.math.BigDecimal;

public class BigDecimalDemo {

	// strictfp只能修饰方法，表示方法在计算过程中是以80位二进制来进行的
	// 但是最后的存储依然是64位二进制
	public strictfp static void main(String[] args) {
		
		// Java中是以64位二进制来存储double类型的数据
		// 这就导致小数在存储的时候会出现精度损失
		double d1 = 3.13;
		double d2 = 2.79;
		System.out.println(d1 - d2);
		
		// 需要将参数以字符串形式传入
		BigDecimal bd1 = new BigDecimal("3.13762");
		BigDecimal bd2 = new BigDecimal("2.7963");
		System.out.println(bd1.subtract(bd2));
		
		
	}
	
}
