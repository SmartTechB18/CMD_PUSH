package com.test;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.annotations.Test;

import com.generic.Base_Login;
import com.report.ExtentReportAutomation;

public class SmokeTest extends ExtentReportAutomation {
//	
//	public static void main(String[] args) throws Throwable {
//		new Base_Login().getLogin();
//	}


	@Test
	public void smoke_Test_Login_Funtion_Positive() throws Throwable {
		new Base_Login().getLogin();
	}
	
	
	
	
	
	
	
   
	
	

	
	

}
