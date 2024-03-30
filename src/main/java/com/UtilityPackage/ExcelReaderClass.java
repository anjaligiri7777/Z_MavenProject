package com.UtilityPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.BasePackage.BaseClass;

public class ExcelReaderClass extends BaseClass {
	
	FileInputStream path;
	
	public FileInputStream Excelpath() throws FileNotFoundException 
	{
	    return path = new FileInputStream(projectPath+"\\src\\test\\resources\\ExcelSheetFolder");
	}
	
	public  Sheet sheetRead(FileInputStream path,String sheet) throws EncryptedDocumentException, IOException 
	{
		return WorkbookFactory.create(path).getSheet(sheet);
	}
	public Object getSingleData(Sheet sh,int row,int col) 
	{
		if(sh.getRow(row).getCell(col).getCellComment().toString().equalsIgnoreCase("String")) 
		{
			return sh.getRow(row).getCell(col).getStringCellValue();
		}
		else 
		{
			return sh.getRow(row).getCell(col).getNumericCellValue();
		}
	}

}
