package com.BasePackage;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.UtilityPackage.UtilityClass;

public class BaseClass {
	
	public static WebDriver driver;
	
	
	public static String  projectPath = System.getProperty("user.dir");
	
	public void launchWebsite() 
	{
		driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    UtilityClass.maxWindow();
	    UtilityClass.impliwait(3);
		
	}
}
