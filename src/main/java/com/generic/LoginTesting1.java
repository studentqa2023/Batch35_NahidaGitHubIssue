package com.generic;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.PoM.LoginPage;
import com.util.BaseConfig;

public class LoginTesting1 {
public void getLogin1() throws IOException {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get(BaseConfig.getConfig("URL"));
//click the signing button
driver.findElement(LoginPage.signin).click();
//pass the email
driver.findElement(LoginPage.email).click();
driver.findElement(LoginPage.email).sendKeys(BaseConfig.getConfig("Username"));
//pass the password
driver.findElement(LoginPage.password).click();
driver.findElement(LoginPage.password).sendKeys(BaseConfig.getConfig("Password"));
//click the final signin
driver.findElement(LoginPage.finalsignin).click();
//close browser
driver.quit();
	
}	
	


}




