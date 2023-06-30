package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	public void getLogin() {
	WebDriver driver = new ChromeDriver();	
	driver.get(" https://magento.softwaretestingboard.com/");	
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@class='authorization-link']")).click();
	driver.findElement(By.xpath("//*[@id='email']")).sendKeys("nislam3178@gmail.com");
	driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("123456@nyc");
	driver.findElement(By.xpath("//*[@class='action login primary']")).click();
	
	}

}


