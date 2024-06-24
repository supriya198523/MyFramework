package com.pom;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class event {

	WebDriver driver;
	@FindBy(linkText="EVENT")
	private WebElement EVENT1;
	@FindBy(xpath="(//div[@class='MuiInputAdornment-root MuiInputAdornment-positionEnd MuiInputAdornment-outlined MuiInputAdornment-sizeMedium css-1nvf7g0']//button)[1]")
	private WebElement startdate;
	@FindBy(xpath="(//button[@type='button'])[6]")
	private WebElement year;
	@FindBy(id=":r2:")
	private WebElement search;
	@FindBy(id=":r3:")
	private WebElement searchbutton;
	@FindBy(xpath="(//div[@class='MuiGrid-root MuiGrid-container css-1d3bbye']//div)[2]")
	private WebElement img1;
	@FindBy(xpath="(//div[@class='MuiGrid-root MuiGrid-container css-1d3bbye']//button)[1]")
	private WebElement show1;
	@FindBy(xpath="(//div[@class='MuiGrid-root MuiGrid-container css-1d3bbye']//button)[1]")
	private WebElement book1;
	
	@FindBy(xpath="//div[@class='MuiPickersFadeTransitionGroup-root css-1bx5ylf']//div")
	private WebElement actualdate;
	
	@FindBy(xpath="//div[@class='MuiDayPicker-monthContainer css-i6bazn']//div//button")
	private List<WebElement> list;
	
	@FindBy(xpath="//div[@class='MuiYearPicker-root css-f09ynp']//div")
	private List<WebElement> list1;
	
	@FindBy(xpath="(//button[@type='button'])[11]")
	private WebElement yearbutton;
	@FindBy(xpath="(//button[@type='button'])[9]")
	private WebElement enddate;
	@FindBy(xpath="//button[@title='Next month']")
	private WebElement Nextmonth;
	@FindBy(xpath="//button[@title='Previous month']")
	private WebElement previousmonth;
	public event(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	
	public void clickonEvent() throws InterruptedException, ParseException
	{
		System.out.println("\nValidation of EVENT tab is statred");
		boolean b=EVENT1.isDisplayed();
		System.out.println("EVENT tab is displayed="+b);
		EVENT1.click();
		
	}
	public void enterstartdate() throws InterruptedException, ParseException

	{
		
			    String date1="18/06/2000";
			    String arr[]=date1.split("/");
			    String date=arr[0];
			    String month=arr[1];
			    String year=arr[2];
			    		     
			    Calendar cal=Calendar.getInstance();//static class it will show current date
			    SimpleDateFormat s=new SimpleDateFormat("dd/MMM/yyyy");//M shd capital
			    s.setLenient(false);//invalid date eg.30 feb
		        Date d=s.parse(date1);
		        cal.setTime(d);//point to given date
		         int oldday=cal.get(Calendar.DAY_OF_MONTH);//23
		          int oldmonth=cal.get(Calendar.MONTH);//02
		         int oldyear=cal.get(Calendar.YEAR);//1990

		         startdate.click();
		 	    Thread.sleep(1000);
			    try {
			    	
			    String currentdate= actualdate.getText();
			    System.out.println(currentdate);//March 2023
			    String arr1[]=currentdate.split(" ");
			    String month1=arr1[0];
			    String year1=arr1[1];

			    cal.setTime(new SimpleDateFormat("MMM yyyy").parse(currentdate));//passing March 2023
			    int currentmonth=cal.get(Calendar.MONTH);//03
		        int currentyear=cal.get(Calendar.YEAR);//2023
               
              
		        
			    if(!year1.equals(year))
			    	{
			    		yearbutton.click();
			    		
			    	   	for(int i=1;i<=list1.size();i++)
				          {
				   	      String a=list1.get(i).getText();
				   	  
				   	      if(a.equals(year))
				   			{
				   		      list1.get(i).click();
				   		   Thread.sleep(1000);
				   		     break;
				   			}
				         }
			    	   	currentdate= actualdate.getText();	
			    	   	arr1=currentdate.split(" ");
					     month1=arr1[0];//march
					     year1=arr1[1];//1990
					     cal.setTime(new SimpleDateFormat("MMM yyyy").parse(currentdate));//passing March 2023
						    currentmonth=cal.get(Calendar.MONTH);//03
					        currentyear=cal.get(Calendar.YEAR);//2023
					        if(!month1.equals(month))//march equals feb
						     {
                                   
					         while(oldmonth<currentmonth)//2<3
					        {
					    		 previousmonth.click();
					    		 currentdate= actualdate.getText();
					    		 cal.setTime(new SimpleDateFormat("MMM yyyy").parse(currentdate));
								 currentmonth=cal.get(Calendar.MONTH);
								 Thread.sleep(1000);
					    	 }
					    	 while(oldmonth>currentmonth)
					    	 {
					    		 Nextmonth.click();
					    		 currentdate= actualdate.getText();
					    		 cal.setTime(new SimpleDateFormat("MMM yyyy").parse(currentdate));
								 currentmonth=cal.get(Calendar.MONTH);Thread.sleep(1000);
					    	 }
						     }
			    	     for(int i=1;i<=list.size();i++)//selecting date
			            {
			 	        String a=list.get(i).getText();
			 	         if(a.equals(date))
			 			 {
			 		      list.get(i).click();
			 		      Thread.sleep(1000);
			 		     break;
			 			  }
			            }
			    	  }
			    for(int i=1;i<=list.size();i++)//selecting date
	            {
	 	        String a=list.get(i).getText();
	 	         if(a.equals(date))
	 			 {
	 		      list.get(i).click();
	 		      Thread.sleep(1000);
	 		     break;
	 			  }
	            }
					     
			 System.out.println("From date is get selected");
			 }

	catch(Exception e)
	{
	System.out.println("Please check date it is invalid");
	} 
}

public void enterLastdate() throws InterruptedException, ParseException

{
	
		    String date1="15/May/2025";
		   
		    String arr[]=date1.split("/");
		    String date=arr[0];
		    String month=arr[1];
		    String year=arr[2];
		    		     
		    Calendar cal=Calendar.getInstance();//static class it will show current date
		    SimpleDateFormat s=new SimpleDateFormat("dd/MMM/yyyy");//M shd capital
		    s.setLenient(false);//invalid date eg.30 feb
	        Date d=s.parse(date1);
	        cal.setTime(d);//point to given date
	         int oldday=cal.get(Calendar.DAY_OF_MONTH);//23
	          int oldmonth=cal.get(Calendar.MONTH);//02
	         int oldyear=cal.get(Calendar.YEAR);//1990

	         startdate.click();
	 	    Thread.sleep(1000);
		    try {
		    	
		    String currentdate= actualdate.getText();
		    System.out.println(currentdate);//March 2023
		    String arr1[]=currentdate.split(" ");
		    String month1=arr1[0];
		    String year1=arr1[1];

		    cal.setTime(new SimpleDateFormat("MMM yyyy").parse(currentdate));//passing March 2023
		    int currentmonth=cal.get(Calendar.MONTH);//03
	        int currentyear=cal.get(Calendar.YEAR);//2023
           
          
	        
		    if(!year1.equals(year))
		    	{
		    		yearbutton.click();
		    		
		    	   	for(int i=1;i<=list1.size();i++)
			          {
			   	      String a=list1.get(i).getText();
			   	  
			   	      if(a.equals(year))
			   			{
			   		      list1.get(i).click();
			   		   Thread.sleep(1000);
			   		     break;
			   			}
			         }
		    	   	currentdate= actualdate.getText();	
		    	   	arr1=currentdate.split(" ");
				     month1=arr1[0];//march
				     year1=arr1[1];//1990
				     cal.setTime(new SimpleDateFormat("MMM yyyy").parse(currentdate));//passing March 2023
					    currentmonth=cal.get(Calendar.MONTH);//03
				        currentyear=cal.get(Calendar.YEAR);//2023
				        if(!month1.equals(month))//march equals feb
					     {
                               
				         while(oldmonth<currentmonth)//2<3
				        {
				    		 previousmonth.click();
				    		 currentdate= actualdate.getText();
				    		 cal.setTime(new SimpleDateFormat("MMM yyyy").parse(currentdate));
							 currentmonth=cal.get(Calendar.MONTH);
							 Thread.sleep(1000);
				    	 }
				    	 while(oldmonth>currentmonth)
				    	 {
				    		 Nextmonth.click();
				    		 currentdate= actualdate.getText();
				    		 cal.setTime(new SimpleDateFormat("MMM yyyy").parse(currentdate));
							 currentmonth=cal.get(Calendar.MONTH);Thread.sleep(1000);
				    	 }
					     }
		    	     for(int i=1;i<=list.size();i++)//selecting date
		            {
		 	        String a=list.get(i).getText();
		 	         if(a.equals(date))
		 			 {
		 		      list.get(i).click();
		 		      Thread.sleep(1000);
		 		     break;
		 			  }
		            }
		    	  }
		    for(int i=1;i<=list.size();i++)//selecting date
            {
 	        String a=list.get(i).getText();
 	         if(a.equals(date))
 			 {
 		      list.get(i).click();
 		      Thread.sleep(1000);
 		     break;
 			  }
            }
				     
		 System.out.println("From date is get selected");
		 }

catch(Exception e)
{
System.out.println("Please check date it is invalid");
} 
}

public void clickEvent() throws InterruptedException, ParseException
{
	searchbutton.click();
    Thread.sleep(1000);
}
		public void clickEvent(String event) throws InterruptedException, ParseException
		{
			boolean b2=search.isEnabled();
			System.out.println("Search box is Enabled="+b2);
			search.sendKeys(event);
			Thread.sleep(1000);
		boolean b3=searchbutton.isEnabled();
		System.out.println("searchbutton is Enabled="+b3);
		searchbutton.click();
		Thread.sleep(1000);
		EVENT1.click();
		boolean b8=img1.isDisplayed();
		System.out.println("EVENT images are displayed="+b8);
		Thread.sleep(5000);
		boolean b4=show1.isEnabled();
		System.out.println("Show button is Enabled="+b4);
		show1.click();
		Thread.sleep(5000);
		boolean b5=book1.isEnabled();
		System.out.println("Book button is Enabled="+b5);
		book1.click();
		Thread.sleep(2000);
		EVENT1.click();
		
			
	}
	
}
