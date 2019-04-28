package com.visionit.po;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_SwitchTo_Alerts 
{
	WebDriver driver;
	public PO_SwitchTo_Alerts(WebDriver d)
	{
		this.driver=d;
	}
	//Alert handling locators
	@FindBy(how=How.XPATH,using="//a[@href='SwitchTo.html']")
	private WebElement SwitchTo_Click;
	
	@FindBy(how=How.LINK_TEXT,using="Alerts")
	private WebElement SwitchTo_alert;

	@FindBy(how=How.XPATH,using="//a[text()='Alert with OK ']")
	private WebElement ClickAlertOk ;

	@FindBy(how=How.XPATH,using="//button[@class='btn btn-danger']")
	private WebElement DisplayAlertBox;

	@FindBy(how=How.XPATH,using="//a[text()='Alert with OK & Cancel ']")
	private WebElement AlertOK;

	@FindBy(how=How.XPATH,using="//button[@onclick='confirmbox()']")
	private WebElement ConfirmBox;

	@FindBy(how=How.XPATH,using="//a[text()='Alert with Textbox ']")
	private WebElement AlertTextBox;

	@FindBy(how=How.XPATH,using="//button[@onclick='promptbox()']")
	private WebElement PromptBox;

	@FindBy(how=How.XPATH,using="//p[@id='demo1']")
	private WebElement Displaymsg;


	//Alert handling methods
	
	public void SetSwitchToAlert()
	{
		SwitchTo_Click.click();
		SwitchTo_alert.click();
	}
	public void SetClickOnAlertOk()
	{
		ClickAlertOk.click();

	}
	public void SetDisplayAlertbox()
	{
		DisplayAlertBox.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
	}

	public void SetAlertOK()
	{
		AlertOK.click();
	}
	public void SetConfirmBox()
	{
		ConfirmBox.click();
		Alert alert=driver.switchTo().alert();
		alert.dismiss();
	}
	public void SetAlertTextBox()
	{
		AlertTextBox.click();
	}
	public void SetClickPromptBox(String name)
	{
		PromptBox.click();
		Alert alert=driver.switchTo().alert();
		alert.sendKeys(name);
		System.out.println(alert.getText());

		alert.accept();
	}
	public void SetDisplayMsg()
	{
		System.out.println(Displaymsg.getText());
	}




}
