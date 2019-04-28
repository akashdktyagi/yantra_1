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

public class TC_SwitchTo_Alerts
{
    WebDriver driver;
    PO_SwitchTo_Alerts PO_Alert;
    @Test
  public void TC_03_SwitchToAlert() throws Exception
	
  {
 
  		PO_Alert=PageFactory.initElements(driver,PO_SwitchTo_Alerts.class);
  		PO_Alert.SetSwitchToAlert();
  		PO_Alert.SetClickOnAlertOk();
  		PO_Alert.SetDisplayAlertbox();
  		Thread.sleep(2000);
  		PO_Alert.SetAlertOK();
  		PO_Alert.SetConfirmBox();
  		Thread.sleep(2000);
  		PO_Alert.SetAlertTextBox();
  		Thread.sleep(2000);
  		PO_Alert.SetClickPromptBox("Rajveer");
  		Thread.sleep(2000);
  		PO_Alert.SetDisplayMsg();
  }
  @BeforeMethod
	public void AlertPage()
	{	
		driver=new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}

	
}
