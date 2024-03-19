package com.amazon.script;

import org.testng.annotations.Test;

import com.amazon.generics.Excel;
import com.amazon.pom.Version;

public class ValidateVerisonE extends BaseTest
{

	
	@Test
	public void validateVersionE()
	{
		String sheet ="Version";
		
		String ver = Excel.getCellValue(PATH, sheet, 1, 1);
		
		
		Version v1 = new Version(driver);
		        v1.verifyVersion(ver);
	}
}
