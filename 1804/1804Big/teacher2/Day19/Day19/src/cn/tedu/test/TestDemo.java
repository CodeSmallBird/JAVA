package cn.tedu.test;

import java.io.FileOutputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestDemo {

	private FileOutputStream out;

	@After
	public void destroy() throws Exception {
		out.close();
		System.out.println("流已经关闭");
	}

	@Before
	public void init() throws Exception {
		out = new FileOutputStream("E:\\aaa.txt", true);
		System.out.println("流已经创建");
	}

	@Test
	public void m() throws Exception {
		out.write("abc".getBytes());
		System.out.println("写出abc");
	}

	@Test
	public void m2() throws Exception {
		// out.write("def".getBytes());
		m3("def");
		System.out.println("写出def");
	}

	public void m3(String str) throws Exception {
		out.write(str.getBytes());
	}

}
