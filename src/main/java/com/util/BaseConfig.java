package com.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseConfig {
public static String getConfig(String testData) throws IOException {
 String	filePath="./Environment/dev.properties";
	
	FileInputStream fis = new FileInputStream(filePath);
	//read the value from file		
	Properties	pro =new Properties();	
	pro.load(fis);	
	//read each value
String applicationURL=pro.get(testData).toString();
	
	
	return applicationURL;
	
}
public static void main(String[] args) throws IOException {
	
	System.out.println(BaseConfig.getConfig("URL"));
	System.out.println(BaseConfig.getConfig("Username"));
	System.out.println(BaseConfig.getConfig("Password"));
	
	
}	

}





