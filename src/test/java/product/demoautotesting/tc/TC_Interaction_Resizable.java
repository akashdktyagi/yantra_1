package com.visionit.tc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.visionit.po.PO_Interactions_Resizable;

public class TC_Interaction_Resizable 
{
   WebDriver driver;
   PO_Interactions_Resizable PO_Resizable;
   
   @Test
   public void TC_12_Resizable()
   {
	   PO_Resizable=PageFactory.initElements(driver, PO_Interactions_Resizable.class);
	   PO_Resizable.SetResizable();
   }
   
@BeforeMethod
public void ResizablePage()
{
	driver=new FirefoxDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
}
}
