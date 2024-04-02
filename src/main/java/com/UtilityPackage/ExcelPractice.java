package  com.UtilityPackage;

import java.io.FileInputStream;	
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.BasePackage.BaseClass;

public class ExcelPractice extends BaseClass  {
	
	public static FileInputStream fy;
	
	public static FileInputStream Excelpath(String fileName) throws FileNotFoundException 
	{
	  return  fy = new FileInputStream ( projectPath +"\\src\\test\\resources\\ExcelSheetFolder\\" +fileName );
	}
	
	public static Sheet Readsheet (FileInputStream fy ,String sheet) throws EncryptedDocumentException, IOException 
	{
		return WorkbookFactory.create(fy).getSheet(sheet);
	
	}
	public static Object GetSingleData(Sheet sh, int row ,int cell) 
	{
	 if( sh.getRow(row).getCell(cell).getCellType().toString().equalsIgnoreCase("String"))
	 {
		return  sh.getRow(row).getCell(cell).getStringCellValue();
	 }
	 else	 
	 {
		return sh.getRow(row).getCell(cell).getNumericCellValue();	 
	 }
		 
	}


}
