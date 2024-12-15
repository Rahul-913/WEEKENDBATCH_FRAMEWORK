package com.OrangeHrm.excelGenericScripts;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.OrangeHrm.genericScripts.ApplicationConstants;

public class ReadExcel  implements ApplicationConstants
{
	public static String ReadData(String SheetName,int RowNum,int CellNum) throws Exception
	{
		FileInputStream fis = new FileInputStream(ExcelPath);
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet sheet = book.getSheet(SheetName);
		XSSFRow row = sheet.getRow(RowNum);
		XSSFCell cell = row.getCell(CellNum);
		String val = cell.getStringCellValue();
		return val;
	}

}
