package com.TestPackage;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BasePackage.BaseClass;
import com.PomPackage.AdmSysUserPom;
import com.UtilityPackage.UtilityClass;

public class AdmSysUserTestCase extends BaseClass {
	
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
	}
	
	@Test
	public void AdmSysUser() throws IOException, InterruptedException 
	{   
		LoginTestCase log = new LoginTestCase();
		Thread.sleep(5000);
		log.LoginTest();
		UtilityClass.impliwait(7000);
		
		AdmSysUserPom adm = new AdmSysUserPom();
		adm.adminoption();
		adm.AdminLeftArrow();
		UtilityClass.impliwait(7);
		adm.AdminUsernameExcel();
		 
	}
	

}
