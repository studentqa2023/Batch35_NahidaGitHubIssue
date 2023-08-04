package com.TestNG35;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGCoding {
	
//Precondition @BeforeTest	@Beforelass  @Before
	
	public void Setup() {
	System.out.println("Setup system environment in config file");
	}
	@BeforeTest
	public void LaunchBrowser() {
	System.out.println("Open Chrome Browser");	
		
		}
	@BeforeClass
	public void EnterURL() {
	System.out.println("Enter Application URL");	
	}
	@BeforeMethod
public void Login() {
	System.out.println("Login to the Application");
	
}
//Action
	@Test
	public void TestExecucation() {
		System.out.println("Test case Execution");
}
//post condition @AfterMethod @AfterClass @AfterTest @AfterSuite	







}
