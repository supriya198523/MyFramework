package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gallary {
	WebDriver driver;

	@FindBy(linkText="GALLERY")
	private WebElement GALLERY1;
	@FindBy(linkText="Event Gallery")
	private WebElement Event_Gallery;
	@FindBy(linkText="Video Gallery")
	private WebElement Video_Gallery;
	@FindBy(linkText="VIP Gallery")
	private WebElement Vip_Gallery;
	@FindBy(xpath="(//div[@class='MuiGrid-root MuiGrid-container css-1d3bbye']//div)[8]")
	private WebElement play1;
	@FindBy(xpath="(//div[@class='MuiGrid-root MuiGrid-container css-1d3bbye']//div)[9]")
	private WebElement play2;
	@FindBy(xpath="(//div[@class='MuiGrid-root MuiGrid-container css-1d3bbye']//div)[10]")
	private WebElement play3;
	@FindBy(xpath="(//div[@class='MuiBox-root css-e1po3g']//div)[5]")
	private WebElement img1;
	@FindBy(xpath="(//div[@class='MuiBox-root css-e1po3g']//div)[5]")
	private WebElement vid;
	@FindBy(xpath="(//div[@class='MuiBox-root css-e1po3g']//div)[5]")
	private WebElement vipimg;
		public Gallary(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
	}
	
	public void clickGallary() throws InterruptedException
	{
		System.out.println("\nValidations for gallary page");
		boolean home=GALLERY1.isDisplayed();
		System.out.println("Gallary tab is Displayed="+home);
		boolean home2=GALLERY1.isEnabled();
		System.out.println("Gallary tab is Enabled="+home2);
		GALLERY1.click();
		Thread.sleep(1000);
		boolean hom2=Event_Gallery.isEnabled();
		System.out.println("Event_Gallery is Enabled="+hom2);
		Event_Gallery.click();
		Thread.sleep(2000);
		boolean home5=img1.isDisplayed();
		System.out.println("Event_Gallery is Displayed="+home5);
		GALLERY1.click();
		Thread.sleep(1000);
		boolean hom=Video_Gallery.isEnabled();
		System.out.println("Video_Gallery is Enabled="+hom);
	    Video_Gallery.click();
	    Thread.sleep(1000);
	    boolean hom0=vid.isDisplayed();
		System.out.println("Video_Gallery is Displayed="+hom0);
		Thread.sleep(1000);
	    play1.click();
	    Thread.sleep(2000);
	    play1.click();
	    Thread.sleep(1000);
	    play2.click();
	    Thread.sleep(2000);
	    play2.click();
	    Thread.sleep(1000);
	    play3.click();
	    Thread.sleep(2000);
	    play3.click();
	    Thread.sleep(1000);
	    GALLERY1.click();
		Thread.sleep(1000);
		boolean hom11=Vip_Gallery.isEnabled();
		System.out.println("Vip_Gallery is Enabled="+hom11);
	    Vip_Gallery.click();
	    boolean hom12=vipimg.isDisplayed();
		//System.out.println("Vip_Gallery is Displayed="+hom12);
	        
	}
	}

	
	

