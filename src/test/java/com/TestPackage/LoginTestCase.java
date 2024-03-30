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
	{  // super.launchWebsite();
		base.launchWebsite();
	}
	
	@BeforeClass
	public void tearDown() 
	{
		//driver.close();
		//driver.quit();
	}
	@Test
	public void method() throws IOException, InterruptedException 
	{   setUp();
		System.out.println("method run");
		Thread.sleep(7000);
		UtilityClass.takeScreenshot("methodimg");
	}
	
//	@Test
//	public void getTitle() 
//	{
//	String title = driver.getTitle();
//		System.out.println(title);
//		Assert.assertEquals(title,"OrangeHRM");
//   }
	@Test
	public void LoginTest() throws IOException, InterruptedException
	{ 
		//SoftAssert sa = new SoftAssert();
		LoginPomClass log = new LoginPomClass();
		 Thread.sleep(4000);
		String username = log.getuser();
	    String password = log.getpassword();
	    
	    log.setUsername(username);
	  //  sa.assertEquals(username,"Admin");
	    log.setPassword(password);
	  //  sa.assertEquals(password,"admin12");
	    log.SubmitButton();
	   // sa.assertAll();
	  Thread.sleep(0);
	   // UtilityClass.takeScreenshot("trial");
	   
	 
	    
	}
	@Test
	public void LoginPageLink() throws IOException 
	{
		 LoginPomClass log = new  LoginPomClass();
		 log.LoginPageLink();
		 base.windowHandle();
		 UtilityClass.takeScreenshot("windowID");
			 
	}
	
	@Test
	public void NextPageTitle() 
	{
		driver.switchTo().window(childewindow);
		String nextTitle = driver.getTitle();
		System.out.println(nextTitle);
		Assert.assertEquals(nextTitle,"Human Resources Management Software | OrangeHRM");
	}

}
