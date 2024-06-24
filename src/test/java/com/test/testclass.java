package com.test;
import java.io.IOException;
import java.text.ParseException;
import java.util.concurrent.TimeUnit;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.base.base;
import com.pom.Gallary;
import com.pom.Donate;
import com.pom.Homepage;
import com.pom.aboutus;
import com.pom.contactus;
import com.pom.Loginpg;
import com.pom.event;
import com.utility.utility;


public class testclass extends base
{
WebDriver driver;

@BeforeClass
@Parameters("Browser")

	public void openBrowser(String Browser) throws InterruptedException
	{
	    if(Browser.equals("Chrome"))	
		{
		driver=base.openchromebrowser();
		}
	    else if(Browser.equals("Firefox"))
	    {
	    	
	    	driver=base.openMozilla();
	    }
	
	     driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	     driver.get("https://csbc.consisty.com/home");
	     String title=driver.getCurrentUrl();
		System.out.println("Title of our Project="+title);
		
		driver.manage().window().maximize();
	}


//@Test(priority=6)
//public void verifyGallary() throws InterruptedException
//{
//Gallary g=new Gallary(driver);
//g.clickGallary();
//}

@Test(priority=-1)
public void verifyEvent() throws InterruptedException, EncryptedDocumentException, IOException, ParseException
{
	 String str1="Google";  // hard assert
	String str2 = "Google";
	System.out.println("Test case execution started");
	SoftAssert s=new SoftAssert();
	s.assertEquals(str1, str2);
	//Assert.assertEquals(str1, str2);
	System.out.println("Test case exicution finished");
	event g=new event(driver);
	g.clickonEvent();
	g.enterstartdate();
	g.enterLastdate();
	g.clickEvent();
	Thread.sleep(2000);
	String eventname=utility.getdataexcel(4,1);
    g.clickEvent(eventname);
}

//@Test(priority=0)
//public void verifyHome() throws InterruptedException 
//{
//	Homepage g=new Homepage(driver);
//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//	g.cliclonhome();
//
//}
//@Test(priority=1)//(groups= {"regression"}/*,enabled=false*/
//public void verifyContactUs() throws InterruptedException, EncryptedDocumentException, IOException
//
//{
//	contactus c=new contactus(driver);
//	String feedback1=utility.getdataexcel(2,0);
//	c.clickoncontact();
//	c.entername(feedback1);
//	c.clickonclear();
//	String feedback2=utility.getdataexcel(2,1);
//	c.enetrmassage(feedback2);
//	c.clickonclear();
//	c.entername1(feedback1);
//	c.enetrmassage1(feedback2);
//}
////@Test(priority=3)
////public void verifyaboutus() throws InterruptedException
////{
////	
////	System.out.println("Test case exicution started");  // Soft assert
////    SoftAssert soft=new SoftAssert();
////    String str1="Google"; 
////	String str2 = "Google1";
////	soft.assertEquals(str1,str2);
////	System.out.println("Test case exicution finished");
////	aboutus a=new aboutus(driver);	
////	a.clickabout();
////	a.clickonfooter();
////}
//@Test(priority=4)
//public void verifyLoginpage() throws InterruptedException, EncryptedDocumentException, IOException 
//{
//	Loginpg login1=new Loginpg(driver);
//	login1.clickLOGIN();
//	String user=utility.getdataexcel(0,0);
//	login1.enetrinvalidusername(user);
//	String username=utility.getdataexcel(1,0);
//	login1.enetrusername(username);
//	String pass=utility.getdataexcel(1,1);
//	driver.navigate().refresh();
//	login1.enetrpass(pass);
//	driver.navigate().refresh();
//	login1.enetrusername1(username);
//	login1.enetrpass1(pass);
//     login1.clicksignup();
//	String num=utility.getdataexcel(1,2);
//	login1.entermobile(num);
//	driver.navigate().refresh();
//	String number1=utility.getdataexcel(1,3);
//	login1.entermobile1(number1);
//	login1.clickForgotpass();
//	login1.entermobile3(num);
//	login1.entermobileagain(number1);  
//	login1.clickongoogle();
//	driver.navigate().back();
//}
//@Test(priority=5)
//public void verifyDonatepg() throws InterruptedException, EncryptedDocumentException, IOException
//{
//	Donate d=new Donate(driver);
//	d.clickDONATE();
//	String name=utility.getdataexcel(5,0);
//d.entername(name);
//String lname=utility.getdataexcel(5,1);
//d.enterlastname(lname);
//d.enteramount1();
//d.clearnow();
//	Thread.sleep(1000);
//d.entername(name);
//	d.enterlastname(lname);
//String email=utility.getdataexcel(5,2);
//	d.enterEmail(email);
//	String mobile=utility.getdataexcel(5,3);
//d.enternumber(mobile);	String amt=utility.getdataexcel(5,4);
//	d.enteramount(amt);
//	d.nodonate();
//	Thread.sleep(1000);
//	d.entername(name);
//	d.enterlastname(lname);
//	d.enterEmail(email);
//	d.enternumber(mobile);
//d.enteramount(amt);
//	d.yesdonate();
//	String id=utility.getdataexcel(6,0);
//	d.entertransction(id);	Thread.sleep(1000);
//	d.clickfile();	
//}
//



@AfterMethod
public void screenshot(ITestResult result) throws IOException
{
	if(ITestResult.FAILURE==result.getStatus())
	{
		System.out.println("Screenshot for failed test cases");
		utility.getscreenshots(driver);
	}
	else if(ITestResult.SUCCESS==result.getStatus())
	{
		System.out.println("Screenshot for Passed test cases");
		utility.getscreenshots(driver);
		
	}
	
	}

@AfterClass
public void closebrowser() throws InterruptedException
{
	Thread.sleep(5000);
	driver.close();
	
}
}
