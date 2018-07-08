package com.deureka.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.edureka.generic.BasePage;

public class EdurekaFilpcart extends BasePage
{
	
	
	public EdurekaFilpcart(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//button[@class='_2AkmmA _29YdH8']")
	public WebElement CloseSignIn;
	
	@FindBy(xpath="//input[@title='Search for products, brands and more']")
	public WebElement SeachField;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement searchIcon;
	
	public String text1="Selenium Book - Buy Products Online at Best Price in India - All Categories | Flipkart.com";
	
	@FindBy(xpath="//img[@src='https://rukminim1.flixcart.com/image/612/612/book/9/3/0/a-pract-gd-to-test-automa-using-selenium-original-imadak3vmxusheyy.jpeg?q=70']")
	public WebElement seleniumBook1;
	
	public String Title2="A Practitoner s Guide To Test Automation Using Selenium 1 Edition - Buy A Practitoner s Guide To Test Automation Using Selenium 1 Edition Online at Best Prices in India - Flipkart.com";
	
	@FindBy(xpath="//input[@placeholder='Enter Delivery Pincode']")
	public WebElement EnterPinCode;
	
	@FindBy(xpath="//span[@class='_2aK_gu']")
	public WebElement CheckPinCode;
	
	@FindBy(xpath="//div[@class='_29Zp1s']")
	public WebElement DeliveredInTime;
	
	@FindBy(xpath="//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")
	public WebElement AddToCart;
	
	@FindBy(xpath="//button[@class='_2AkmmA _14O7kc _7UHT_c']")
	public WebElement PlaceOrder;
	
	@FindBy(xpath="//input[@class='_2zrpKA _14H79F']")
	public WebElement EnterMobileNumber;
	
	@FindBy(xpath="//button[@class='_2AkmmA _1poQZq _7UHT_c']")
public WebElement ClickContinue;

	public String Exp_Errormessage="Please enter valid Email ID/Mobile number";
	
	@FindBy(xpath="//span[@class='ZAtlA-']")
	public WebElement InvalidEmailMobile;
	
	@FindBy(xpath="//input[@type='password']")
	public WebElement EnterPassword;
	
	
	public void closeSignIn( ) 
	{
		verifyElementPresent(CloseSignIn);
		CloseSignIn.click();
	}
	public void searchField(String field ) 
	{
		verifyElementPresent(SeachField);
		SeachField.sendKeys(field);
	}
	
	public void SearchIcon( ) 
	{
		verifyElementPresent(searchIcon);
		searchIcon.click();
	}
	
	public void Flipcartpage1()
	{
		verifyTitle(text1);
		Reporter.log("Successfull Navigation to "+ text1 );
		
	}
	
	public void seleniumBook1( ) 
	{
		verifyElementPresent(seleniumBook1);
		seleniumBook1.click();
	}
	
	public void handleChildWindow()
	{
		verifyTitle(Title2);
		Reporter.log("Successfull Navigation to "+ Title2 );
		
	}
	
	public void EnterPinCode(String pin ) 
	{
		handleChildWindow(EnterPinCode);
		EnterPinCode.sendKeys(pin);
	}
	public void CheckPinCode( ) 
	{
		handleChildWindow(CheckPinCode);
		CheckPinCode.click();
	}
	public void DeliveredInTime( ) 
	{
		handleChildWindow(DeliveredInTime);
		String Actual_value=DeliveredInTime.getText();
		Reporter.log("Delivery In Time" +Actual_value);
	}
	public void AddToCart( ) 
	{
		handleChildWindow(AddToCart);
		AddToCart.click();
	}
	public void PlaceOrder( ) 
	{
		handleChildWindow(PlaceOrder);
		PlaceOrder.click();
	}
	public void EnterMobileNumber(String mobile) 
	{
		handleChildWindow(EnterMobileNumber);
		EnterMobileNumber.sendKeys(mobile);
	}
	
	public void ClickContinue( ) 
	{
		handleChildWindow(ClickContinue);
		ClickContinue.click();
	}
	public void InvalidEmailMobile( ) 
	{
		handleChildWindow(InvalidEmailMobile);
		String Actual_Errormessage=InvalidEmailMobile.getText();
		Reporter.log("Invalid Email Id and Mobile No" +Actual_Errormessage);
		
	}
	public void EnterPassword(String password) 
	{
		handleChildWindow(EnterPassword);
		EnterPassword.sendKeys(password);
	}
	
}
