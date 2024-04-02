package com.TestPackage;

import java.io.IOException;					

import org.testng.Assert;				
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.BasePackage.BaseClass;
import com.PomPackage.LoginPomClass;
import com.UtilityPackage.UtilityClass;

public class LoginTestCase extends BaseClass{
	
	BaseClass base = new BaseClass();
	
	
	@BeforeClass
	public void setUp() 
	{  
		base.launchWebsite();
		
	}
	
	@BeforeClass
	public void tearDown() 
	{
		//driver.close();
		//driver.quit();
	}
	
	
//	@Test
//	public void getTitle() 
//	{
//	String title = driver.getTitle();
//		System.out.println(title);
//		Assert.assertEquals(title,"OrangeHRM");
//   }
	@Test(groups = "Login")
	public void LoginTest() throws IOException, InterruptedException
	{   
		LoginPomClass log = new LoginPomClass();
		
		String username = log.getuser();
	    String password = log.getpassword();
	    Thread.sleep(5000);
	    log.setUsername(username);
	
	    log.setPassword(password);
        System.out.println(username);
        System.out.println(password);
	    log.SubmitButton();
	    
	}
//	@Test
//	public void LoginPageLink() throws IOException 
//	{
//		 LoginPomClass log = new  LoginPomClass();
//		 log.LoginPageLink();
//		 base.windowHandle();
//		 UtilityClass.takeScreenshot("windowID");
//			 
//	}
//	
//	@Test
//	public void NextPageTitle() 
//	{
//		driver.switchTo().window(childewindow);
//		String nextTitle = driver.getTitle();
//		System.out.println(nextTitle);
//		Assert.assertEquals(nextTitle,"Human Resources Management Software | OrangeHRM");
//	}
//	

}  