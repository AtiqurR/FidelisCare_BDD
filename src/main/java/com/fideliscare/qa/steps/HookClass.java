package com.fideliscare.qa.steps;

import com.fideliscare.qa.base.BaseClass;
import com.fideliscare.qa.utilities.JavaLogger;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HookClass {
	
	@Before
	public void setUpMethod() {
		JavaLogger.log("Initiating BDD tests");
		BaseClass.setUp();
	}
	@After
	public void tearUp() {
		BaseClass.tearUp();
	}

}
