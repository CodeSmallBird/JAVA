package cn.tedu.exception;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class ExceptionDemo5 {
	
	public static void main(String[] args) {
	
		A a = new B();
		
		try {
			a.m();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}

class A {

	// 异常不影响方法的重载
	public void m() throws IOException {
	}

	public void m(int i) throws SQLException {
	}

}

class B extends A {

	@Override
	// 子类抛出的编译时异常范围不能超过父类编译时异常的范围
	// 子类不能抛出比父类更多的异常
	public void m() throws FileNotFoundException, EOFException, NullPointerException {
	}

}
