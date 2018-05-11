package cn.tedu.day03;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) {
		int i=3;
		int k1=i++ + 1;
		System.out.println("k1="+k1+ "   i="+i);
		
		int i1=3;
		int i2=3;
		int k2=i1+++i2;
		System.out.println("k2="+k2+ "   i1="+i1+"   i2="+i2);
		
		int i3=3;
		int i4=3;
		int k3=++i3+i4;
		System.out.println("k3="+k3+ "   i3="+i3+"   i4="+i4);
		
		System.out.println("abc" instanceof String);
		System.out.println(new Integer(123) instanceof Integer);
		//System.out.println(123 instanceof Integer);//错的
		//System.out.println(123 instanceof int);//错的
       
	}

}
