package com.generi;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import com.PoM.OnlineBankingLoginPage;
import com.util.BaseConfig;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	WebDriver driver; 
	@Given("go to application URL")
	public void go_to_application_url() throws IOException {
	 driver = new ChromeDriver();
		driver.manage().window().fullscreen();
	
		driver.get(BaseConfig.getConfig("URL"));
	}

	@When("put valid user name")
	public void put_valid_user_name() throws IOException {
		driver.findElement(OnlineBankingLoginPage.getUsername()).click();
		driver.findElement(OnlineBankingLoginPage.getUsername()).sendKeys(BaseConfig.getConfig("Username"));
	}    

	@When("put valid password")
	public void put_valid_password() throws IOException {
		driver.findElement(OnlineBankingLoginPage.getPassword()).click();
		driver.findElement(OnlineBankingLoginPage.getPassword()).sendKeys(BaseConfig.getConfig("Password"));    
	}

	@When("click sign in")
	public void click_sign_in() {
		driver.findElement(OnlineBankingLoginPage.getFinalsignin()).click();
	}

	@Then("check sign out button")
	public void check_sign_out_button() {
		SoftAssert sf = new SoftAssert();
		sf.assertTrue(driver.findElement(OnlineBankingLoginPage.getLogoutbutton()).isDisplayed());
		sf.assertAll();  
	}

	@Given("Go to application URl")
	public void go_to_application_u_rl() throws IOException {
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
	
		driver.get(BaseConfig.getConfig("URL"));
	}

	@When("Put invalid user name")
	public void put_invalid_user_name() throws IOException {
		driver.findElement(OnlineBankingLoginPage.getUsername()).click();
		driver.findElement(OnlineBankingLoginPage.getUsername()).sendKeys(BaseConfig.getConfig("Invalid_Username"));  
	}

	@When("put invalid password")
	public void put_invalid_password() throws IOException {
		driver.findElement(OnlineBankingLoginPage.getPassword()).click();
		driver.findElement(OnlineBankingLoginPage.getPassword()).sendKeys(BaseConfig.getConfig("Invalid_Password"));    
	}

	@When("Click the login")
	public void click_the_login() {
		driver.findElement(OnlineBankingLoginPage.getFinalsignin()).click();
	}

	@Then("Logout button should not be visible")
	public void logout_button_should_not_be_visible() {
	Alert alert = driver.switchTo().alert();
	alert.accept();
	
		SoftAssert sf = new SoftAssert();
		sf.assertTrue(driver.findElement(OnlineBankingLoginPage.getLogoutbutton()).isDisplayed());
		
        sf.assertAll();    
	}


	
	

}
