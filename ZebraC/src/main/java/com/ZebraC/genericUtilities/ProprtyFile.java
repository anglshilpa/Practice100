package com.ZebraC.genericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ProprtyFile {
	
	public String getPropertyKey(String key) throws Throwable
	{
		 FileInputStream fin=new FileInputStream(IPathconstants.propertyPath);
		 Properties properties=new Properties();
		 properties.load(fin);
		 String value=properties.getProperty(key);
		 return value;
	}

}
