package org.assertjunit;

import org.junit.Ignore;
import org.junit.Test;

public class Sample1 {
	@Test
	public void tc01() {
		System.out.println("m1");
		
	}
	@Test
	public void tc02() {
		System.out.println("m2");
		
	}
	@Ignore
	@Test
	public void tc03() {
		System.out.println("m3");
		
	}
	

}
