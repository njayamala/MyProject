package com.edureka.generic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.Logger;

public class BasePage {

	public WebDriver driver= null;
	public static Logger log = Logger.getLogger(BasePage.class);

	public BasePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void verifyTitle(String exp_title)
	{
		WebDriverWait w = new WebDriverWait(driver, 10);
		try
		{
			w.until(ExpectedConditions.titleContains(exp_title));
			
			String act_title = driver.getTitle();
			Assert.assertEquals(act_title, exp_title);
			log.info("actual and the expected title are equal");
		}
		catch(Exception e)
		{
			e.printStackTrace();
				log.error("The actual title and the expected title doesn't match");
		}
	}
	
	public void verifyCurrentUrl(String exp_Url)
	{
		WebDriverWait w = new WebDriverWait(driver, 10);
		try
		{
			w.until(ExpectedConditions.urlToBe(exp_Url));
			
			String act_Url = driver.getTitle();
			Assert.assertEquals(act_Url, exp_Url);
			log.info("actual and the expected Url are equal");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			log.error("The actual Url and the expected Url doesn't match");
		}
	}
	
	
	public void verifyElementPresent(WebElement ele)
	{
		WebDriverWait w = new WebDriverWait(driver, 10);
		try
		{
			w.until(ExpectedConditions.visibilityOf(ele));
			log.info(ele+ " element found");
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			log.error(ele + " not found");
			// TODO: handle exception
		}
		
	}
	
	
	public void mouseHover(WebElement ele)
	{
		WebDriverWait w = new WebDriverWait(driver, 10);
		try
		{
			Actions action = new Actions(driver);
			action.moveToElement(ele).perform();
			log.info("mousehover on " +ele +"was successful");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			log.error("Unable to mouse hover on " +ele );
		}
		
	}
	public void pageScrollDown()
	{
		WebDriverWait w = new WebDriverWait(driver, 10);
		try
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,500)");
			log.info("Scoll Page Down was successful");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			log.error("Unable to scoll  down ");
		}
		
	}
	
	public void handleAlert()
	{
		WebDriverWait w = new WebDriverWait(driver, 10);
		try
		{
			Alert alert = driver.switchTo().alert();
			alert.accept();
		}
		catch(Exception e)
		{
			Reporter.log("No alerts found to switch");
		}
	}
	
		public void handleDropDown(WebElement ele, int option)
		{
			WebDriverWait w = new WebDriverWait(driver, 10);
			try
			{
				Select oSelect=new Select(ele);
				oSelect.selectByIndex(option);
			}
			catch(Exception e)
			{
				Reporter.log("No alerts found to switch");
			}
		}
	
		public void handleChildWindow(WebElement ele)
		{
			WebDriverWait w = new WebDriverWait(driver, 10);
			try
			{		
				// Get and store both window handles in array
				  Set<String> AllWindowHandles = driver.getWindowHandles();
				  String window1 = (String) AllWindowHandles.toArray()[0];
				   String window2 = (String) AllWindowHandles.toArray()[1];
								  
				  //Switch to window2(child window) and performing actions on it.
				  driver.switchTo().window(window2);
				  verifyElementPresent(ele);
				 				
			}
			catch(Exception e)
			{
				e.printStackTrace();
				log.error( "child window not found");
				// TODO: handle exception
			}
		}

}

