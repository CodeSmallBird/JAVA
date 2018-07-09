package cn.tedu.exception;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class ExceptionDemo4 {
	
	public static void main(String[] args)  {
		
		A a = new B();
		
		try {
			a.m();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}

class A {

	public void m() throws IOException {
	}

	public void m(int i) throws SQLException{
	}

}

class B extends A {
	
	// 重写的时候，抛出的异常不能超过父类对应方法的异常的范围
	// 子类不能抛出比父类更多的异常---范围不能更大，而且指的是编译时异常
	@Override
	public void m() throws FileNotFoundException,EOFException,NullPointerException{
	}
	
}
