package com.visionit.tc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.visionit.po.PO_Interactions_DragAndDrop;

public class TC_Interactions_DragAndDrop 
{
	WebDriver driver;
	PO_Interactions_DragAndDrop  PO_DragAndDrop;

	@Test
	public void TC_10_Interactions_DragAndDrop () throws Exception
	{
		
	
		PO_DragAndDrop=PageFactory.initElements(driver,PO_Interactions_DragAndDrop.class);
		PO_DragAndDrop.StaticDragAndDrop();
		PO_DragAndDrop.DynamicDragAndDrop();
	}
	
	@BeforeMethod
	public void DragAndDropPage()

	{
		driver=new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}

}
