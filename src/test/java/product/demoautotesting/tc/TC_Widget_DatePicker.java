package com.visionit.tc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.visionit.po.PO_Widget_DatePicker;

public class TC_Widget_DatePicker
{
   WebDriver driver;
   PO_Widget_DatePicker PO_DatePicker;
   
   
   
   @Test
   public void TC_08_DatePicker() throws Exception
   {
	   
	   PO_DatePicker=PageFactory.initElements(driver,PO_Widget_DatePicker.class );
	   PO_DatePicker.SetDatePickerDisabled();
	   PO_DatePicker.SetDatePickerEnabledMonth("May");
	   PO_DatePicker.SetDatePickerYear("2009");
	   PO_DatePicker.SetDate();
	   
   }
   
   @BeforeMethod
   public void DatePickerPage()
   
   {
	driver=new FirefoxDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 driver.findElement(By.linkText("Widgets")).click();
   }
}

