package com.visionit.tc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.visionit.po.PO_SwitchTo_Frames;

public class TC_SwitchTo_Frames 
{
	WebDriver driver;

	PO_SwitchTo_Frames PO_frame;

	@Test
	public void T_05_Frames() throws Exception 
	{
		driver.findElement(By.linkText("SwitchTo")).click();
		driver.findElement(By.linkText("Frames")).click();
		PO_frame=PageFactory.initElements(driver,PO_SwitchTo_Frames.class);
		
		/*PO_frame.SetSingleIframeclick();
		PO_frame.SetSingleIframe();
		PO_frame.SetTextBox("visionIT");
		/*PO_frame.SetMultipleIframeclick();
		PO_frame.SetOuterFrame();
		PO_frame.SetInnerFrame();
		PO_frame.SetInnerTextBox("Rajveer");	*/
		PO_frame.SetSingleFrameFunctionality("raj");
		Thread.sleep(1000);
		PO_frame.SetMultipleFrameFunctionlity("veer");
		
	}
	
	@BeforeMethod
	public void FramesPage()
	{	
		driver=new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

}
