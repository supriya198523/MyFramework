package com.pom;



import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

public class aboutus {
	
WebDriver driver;

	@FindBy(xpath="//a[text()='ABOUT US']")
	private WebElement about;
	@FindBy(xpath="(//div[@class='styles_frameDiv1__JCSXD']//a)[1]")
	private WebElement aboutus;
	@FindBy(xpath="(//div[@class='styles_frameDiv1__JCSXD']//a)[2]")
	private WebElement events;
	@FindBy(xpath="(//div[@class='styles_frameDiv1__JCSXD']//a)[3]")
	private WebElement testi;
	@FindBy(xpath="(//div[@class='styles_frameDiv1__JCSXD']//a)[4]")
	private WebElement gall;
	@FindBy(xpath="(//div[@class='styles_frameDiv1__JCSXD']//a)[5]")
	private WebElement help;
	@FindBy(xpath="(//div[@class='styles_frameDiv1__JCSXD']//a)[6]")
	private WebElement addr;
	@FindBy(xpath="(//div[@class='styles_frameDiv1__JCSXD']//a)[7]")
	private WebElement partner;
	@FindBy(xpath="(//div[@class='styles_frameDiv1__JCSXD']//a)[8]")
	private WebElement donation;
	@FindBy(xpath="(//div[@class='styles_frameDiv1__JCSXD']//a)[9]")
	private WebElement feedback;
	@FindBy(xpath="(//div[@class='styles_socialMediaIconsDiv__jxGYG']//img)[1]")
	private WebElement facebook;
	@FindBy(xpath="(//div[@class='styles_socialMediaIconsDiv__jxGYG']//img)[2]")
	private WebElement twit;
	@FindBy(xpath="(//div[@class='styles_socialMediaIconsDiv__jxGYG']//img)[3]")
	private WebElement insta;
	@FindBy(xpath="(//div[@class='styles_socialMediaIconsDiv__jxGYG']//img)[4]")
	private WebElement utube;
	@FindBy(xpath="//div[@class='MuiBox-root css-0']//img")
	private WebElement img;
	@FindBy(xpath="//div[@class='styles_footerDiv__8SIxX']")
	private WebElement footer;
	@FindBy(xpath="(//div[@class='MuiGrid-root MuiGrid-container css-t9ccxx']//div)[3]//h4")
	private WebElement text;
	public aboutus(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
	}
	public void scolldown()
	{
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scollBy(0,1000)");
	}
	public void clickabout() throws InterruptedException
	{
		System.out.println("\n Validations for AboutUs page");
		boolean v=about.isDisplayed();
		System.out.println("AboutUs tab is displayed="+v);
		about.click();
		Thread.sleep(3000);
		boolean i=img.isEnabled();
		System.out.println("Images are displayed="+i);
		System.out.println(text.getText());
		
	}
	public void clickonfooter() throws InterruptedException
	{
		boolean v=footer.isDisplayed();
		System.out.println("Footer is displayed="+v);
		events.click();
		Thread.sleep(2000);
		about.click();
		Thread.sleep(5000);
		testi.click();
		Thread.sleep(2000);
		about.click();
		Thread.sleep(5000);
		gall.click();
		Thread.sleep(2000);
		about.click();
		Thread.sleep(5000);
		addr.click();
		Thread.sleep(2000);
		about.click();
		Thread.sleep(5000);
		partner.click();
		Thread.sleep(2000);
		about.click();
		Thread.sleep(5000);
		donation.click();
		Thread.sleep(2000);
		about.click();
		Thread.sleep(5000);
		feedback.click();
		Thread.sleep(4000);
		about.click();
		Thread.sleep(4000);
		/*facebook.click();
		Thread.sleep(1000);
		driver.close();
		Thread.sleep(5000);
		twit.click();
		Thread.sleep(1000);
		driver.close();
		Thread.sleep(5000);*/
	   
		
	}

}
