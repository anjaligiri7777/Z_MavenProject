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

public class UtilityClass extends BaseClass{
	
	public static Actions act;
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
	public static void impliwait(int sec) 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(sec));
	}
	public static void maxWindow() 
	{
		driver.manage().window().maximize();
	}
	public void actionsClass() 
	{
		 act = new Actions(driver);
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
	
//	public String takeScreenshot1(String testName) throws IOException{
//		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//
//		String date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("YYYY_MM_DD_hh_mm_ss"));
//		
//		String des = (projectPath + "\\ScreenshotFolder" + testName + date + ".png");
//		File destination = new File(des);
//				
//		FileUtils.copyFile(scr, destination);
//		
//		return des;
//	
//
//}
	
	
}