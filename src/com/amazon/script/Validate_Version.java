package com.amazon.script;

import org.testng.annotations.Test;

import com.amazon.pom.Version;

public class Validate_Version extends BaseTest
{

@Test
public void validateVersion()
{
	Version v1 = new Version(driver);
	        v1.verifyVersion("actiTIME 2016.3");
}
	
}
