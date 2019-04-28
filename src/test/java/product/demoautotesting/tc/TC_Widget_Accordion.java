package com.visionit.tc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.visionit.po.PO_Widget_Accordion;

public class TC_Widget_Accordion 
{
	WebDriver driver;
	PO_Widget_Accordion  PO_Accordion;
	
	
	@Test
	public void perform_click_actions_on_switchto() throws Exception
	{
		PO_Accordion=PageFactory.initElements(driver, PO_Widget_Accordion.class);
		PO_Accordion.click_accordion();
		PO_Accordion.CollapseReadability();
		PO_Accordion.CollapseSingleLineCode();
		PO_Accordion.CollapseMethodChaining();
		
    }
	@BeforeMethod
	public void AccordionPage()
	{
		
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Register.html");
		
	}
}
