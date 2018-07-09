package cn.tedu.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo1 {

	public static void main(String[] args) throws ParseException {

		// String str = "dsgkg";
		// String str = null;
		// System.out.println(str.charAt(5));

		// Integer in = new Integer("ds");

		try {
			System.out.println(1 / 0);
		} catch (ArithmeticException e) {
			System.out.println("¥¶¿Ì“Ï≥£");
		}
		// int[] arr = new int[3];
		// System.out.println(arr[5]);

		// Object o = new Object();
		// String str = (String) o;

		// ExceptionDemo1 e1 = new ExceptionDemo1();
		// e1.clone();

		Date date = new SimpleDateFormat("yyyy-MM-dd").parse("2018-02-15");
		System.out.println(date);
	}

}
