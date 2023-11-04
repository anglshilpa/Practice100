package com.ZebraC.TestScripts;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import com.ZebraC.genericUtilities.BaseClass;

public class TestScript2Test extends BaseClass {
	
	
	@Test
	public void tc2() throws Throwable
	{
		driver.get(fus.allTimeUrl()); 
		WebDriver window = driver.switchTo().newWindow(WindowType.TAB);
		window.get("https://www.flipkart.com");
		String ele1="container";
		String ele2="a-page";
        ArrayList<String> al=new ArrayList<String>();
        al.add(ele1);
        al.add(ele2);
        
         for(int i=0; i<al.size(); i++)
         {
        	 if(al.contains("container"))
        	 {
        		 driver.close();
        	 }
         }
       
	}

}
