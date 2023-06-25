package com.generi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login2 {
	public void getogin() {
		
	WebDriver driver = new ChromeDriver();	
	
	driver.manage().window().maximize();
	 driver.get("https://magento.softwaretestingboard.com/");
	 driver.findElement(By.xpath("//*[@class='authorization-link']")).click();
	 driver.findElement(By.xpath("//*[@id='email']")).sendKeys("naislam3178@gmail.com");
	 driver.findElement(By.xpath("//*[@type='password']")).sendKeys("123456@nyc");
	 driver.findElement(By.xpath("//*[@class='action login primary']")).click();
	}
	

}

