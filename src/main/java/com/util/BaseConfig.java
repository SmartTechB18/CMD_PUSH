package com.util;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class BaseConfig {
	
public static String getconfig(String value) throws Exception {   // not important Zero --  find in Google 
		
	    //	File file = new File("./config.properties");
		String path = "./config.properties";    // path 
		FileInputStream fis = new FileInputStream(path);  // convert to stream
	    // read the config file	
		Properties pro = new Properties();
		pro.load(fis);  // all value loaded in java
		
		return pro.get(value).toString();  // return to String 
	}



}
