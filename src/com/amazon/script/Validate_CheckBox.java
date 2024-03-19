package com.amazon.script;

import org.testng.annotations.Test;

import com.amazon.pom.CheckBox;

public class Validate_CheckBox extends BaseTest 
{

	
	@Test
	public void validateChkBox()
	{
		log.debug("***Validate CheckBox Test Case****");
		CheckBox c1 = new CheckBox(driver);
		         c1.clickOnCheckBox();
		         waitforSomeTime();
		         
		         log.debug("Validated CheckBox Successfuully****");        
	}
}
