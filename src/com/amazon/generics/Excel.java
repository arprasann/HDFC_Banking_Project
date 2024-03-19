package com.amazon.generics;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Excel 
{

	//Count How Many Rows
public static int getRowCount(String path,String sheet)
	{
int rc=0;
try
{
	FileInputStream fis=new FileInputStream(path);
	Workbook wb = WorkbookFactory.create(fis);
	       rc=wb.getSheet(sheet).getLastRowNum();
}
catch(Exception e)
{
	System.out.println("We are getting Exception");	
	}
return rc;
}

//Get Call Value
public static String getCellValue(String path,String sheet,int r,int c)
{
	String v=" ";
	try
	{
		FileInputStream fis=new FileInputStream(path);
		 Workbook wb = WorkbookFactory.create(fis);
		 v=wb.getSheet(sheet).getRow(r).getCell(c).toString();
	}
	catch(Exception e)
	{
		System.out.println("We are getting Exception");		
	}
	return v;
}

	
}
