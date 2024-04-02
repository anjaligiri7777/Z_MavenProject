package com.PomPackage;

import org.openqa.selenium.WebElement;				
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BasePackage.BaseClass;
import com.UtilityPackage.UtilityClass;



public class LoginPomClass extends BaseClass{
 
	public LoginPomClass() 
	{
		PageFactory.initElements(driver,this);
	} 
	
	 @FindBy(xpath="//p[text()='Username : Admin']")
	 private WebElement username;
	
	 @FindBy(xpath="//p[text()='Password : admin123']")
	 private WebElement userpassword;
	 
	 @FindBy(xpath="//input[@name='username']")
     private WebElement userinput;
	
	 @FindBy(xpath="//input[@name='password']")
     private WebElement passwordinput;
    
	 @FindBy(xpath="//button[@type='submit']")
     private WebElement submitbutton;
	
	 @FindBy(xpath="//a[text()='OrangeHRM, Inc']")
     private WebElement LoginPageLink;
	 
	 public String getuser() 
	 {
		String original = username.getText();
		String username	= original.substring(original.indexOf('A'));
		return username;
	 }
	 public String getpassword() 
	 {  
		String original = userpassword.getText();
		String userpassword	= original.substring(original.lastIndexOf('a'));
		return userpassword;
	 }
	 public void setUsername(String username) 
	 {
		  UtilityClass.setText(username,userinput);
	     
	 }	 
	 public void setPassword(String userpassword ) 
	 {    
		 UtilityClass.setText(userpassword, passwordinput);
	 } 
	 public void SubmitButton() 
	 {   
		 UtilityClass.eleClick(submitbutton); 
	 } 
	 public void LoginPageLink() 
	 {    
		 UtilityClass.eleClick(LoginPageLink);
	 }
	 
	 
	 

}
