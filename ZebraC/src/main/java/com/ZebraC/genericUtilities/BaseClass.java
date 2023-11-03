package com.ZebraC.genericUtilities;

import java.util.Properties;

import org.apache.xmlbeans.SystemProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
	
	
	 public WebDriver driver;
	String browser;
	public FrequentlyUsedCode fus=new FrequentlyUsedCode();
	  public ProprtyFile pf=new ProprtyFile();
	@BeforeClass
	
	public void BeforeClass()
	{
		WebDriverManager.chromedriver().setup();  
		// System.setProperty("webdriver.chrome.driver","C:\\Users\\Dudes.co\\Downloads\\chromedriver-win64 (4)\\chrome.exe");
		  driver=new ChromeDriver();
	   }
	   }
