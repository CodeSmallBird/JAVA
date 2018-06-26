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
	
	// ��д��ʱ���׳����쳣���ܳ��������Ӧ�������쳣�ķ�Χ
	// ���಻���׳��ȸ��������쳣---��Χ���ܸ��󣬶���ָ���Ǳ���ʱ�쳣
	@Override
	public void m() throws FileNotFoundException,EOFException,NullPointerException{
	}
	
}
