package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
//import java.util.Date;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import com.base.base;


public class utility extends base{
	
	public static String getdataexcel(int row,int cell) throws InterruptedException,EncryptedDocumentException, IOException
	{
		String data;
	
	FileInputStream f=new FileInputStream("C:/Users/ADMIN/CSBC/excel/CSBC.xlsx");
	Sheet a= WorkbookFactory.create(f).getSheet("Sheet1");
	try
	{
	 data= a.getRow(row).getCell(cell).getStringCellValue();
		}
	catch(Exception e)
	{
		long no=(long) a.getRow(row).getCell(cell).getNumericCellValue();
		data=(""+no);
	}
	return data;
	}
	
	public static void getscreenshots(WebDriver driver) throws IOException
	{
		Date a1=new Date();
		String a=a1.toString().replace(":","-");

			File s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File d=new File("C:/Users/ADMIN/CSBC/Screenshot/"+a+".png");	
				FileHandler.copy(s,d);
		}
	
	
}