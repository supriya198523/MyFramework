package com.pom;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	WebDriver driver;
	JavascriptExecutor j;
	@FindBy(linkText="HOME")
	private WebElement Home1;
	@FindBy(xpath="//a[text()='View More']")
	private WebElement video;
	@FindBy(xpath="(//a[text()=' View More'])[1]")
	private WebElement vip;
	@FindBy(xpath="(//a[text()=' View More'])[2]")
	private WebElement event;
	@FindBy(xpath="(//div[@class='MuiBox-root css-e1po3g']//div)[7]")
	private WebElement play1;
	@FindBy(xpath="(//div[@class='MuiBox-root css-e1po3g']//div)[8]")
	private WebElement play2;
	@FindBy(xpath="(//div[@class='MuiBox-root css-e1po3g']//div)[9]")
	private WebElement play3;
	@FindBy(xpath="(//div[@class='MuiBox-root css-e1po3g']//div)[10]")
	private WebElement play4;
	@FindBy(xpath="(//div[@class='MuiGrid-root MuiGrid-container css-1d3bbye']//div)[8]")
	private WebElement play5;
	@FindBy(xpath="//div[@class='swiper-pagination swiper-pagination-clickable swiper-pagination-bullets swiper-pagination-horizontal']//span")
	private List<WebElement> a;
	//WebDriverWait wait=new WebDriverWait(driver,10); 
	//WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(Home1));
	@FindBy(xpath="//div[@class='MuiBox-root css-0']//img")
	private WebElement img;
	@FindBy(xpath="//div[@class='MuiGrid-root MuiGrid-container css-1d3bbye']")
	private WebElement vimg;
	public Homepage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	
	public void cliclonhome() throws InterruptedException
	{		
		j=(JavascriptExecutor)driver;
		System.out.println("\n Validations for Home page");
		boolean home=Home1.isDisplayed();
		System.out.println("Home tab is visible="+home);
		boolean home2=Home1.isEnabled();
		System.out.println("Home tab is Enabled="+home2);
		Home1.click();
		Thread.sleep(3000);
		//j.executeScript("window.scollBy(0,400)");
		boolean img1=img.isDisplayed();
		System.out.println("image is displayed="+img1);
		boolean vid=vimg.isDisplayed();
		System.out.println("video image is displayed="+vid);
		play1.click();
		Thread.sleep(1000);
		play1.click();
		play2.click();
		Thread.sleep(1000);
		play2.click();
		play3.click();
		Thread.sleep(1000);
		play3.click();
		play4.click();
		Thread.sleep(1000);
		play4.click();
		Thread.sleep(1000);
		boolean v=video.isEnabled();
		System.out.println("video link is enabled="+v);
		video.click();
		Thread.sleep(2000);
		/*play5.click();
		Thread.sleep(2000);
		play5.click();
		Thread.sleep(1000);*/
		Home1.click();
		//j.executeScript("window.scollBy(0,700)");
		Thread.sleep(4000);
        boolean link2=vip.isEnabled();
        System.out.println("vip link is enabled="+link2);
		vip.click();
		Thread.sleep(1000);
		Home1.click();
		//j.executeScript("window.scollBy(0,900)");
		Thread.sleep(4000);
		boolean link3=event.isEnabled();
        System.out.println("Event link is enabled="+link3);
		event.click();
		Thread.sleep(1000);
		Home1.click();
		//j.executeScript("window.scollBy(0,1200)");
		int num =  a.size();
		System.out.println("Total no.of Radio buttons:"+num);
		Thread.sleep(2000);
		
		Thread.sleep(2000);
		for(int i=0;i<num;i++) {
			
			a.get(i).click();
			System.out.println("Radio button is clickable");
			Thread.sleep(2000);
			}
	}



}
