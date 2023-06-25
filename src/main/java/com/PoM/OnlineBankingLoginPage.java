package com.PoM;

import org.openqa.selenium.By;

public class OnlineBankingLoginPage {

	private static By username = By.xpath("//*[@id='username']");
	private static By password = By.xpath("//*[@id='password']");
	private static By finalsignin = By.xpath("//*[@type='submit']");
	private static By logoutbutton = By.xpath("//*[@id='logoutButton']");
	
	public static By getUsername() {
		return username;
	}
	public static By getPassword() {
		return password;
	}
	public static By getFinalsignin() {
		return finalsignin;
	}
	public static By getLogoutbutton() {
		return logoutbutton;
	}

}
