package com.PomPackage;

import org.openqa.selenium.WebElement;	
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BasePackage.BaseClass;
import com.UtilityPackage.UtilityClass;


public class AdminAdduserPom extends BaseClass {
	public AdminAdduserPom() 
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	private WebElement addButton;
	
	//Select UserRoll
	@FindBy(xpath="(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")
	private WebElement userRole;
	@FindBy(xpath="//div[text()='Admin']")
	private WebElement AdminRole;
	@FindBy(xpath="//div[text()='ESS']")
	private WebElement ESSRole;
	
	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	private WebElement EmpName;
	
	//select Status
	@FindBy(xpath="// status (//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")
	private WebElement statusSelect;
	@FindBy(xpath="//div[text()='Enabled']")
	private WebElement EnabledStatus;
	@FindBy(xpath="//div[text()='Disabled']")
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
	
	public void AdminAddButton( ) 
	{   
		UtilityClass.eleClick(addButton);
	}
	public void AdminAdduserRole( ) 
	{   
		//act.click(userRole).moveToElement(AdminRole).click(AdminRole).build().perform();
		UtilityClass.eleClick(userRole);
	}
	public void AdminAdduserEmpName( String username) 
	{   
		UtilityClass.setText(username, EmpName);
	}
	public void AdminAddUserStatus() 
	{
		//act.click(statusSelect).moveToElement(EnabledStatus).click(EnabledStatus).build().perform();
		UtilityClass.eleClick(EnabledStatus);
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
