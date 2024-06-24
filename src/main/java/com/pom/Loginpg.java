package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpg {
	WebDriver driver;
	
	@FindBy(linkText="LOG IN")
	private WebElement LOG_IN;
	@FindBy(id=":r0:")
	private WebElement Username;
	
	@FindBy(id=":r1:")
	private WebElement Pass;
	
	@FindBy(id=":r2:")
	private WebElement Singin;
	@FindBy(linkText="Sign Up")
	private WebElement signup;
	@FindBy(name="MobileNumber")
	private WebElement MobNO;
	@FindBy(id=":r1:")
	private WebElement GenOtp;
	@FindBy(linkText="Already have an account? Login")
	private WebElement AgainLogin;
	
	@FindBy(linkText="Forgot password?")
	private WebElement Forgotpass;
	
	@FindBy(id=":r0:")
	private WebElement MobNO1;
	@FindBy(id=":r1:")
	private WebElement Proceed;
	@FindBy(linkText="Return to Login")
	private WebElement RetuenLogin;
	
	@FindBy(xpath="//img[@alt='PlayStore link']")
	private WebElement GetonGoogle;
	
	public Loginpg(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	public void clickLOGIN() throws InterruptedException
	{
		System.out.println("\nValidations for Login page");
	boolean home=LOG_IN.isDisplayed();
	System.out.println("Login tab is Displayed="+home);
	boolean home2=LOG_IN.isEnabled();
	System.out.println("Login tab is Enabled="+home2);
		LOG_IN.click();
		Thread.sleep(1000);
	}
	public void enetrinvalidusername(String username) throws InterruptedException
	{
		Username.sendKeys(username);
		System.out.println("invalid UserName is Given More than 10 chars not allowed");
	    Thread.sleep(1000);
	}
	public void enetrusername(String username) throws InterruptedException
	{
		boolean home2=Username.isEnabled();
	    System.out.println("Username is Enabled="+home2);
	    	Username.sendKeys(username);
	    Thread.sleep(1000);
	    Singin.click();
	    Thread.sleep(1000);	
	    if(Pass.getText().isEmpty())
		{
			System.out.println("Password is required");
		}
	   }
	public void enetrpass(String pass) throws InterruptedException
	{   
		boolean home2=Pass.isEnabled();
        System.out.println("Password is Enabled="+home2);
	    Pass.sendKeys(pass);
	    Thread.sleep(1000);	
	     Singin.click();
	    Thread.sleep(1000);	
	    if(Username.getText().isEmpty())
		{
			System.out.println("UserName is required");
		}
	   
	}
	public void enetrusername1(String username) throws InterruptedException
	{
		Username.sendKeys(username);
	    Thread.sleep(1000);
	}
	public void enetrpass1(String pass) throws InterruptedException
	{
		 Pass.sendKeys(pass);
		    Thread.sleep(1000);	
		    Singin.click();
		    Thread.sleep(1000);	
	}
	public void clicksignup() throws InterruptedException
	{
		boolean home2=signup.isEnabled();
	    System.out.println("signup Link is Enabled="+home2);
		signup.click();
		Thread.sleep(1000);	
	}
	
	public void entermobile(String number) throws InterruptedException
	{   
		GenOtp.click();
		Thread.sleep(1000);	
		if(MobNO.getText().isEmpty())
		{
			System.out.println("MobileNumber is required");
		}
		int a=10;
		MobNO.sendKeys(number);
		String str=MobNO.getAttribute("value");
		Thread.sleep(1000);	
		GenOtp.click();
		System.out.println(str.length());
		if(str.length()<a)
		{
			System.out.println("Mobile number must be 10 digit");
		}
		Thread.sleep(1000);	
		boolean home1=AgainLogin.isEnabled();
	    System.out.println("AgainLogin is Enabled="+home1);
		AgainLogin.click();
		
	}
	public void entermobile1(String number) throws InterruptedException
	{
		MobNO.sendKeys(number);
		Thread.sleep(1000);	
		GenOtp.click();
		Thread.sleep(1000);	
		AgainLogin.click();
	}
	public void clickForgotpass() throws InterruptedException
	{
		boolean home1=Forgotpass.isEnabled();
	    System.out.println("Forgotpass is Enabled="+home1);
		Forgotpass.click();
		Thread.sleep(1000);	
	}
	public void entermobile3(String number1) throws InterruptedException
	{
		int a=10;
		MobNO1.sendKeys(number1);
		String str=MobNO1.getAttribute("value");
		Thread.sleep(1000);	
		Proceed.click();
		System.out.println(str.length());
		if(str.length()<a)
		{
			System.out.println("Mobile number must be 10 digit");
		}
	}
	public void entermobileagain(String number1) throws InterruptedException
	{
		Proceed.click();
		Thread.sleep(3000);	
		if(MobNO1.getText().isEmpty())
		{
			System.out.println("Mobile Number is required");
		}
		MobNO1.sendKeys(number1);
		Thread.sleep(1000);	
		boolean home1=Proceed.isEnabled();
	    System.out.println("Proceed is Enabled="+home1);
		Proceed.click();
		Thread.sleep(1000);	
		boolean home2=RetuenLogin.isEnabled();
	    System.out.println("RetuenLogin is Enabled="+home2);
		RetuenLogin.click();
	}
	public void clickongoogle() 
	{
		boolean home1=GetonGoogle.isEnabled();
	    System.out.println("GetonGoogle is Enabled="+home1);
	    GetonGoogle.click();
	}
	
}
