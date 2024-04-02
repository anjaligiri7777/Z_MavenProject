package com.TestPackage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BasePackage.BaseClass;
import com.PomPackage.AdminClickPom;
import com.PomPackage.LoginPomClass;

public class AdminAddTestCLass {
	
	@Test(dependsOnGroups = "Login")
	public void AdminClickTest() 
	{
		AdminClickPom adm = new AdminClickPom();
		adm.adminClick();
		adm.add();
		
	}
	



}
