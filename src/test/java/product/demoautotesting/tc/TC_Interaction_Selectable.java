package com.visionit.tc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.visionit.po.PO_Interactions_Selectable;

public class TC_Interaction_Selectable 
{
   WebDriver driver;
   PO_Interactions_Selectable PO_Selectable;
	
	@Test
	public void TC_11_Interactions_Selectable()
	
	{
		PO_Selectable=PageFactory.initElements(driver,PO_Interactions_Selectable.class );
		PO_Selectable.SelectDefaultFunc();
		PO_Selectable.SelectSerializafunc();
	}
	
	
	@BeforeMethod
	   public void SelectablePage()
	   
	   {
		driver=new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.findElement(By.linkText("Interactions")).click();
	   }
}
