package com.pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contactus {
	WebDriver driver;

	@FindBy(linkText="CONTACT US")
	private WebElement con;
	@FindBy(xpath="//iframe[@src='https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3781.9861647213593!2d73.7729239148997!3d18.5746624723655!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3bc2b8c6e3fccd81%3A0xe5001a4ce95dffd4!2sConsisty%20System%20Pvt.%20Ltd.!5e0!3m2!1sen!2sin!4v1677331627106!5m2!1sen!2sin']")
	private WebElement map;
	@FindBy(id=":rb:")
	private WebElement name;
	@FindBy(id=":rc:")
	private WebElement feedback;
	@FindBy(id=":rd:")
	private WebElement clear1;
	@FindBy(id=":re:")
	private WebElement submit;
	@FindBy(xpath="(//div[@class='MuiGrid-root MuiGrid-container css-1at8lz3']//label)[2]")
	private WebElement star1;
	@FindBy(xpath="(//div[@class='MuiGrid-root MuiGrid-container css-1at8lz3']//label)[4]")
	private WebElement star2;
	@FindBy(xpath="(//div[@class='MuiGrid-root MuiGrid-container css-1at8lz3']//label)[6]")
	private WebElement star3;
	@FindBy(xpath="(//div[@class='MuiGrid-root MuiGrid-container css-1at8lz3']//label)[8]")
	private WebElement star4;
	@FindBy(xpath="(//div[@class='MuiGrid-root MuiGrid-container css-1at8lz3']//label)[10]")
	private WebElement star5;
	@FindBy(xpath="(//button[@class='gm-control-active'])[1]")
	private WebElement zoomout;
	@FindBy(xpath="(//button[@class='gm-control-active'])[2]")
	private WebElement zooin;
	
	public contactus(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	public void clickoncontact() throws InterruptedException
	{
		
		System.out.println("Validaton for contact page");	
		boolean v=con.isDisplayed();
		System.out.println("ContactUs tab is displayed="+v);
	    con.click();
	    boolean v1=map.isDisplayed();
	    System.out.println("Map is displayed="+v1);
	    Thread.sleep(2000);
	
	}
	public void entername(String feedback1) throws InterruptedException
	{
		boolean v=name.isEnabled();
	   System.out.println("Name textbos is Enabled="+v);
		name.sendKeys(feedback1);
		Thread.sleep(2000);
		submit.click();
		if(feedback.getText().isEmpty())
		{
			System.out.println("Description is required");
		}
		Thread.sleep(1000);
	}
		
	public void clickonclear() throws InterruptedException
	{
		clear1.click();
		Thread.sleep(1000);
	}
	
	public void enetrmassage(String feedback1) throws InterruptedException
	{
	    feedback.sendKeys(feedback1);
		Thread.sleep(1000);
		star1.click();
		Thread.sleep(1000);
		star2.click();
		Thread.sleep(1000);
		star3.click();
		Thread.sleep(1000);
		star4.click();
		Thread.sleep(1000);
		star5.click();
		Thread.sleep(1000);
		submit.click();
		Thread.sleep(1000);
		
		if(name.getText().isEmpty())
		{
			System.out.println("PersonName is required");	
		}
	}
	public void entername1(String feedback1) throws InterruptedException
	{
		name.sendKeys(feedback1);
		Thread.sleep(2000);
	}
	public void enetrmassage1(String feedback1) throws InterruptedException
	{
		feedback.sendKeys(feedback1);
		Thread.sleep(1000);
		submit.click();
		Thread.sleep(1000);
	}
}






		

	
	
	


