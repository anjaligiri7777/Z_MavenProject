package com.TestPackage;

import java.io.IOException;			

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BasePackage.BaseClass;
import com.PomPackage.AdmSysUserPom;
import com.PomPackage.LoginPomClass;
import com.UtilityPackage.UtilityClass;

public class AdmSysUserTestCase extends BaseClass {
	
	
	AdmSysUserPom adm;
	UtilityClass ut;
	LoginPomClass logpom = new LoginPomClass();
   // LoginTestCase log = new    LoginTestCase();
	
	@BeforeMethod
	public void setUp() 
	{
	    adm = ut.loginWeb();
	}
	@Test
	public void AdmSysUser() throws IOException, InterruptedException 
	{   
		
	
		adm.adminoption();
		
		//adm.AdminLeftArrow();
//		UtilityClass.impliwait(7);
//		adm.AdminUsernameExcel();
//		UtilityClass.impliwait(5);
//		adm.AdminGetUserRoll();
		//adm.AdminGetStatus();
		
	}
	

}
