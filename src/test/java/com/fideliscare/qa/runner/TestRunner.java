package com.fideliscare.qa.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( features = "features",
                               glue = "com.fideliscare.qa.steps",
                               monochrome = true,
                               plugin = { "pretty", "html:Report.html"}
                               
)

public  class  TestRunner {
	

}
