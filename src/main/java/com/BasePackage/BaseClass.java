package com.BasePackage;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.UtilityPackage.UtilityClass;

public class BaseClass {
	
	public static WebDriver driver;
	public static String childewindow;
	public static String mainpage;

	
	public static String  projectPath = System.getProperty("user.dir");
	
	public void launchWebsite() 
	{
		driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    UtilityClass.maxWindow();
	    UtilityClass.impliwait(3);
		
	}
	public void windowHandle() 
	{
        mainpage  = driver.getWindowHandle();
		
		Set<String> All_Ids = driver.getWindowHandles();
	    Object[]  Id = All_Ids.toArray();  
	    UtilityClass.impliwait(4);
	    
	    for(int i=0;i<Id.length;i++) 
	    {
	    	if(Id[i].toString().equalsIgnoreCase(mainpage))
	    	{
	    		System.out.println(mainpage);
	    	}
	    	else
	    	{
	    		childewindow= Id[i].toString(); 
	    		System.out.println(childewindow);
	    	}
	    }	
	    driver.switchTo().window(childewindow);
	}
}
