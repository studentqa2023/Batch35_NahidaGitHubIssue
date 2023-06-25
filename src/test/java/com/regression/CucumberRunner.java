package com.regression;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


	@CucumberOptions(
			
	plugin={"json:target/cucumber.json" },//report main in jason formate
			
	features={"./src/test/resources/OnlineBankinngLogin.feature"} ,
	glue= {"com.generi"},//stefdef pakage name
	tags = "@Smoke"//test type
			
			
			)
		
		
		
	
		
public class CucumberRunner extends AbstractTestNGCucumberTests {

	
	
	
}
