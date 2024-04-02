package com.PomPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BasePackage.BaseClass;
import com.UtilityPackage.UtilityClass;


public class AdminAdduserPom extends BaseClass {
	
	Actions act = new Actions(driver);
	
	public AdminAdduserPom() 
	{
		PageFactory.initElements(driver, this);
	}
	
	//Select UserRoll
	@FindBy(xpath="//div/i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")
	private WebElement userArrowRole;
	@FindBy(xpath="//div/span[text()='Admin']")
	private WebElement AdminRole;
	@FindBy(xpath="//div/span[text()='ESS']")
	private WebElement ESSRole;
	
	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	private WebElement EmpName;
	
	//select Status
	@FindBy(xpath="//div/i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")
	private WebElement statusSelect;
	@FindBy(xpath="//div/span[text()='Enabled']")
	private WebElement EnabledStatus;
	@FindBy(xpath="//div/span[text()='Disabled']")
	private WebElement DisabledStatus;
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement Adminusername2;
     
	@FindBy(xpath="// password (//input[@type='password'])[1]")
	private WebElement AdminPassword;

	@FindBy(xpath="//input[@type='password'])[2]")
	private WebElement Adminconfirmpassword;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement savebutton;
    
	@FindBy(xpath="//button[text()=' Cancel ']")
	private WebElement canclebutton;
	
	@FindBy(xpath="//a[text()='OrangeHRM, Inc']")
	private WebElement adminLink;
	
	//////////////////////////////////Method///////////////////////////////////
	

	public void AdminAdduserRole( ) 
	{   
		act.click(userArrowRole).perform();
		 UtilityClass.impliwait(7);
		act.moveToElement(AdminRole).click(AdminRole).build().perform();
	}
	public void AdminAdduserEmpName( String username) 
	{   
		UtilityClass.setText(username, EmpName);
	}
	public void AdminAddUserStatus() 
	{
		act.click(statusSelect).perform();
		 UtilityClass.impliwait(7);
		act.moveToElement(EnabledStatus).click(EnabledStatus).build().perform();
	}
	public void AdminPass( String password) 
	{   
		UtilityClass.setText(password,AdminPassword);
	}
	public void AdminConfirmPass(String confirmpassword ) 
	{   
        UtilityClass.setText(confirmpassword, Adminconfirmpassword);
	}
	public void AdminSaveButton( ) 
	{   
		 UtilityClass.eleClick(savebutton);
	}
	public void AdminCancleButton( ) 
	{   
		 UtilityClass.eleClick(canclebutton);
	}
	public void AdminLink( ) 
	{   
		 UtilityClass.eleClick(adminLink);
	}
	
}
