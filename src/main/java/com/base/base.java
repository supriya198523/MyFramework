package com.base;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base {

	public static WebDriver openchromebrowser()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		return driver;
		
	}

public static WebDriver openMozilla()
{
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    return driver;
}
	public static WebDriver openEdgebrowser()
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		return driver;
		
	}
		
	public static WebDriver openInternetexpo()
	{
		WebDriverManager.iedriver().setup();
		WebDriver driver=new InternetExplorerDriver();
		return driver;
		
	}
}
