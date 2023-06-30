package com.regression;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		
		plugin= {"json:target/cucumber.json"},
		features= {"./src/test/resources/OnlineBankinngLogin.feature"},
		glue= {"com.generic"},
		tags= "@SmokeTest"
		
		
		)
public class CucumberRunner extends AbstractTestNGCucumberTests{
	
	
}