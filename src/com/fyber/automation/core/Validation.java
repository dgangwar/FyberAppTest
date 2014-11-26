package com.fyber.automation.core;

import org.testng.Assert;

public class Validation {
	
	public Object actualResult;

	public Object expectedResult;

	public Validation(Object actualResult) {
		this.actualResult = actualResult;
	}

	public Validation(Object actualResult, Object expectedResult) {
		this.actualResult = actualResult;
		this.expectedResult = expectedResult;
	}

	public void shoulBeTrue(String message) {
		Assert.assertTrue((Boolean) this.actualResult, message);
	}

	public void shouldBeEqual(String message) {
		Assert.assertEquals(this.expectedResult,this.actualResult, message);
	}

}
