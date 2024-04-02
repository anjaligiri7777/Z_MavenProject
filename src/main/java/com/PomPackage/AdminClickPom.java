package com.PomPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;	

import com.BasePackage.BaseClass;
import com.UtilityPackage.UtilityClass;

public class AdminClickPom extends BaseClass{
	 
	public AdminClickPom() 
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//span[text()='Admin']") private WebElement AdminClick;
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary']") private WebElement Add;
	
	
	public void adminClick()
	{
		UtilityClass.eleClick(AdminClick);
	}
	
	public void add()
	{
		UtilityClass.eleClick(Add);
	}

}
