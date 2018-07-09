package cn.tedu.debug;

import org.junit.Before;
import org.junit.Test;

public class PersonTest {
	Person p = null;

	@Before
	public void before(){
		p = new Person();
	}
	
	@Test
	public void testEat(){
		p.eat("ÑòÈâ´®");
	}

	@Test
	public void testSay(){
		p.say("ÄãºÃ£¬ÑòÈâ´®");
		
	}

	@Test
	public void testStudy(){
		p.study();
	}
}
