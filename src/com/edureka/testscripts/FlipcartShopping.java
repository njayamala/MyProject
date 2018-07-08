package com.edureka.testscripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.edureka.generic.BaseTest;
import com.deureka.pom.EdurekaFilpcart;



public class FlipcartShopping extends BaseTest 
{
	public EdurekaFilpcart EFC=null;
	
	@Test(priority=0)
	public void Tc01() throws Exception
	{
		
		EFC=new EdurekaFilpcart(driver);
		try
		{
	
			EFC.closeSignIn();
			EFC.searchField("selenium Book");
			EFC.SearchIcon();
			EFC.Flipcartpage1();
			EFC.seleniumBook1();
			EFC.EnterPinCode("560021");
			EFC.CheckPinCode();
			EFC.DeliveredInTime();
			EFC.AddToCart();
			EFC.PlaceOrder();
			EFC.EnterMobileNumber("999999999");
			EFC.ClickContinue();
			EFC.InvalidEmailMobile();
			Assert.fail();
			EFC.EnterPassword("test");
						
			
		}
		catch(Exception e)
		{
			Reporter.log("Fails to navigate to All course");
		}	
			
	}

}
