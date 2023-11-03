package com.ZebraC.TestScripts;

import java.util.ArrayList;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import com.ZebraC.genericUtilities.BaseClass;
import com.ZebraC.genericUtilities.FrequentlyUsedCode;
import com.ZebraC.genericUtilities.IPathconstants;
import com.ZebraC.genericUtilities.ProprtyFile;


public class TestScript1 extends BaseClass{
	    
	  ProprtyFile pf=new ProprtyFile();
	  FrequentlyUsedCode fus=new FrequentlyUsedCode();
	@Test
	public void tc1() throws Throwable
	       {
		       String URL=pf.getPropertyKey("url");
	    	   driver.get(URL);
	       }
	
	

}
