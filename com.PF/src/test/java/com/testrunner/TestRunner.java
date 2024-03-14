package com.testrunner;

import org.junit.runner.RunWith;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//features = ".src/test/java/CucumberPFMSbSA/Features",
//glue = ".src/test/java/com.stepdefinations",

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = "com.stepdefinations",
		dryRun = false,
		tags = "@Regression",
		monochrome = true )

public class TestRunner 
{
	
}
