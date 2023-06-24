package org.assertjunit;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class Sample3 {
	@Test
	public void tc21() {
	System.out.println("m21");

	}
	@Ignore
	@Test
	public void tc22() {
		Assert.assertTrue(false);
		System.out.println("m22");

	}
	@Test
	public void tc23() {
		System.out.println("m23");

	}
}
