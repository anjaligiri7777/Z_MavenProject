package com.PomPackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.WebElement;	
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BasePackage.BaseClass;
import com.UtilityPackage.ExcelReaderClass;
import com.UtilityPackage.UtilityClass;


public class AdmSysUserPom extends BaseClass{
	
	
	
	public AdmSysUserPom() 
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//i[@class='oxd-icon bi-chevron-left']")
    private WebElement	LeftArrow;
	
	@FindBy(xpath="//span[text()='Admin']")
    private WebElement	AdminOption;
	
	@FindBy(xpath="//i[@class='oxd-icon bi-caret-down-fill']")
    private WebElement	DownArrow;
	               
	@FindBy(xpath="//input[@class='oxd-input oxd-input--active']")
	private WebElement Adminusername;
             
	//RollSelect   
	@FindBy(xpath="(//div[@class='oxd-select-text-input'])[1]")
	private WebElement userRoll;
	@FindBy(xpath="(//div[text()='Admin'])[1]")
	private WebElement AdminRoll;
	@FindBy(xpath="(//div[@tabindex='0'])[1]")
	private WebElement ESSRoll;
	
	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	private WebElement Emp_Name;
	
	//StatusSelect
	@FindBy(xpath="(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")
	private WebElement status;
	@FindBy(xpath="	(//div[@class='oxd-select-text-input'])[1]")
	private WebElement EnableOption;
	@FindBy(xpath="(//div[@class='oxd-select-text-input'])[2]")
	private WebElement DisableOption;
		 
	@FindBy(xpath="//button[@type='submit']")
	private WebElement searchButton;
	
	@FindBy(xpath="//button[text()='Reset']")
	private WebElement resetButton;

	
	/////////////////////////////Methods///////////////////////////////
	
	public void adminoption() 
	{
		UtilityClass.eleClick(AdminOption);
	}
	
	public void AdminLeftArrow() 
	{
		UtilityClass.eleClick(LeftArrow);
	}
	public void AdminDownArrow() 
	{
		UtilityClass.eleClick(DownArrow);
	}
	public void AdminGetUsername(String value) 
	{
       UtilityClass.setText(value, Adminusername);
	}
	public void AdminUsernameExcel() throws EncryptedDocumentException, IOException 
	{
		 FileInputStream path = ExcelReaderClass.Excelpath("Orange_UserSystem.xlsx");
	     Sheet sh = ExcelReaderClass.sheetRead(path,"Sheet1");
	     Object data = ExcelReaderClass.getSingleData(sh, 1, 0);
	     Object data1 = ExcelReaderClass.getSingleData(sh, 1, 1);
	    //data.toString();
	     UtilityClass.setText(data.toString(), Adminusername);	
	     UtilityClass.setText(data1.toString(),Emp_Name);
	}
	public void AdminGetUserRoll( ) 
	{
		//act.click(userRoll).moveToElement(AdminRoll).click(AdminRoll).build().perform();
		UtilityClass.optionSelect(AdminRoll);
	}
	public void AdminGetEmpName(String value) 
	{   
       UtilityClass.setText(value,Emp_Name);
	}
	public void AdminGetStatus( ) 
	{   
	//	act.click(statusSelect).moveToElement(EnableOption).click(EnableOption).build().perform();
		UtilityClass.eleClick(EnableOption);
	}
	public void SearchbuttonMethod() 
	{
		UtilityClass.eleClick(searchButton);
	}
	public void ResetButtonMethod() 
	{
		UtilityClass.eleClick(resetButton);
	}
	



}
