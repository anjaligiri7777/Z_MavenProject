package com.UtilityPackage;

import java.io.File;		
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.BasePackage.BaseClass;
import com.PomPackage.AdmSysUserPom;
import com.PomPackage.LoginPomClass;

public class UtilityClass extends BaseClass{
	
	public static Actions act ;
	public static String childewindow;
	public static String mainpage;

		
	public static void setText(String value,WebElement ele) 
	{
		ele.sendKeys(value);
	}
	public static void eleClick(WebElement ele) 
	{
	   ele.click();
	}
	public static void optionSelect(WebElement ele) 
	{
	   act.click().click(ele).build().perform();
	}
	
	public static void impliwait(int sec) 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(sec));
	}
	public static void maxWindow() 
	{
		driver.manage().window().maximize();
	}

	public static String takeScreenshot(String imageName) throws IOException 
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Date d = new Date();
		String currentTime = d.toString().replace(":", "_");
		String destination = (projectPath+"\\ScreenshotFolder\\"+imageName+currentTime+".png");
		File fy = new File(destination);
		FileUtils.copyFile(source, fy);
		return destination;	
	}
	public void WindowHandle() 
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
	    	}
	    }	
	    driver.switchTo().window(childewindow);
    }
	

	
	
}