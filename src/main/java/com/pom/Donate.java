package com.pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Donate {
	WebDriver driver;
	
	@FindBy(linkText="DONATE")
	private WebElement DONATE;
	@FindBy(id=":r0:")
	private WebElement firstName;
	@FindBy(id=":r1:")
	private WebElement LastName;
	@FindBy(id=":r2:")
	private WebElement EmailId;
	@FindBy(id=":r3:")
	private WebElement MobNo;
	@FindBy(id=":r4:")
	private WebElement Amount;
	@FindBy(id=":r5:")
	private WebElement clear1;
	@FindBy(xpath="(//button[@style='background-color: rgb(248, 250, 252); border-radius: 5px; align-items: center; width: 110px; margin-top: 14%;'])[1]")
			private WebElement amt1;
	@FindBy(xpath="(//button[@style='background-color: rgb(248, 250, 252); border-radius: 5px; align-items: center; width: 110px; margin-top: 14%;'])[2]")
	private WebElement amt2;
	@FindBy(xpath="(//button[@style='background-color: rgb(248, 250, 252); border-radius: 5px; align-items: center; width: 110px; margin-top: 14%;'])[3]")
	private WebElement amt3;
	@FindBy(xpath="(//button[@style='background-color: rgb(248, 250, 252); border-radius: 5px; align-items: center; width: 110px; margin-top: 14%;'])[4]")
	private WebElement amt4;
	@FindBy(id=":r6:")
	private WebElement donate;
	@FindBy(xpath="//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium css-1n30lf1']")
	private WebElement nodonate;
	@FindBy(xpath="//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium css-1eo54zj']")
	private WebElement yesdonate;
	@FindBy(xpath="//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-fullWidth MuiInputBase-formControl css-4o2pgx']//input")
	private WebElement transctionId;
	@FindBy(xpath="//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl css-ieh31q']//input")
	private WebElement file;
	@FindBy(xpath="(//div[@class='MuiGrid-root MuiGrid-container css-1d3bbye']//button)[1]")
	private WebElement reset;
	@FindBy(xpath="(//div[@class='MuiGrid-root MuiGrid-container css-1d3bbye']//button)[2]")
	private WebElement upload;
	
	public Donate(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}

public void clickDONATE() throws InterruptedException
	{System.out.println("\nValidations for Donate page");
	boolean home=DONATE.isDisplayed();
	System.out.println("DONATE tab is Displayed="+home);
	boolean home2=DONATE.isEnabled();
	System.out.println("DONATE tab is Enabled="+home2);
		DONATE.click();
		Thread.sleep(1000);
	}

public void entername(String name) throws InterruptedException
{		firstName.sendKeys(name);
		
}
public void enterlastname(String name) throws InterruptedException
{
		LastName.sendKeys(name);
}

public void enterEmail(String name) throws InterruptedException
{
		EmailId.sendKeys(name);
		System.out.println("Email should be in correct format");
		}
public void enterEmail1(String name) throws InterruptedException
{
		EmailId.sendKeys(name);
		}
public void enternumber(String name) throws InterruptedException
{
		MobNo.sendKeys(name);
		Thread.sleep(1000);
}
public void enteramount(String name) throws InterruptedException
{
		Amount.sendKeys(name);
		Thread.sleep(1000);
}
public void clickondonate() throws InterruptedException
{
donate.click();
Thread.sleep(2000);
if(Amount.getText().isEmpty())
{
	System.out.println("Please enter amount greater than 1");
}
}
public void clickondonate1() throws InterruptedException
{
donate.click();
Thread.sleep(2000);
}
public void nodonate() throws InterruptedException
{
	Thread.sleep(1000);
	nodonate.click();
	Thread.sleep(1000);
}
public void enteramount1() throws InterruptedException
{
	Thread.sleep(2000);
		amt1.click();
		Thread.sleep(1000);
		amt2.click();Thread.sleep(1000);
		amt3.click();Thread.sleep(1000);
		amt4.click();Thread.sleep(1000);
}
public void yesdonate() throws InterruptedException
{
	yesdonate.click();
	Thread.sleep(1000);
}
public void entertransction(String id) throws InterruptedException
{
	Thread.sleep(2000);
	transctionId.sendKeys(id);
	Thread.sleep(1000);
}
public void clickfile() throws InterruptedException
{
	file.sendKeys("C:/Users/ADMIN/CSBC/PaymentScreenshots/payment screenshot.jpeg");
	Thread.sleep(2000);
	upload.click();
	boolean up=upload.isSelected();
	System.out.println(up);
}
public void clearnow() throws InterruptedException {
	clear1.click();
	Thread.sleep(1000);
	}	
	
}



