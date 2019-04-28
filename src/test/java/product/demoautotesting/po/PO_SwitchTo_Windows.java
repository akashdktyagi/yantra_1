package com.visionit.po;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_SwitchTo_Windows 
{
	WebDriver driver;
	public PO_SwitchTo_Windows(WebDriver d)
	{
		this.driver=d;
	}
	//Window handling locators
	@FindBy(how=How.XPATH,using="//a[@href='SwitchTo.html']")
	private WebElement SwitchTo_Click;

	@FindBy(how=How.LINK_TEXT,using="Windows")
	private WebElement SwitchTo_Windows;

	@FindBy(how=How.XPATH,using="//a[@href='http://www.sakinalium.in']/button")
	private WebElement Button_click;

	@FindBy(how=How.XPATH,using="//a[@href='#Seperate']")
	private WebElement NewSeperateWindow;

	@FindBy(how=How.XPATH,using="//button[@onclick='newwindow()']")
	private WebElement NewWindowClick;

	@FindBy(how=How.XPATH,using="//a[@href='#Multiple']")
	private WebElement OpenSeperateMultipleWindow;

	@FindBy(how=How.XPATH,using="//button[@onclick='multiwindow()']")
	private WebElement NewMultipleWindowClick;

	//Windows handling methods

	public void ClickOnWindows()
	{
		SwitchTo_Click.click();
		SwitchTo_Windows.click();
	}
	public void SetNewTabClick()
	{

		Button_click.click();
		ArrayList<String>tabs=new ArrayList<String>(driver.getWindowHandles());
		System.out.println(tabs.size());
		driver.switchTo().window(tabs.get(1));
		driver.close();
		driver.switchTo().window(tabs.get(0));
	}
	public void SetOpenNewSeperateWindow()
	{
		NewSeperateWindow.click();
	}
	public void SetNewSeperateWindowClick()
	{
		NewWindowClick.click();
		ArrayList<String>tabs=new ArrayList<String>(driver.getWindowHandles());
		System.out.println(tabs.size());
		driver.switchTo().window(tabs.get(1));
		driver.close();
		driver.switchTo().window(tabs.get(0));
	}

	public void SetOpenSeperateMultipleWindows()
	{
		OpenSeperateMultipleWindow.click();
	}
	public void SetOpenMultipleWindowClick()
	{
		NewMultipleWindowClick.click();
		ArrayList<String>tabs=new ArrayList<String>(driver.getWindowHandles());
		System.out.println(tabs.size());
		driver.switchTo().window(tabs.get(1));
		
		driver.close();
		
		driver.close();
		driver.switchTo().window(tabs.get(0));
	}

}




