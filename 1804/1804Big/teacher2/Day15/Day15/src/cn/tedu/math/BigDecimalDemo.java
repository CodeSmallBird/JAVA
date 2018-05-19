package cn.tedu.math;

import java.math.BigDecimal;

public class BigDecimalDemo {

	// strictfp表示double在运算过程中是以80位二进制来进行的
	// 而最后的存储依然是64位二进制
	public strictfp static void main(String[] args) {

		// 小数转化为二进制绝大部分是无限的
		// 而double在运算和存储过程中都是以64位二进制来运算和存储的
		// 这就意味着必然会产生舍入误差
		double d1 = 3;
		double d2 = 2.79;
		System.out.println(d1 - d2);

		// 如果需要精确运算，需要以字符串形式写入
		// 底层是在逐位相减
		BigDecimal bd1 = new BigDecimal("3");
		BigDecimal bd2 = new BigDecimal("2.79");
		System.out.println(bd1.subtract(bd2));
		
		System.out.println(new BigDecimal(2 / 3));

	}

}
