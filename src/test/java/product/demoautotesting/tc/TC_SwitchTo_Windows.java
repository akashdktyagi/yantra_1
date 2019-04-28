package com.visionit.tc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.visionit.po.PO_SwitchTo_Alerts;
import com.visionit.po.PO_SwitchTo_Windows;

public class TC_SwitchTo_Windows 
{
	WebDriver driver;
	PO_SwitchTo_Windows PO_windows;
    @Test
	public void TC_04_SwitchToWindows()
	{
    	PO_windows=PageFactory.initElements(driver,PO_SwitchTo_Windows.class);
		PO_windows.ClickOnWindows();
		PO_windows.SetNewTabClick();
		PO_windows.SetOpenNewSeperateWindow();
		PO_windows.SetNewSeperateWindowClick();
		PO_windows.SetOpenSeperateMultipleWindows();
		PO_windows.SetOpenMultipleWindowClick();
	}
	@BeforeMethod
	public void WindowsPage()
	{	
		driver=new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void afterMethod()
	{
		//driver.quit();

	}

}
