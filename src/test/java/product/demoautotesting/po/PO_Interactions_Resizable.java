package com.visionit.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_Interactions_Resizable 
{
	WebDriver driver;
	public PO_Interactions_Resizable( WebDriver  d)
	{
		this.driver=d;
	}
	@FindBy(how=How.XPATH,using="//a[@href='Interactions.html']")
	private WebElement Interactions_click;
	
	@FindBy(how=How.LINK_TEXT,using="Resizable")
	private WebElement ResizableClick;
	
	@FindBy(how=How.XPATH,using="//div[@style='border:1px solid black;height:300px']/div/div[1]")
	private WebElement Resizable;
	
	
	public void SetResizable()
	{
		Interactions_click.click();
		ResizableClick.click();
		Actions resize=new Actions(driver);
		driver.switchTo().defaultContent();   //switching the frame
	    resize.clickAndHold(Resizable).moveByOffset(200,50).release(Resizable).build().perform();
	}
}
