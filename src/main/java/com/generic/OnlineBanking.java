package com.generic;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.PoM.OnlineBankingLoginPage;
import com.util.BaseConfig;

public class OnlineBanking {
	@Test
public static void getLogin() throws IOException {
WebDriver driver = new ChromeDriver();
driver.manage().window().fullscreen();
//driver.navigate().to("file:///C:/Users/arjoh/AppData/Local/Microsoft/Windows/INetCache/IE/OW0WKYW9/dev_online%20Banking%20monthly_yearly%20statement[1].html");
driver.get(BaseConfig.getConfig("URL"));
driver.findElement(OnlineBankingLoginPage.getUsername()).click();
System.out.println(BaseConfig.getConfig("Username"));
driver.findElement(OnlineBankingLoginPage.getUsername()).sendKeys(BaseConfig.getConfig("Username"));
driver.findElement(OnlineBankingLoginPage.getPassword()).click();
System.out.println(BaseConfig.getConfig("Password"));
driver.findElement(OnlineBankingLoginPage.getPassword()).sendKeys(BaseConfig.getConfig("Password"));
driver.findElement(OnlineBankingLoginPage.getFinalsignin()).click();

Assert.assertTrue(driver.findElement(OnlineBankingLoginPage.getLogoutbutton()).isDisplayed());
System.out.println("Hi");
SoftAssert sf = new SoftAssert();
sf.assertTrue(driver.findElement(OnlineBankingLoginPage.getLogoutbutton()).isDisplayed());
System.out.println("Hello");

sf.assertAll();

	

	}

   }
	
	






