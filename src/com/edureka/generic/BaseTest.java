package com.edureka.generic;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;

import com.edureka.generic.Const;

	public class BaseTest implements Const
	{
		
		public static WebDriver driver=null;
		public static WebDriverWait wait=null;
		
				
		@BeforeMethod
		
		public void OpenApp()
		{
			System.setProperty(chrome_key, chrome_value);
			driver = new ChromeDriver();
			wait=new WebDriverWait(driver,10);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("https://www.flipkart.com/");
			
		}
		
@AfterMethod

	public void closeApp()
	{
		driver.quit();
	}
	
	}



