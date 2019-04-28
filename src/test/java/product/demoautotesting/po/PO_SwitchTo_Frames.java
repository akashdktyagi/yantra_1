package com.visionit.po;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PO_SwitchTo_Frames 
{
	WebDriver driver;

	public PO_SwitchTo_Frames (WebDriver d)
	{
		this.driver=d;
	}
	@FindBy(how=How.XPATH,using="//a[@href='#Single']")
	private WebElement SingleiFrameClick;
    
	@FindBy(how=How.XPATH,using="//iframe[@src='SingleFrame.html']")
	private WebElement SingleIFrame;

	@FindBy(how=How.XPATH,using="//input[@type='text']")
	private WebElement textBox;  

	@FindBy(how=How.XPATH,using="//a[text()='Iframe with in an Iframe']")
	private WebElement MultipleiFrameClick;

	@FindBy(how=How.XPATH,using="//iframe[@src='MultipleFrames.html']")
	private WebElement OuterFrame;

	@FindBy(how=How.XPATH,using="//iframe[@src='SingleFrame.html']")
	private WebElement InnerFrame;


	@FindBy(how=How.XPATH,using="//input[@type='text']")
	private WebElement InnerFrameTextBox;

	public void SetSingleFrameFunctionality(String text1)
	{
		SingleiFrameClick.click();
		driver.switchTo().frame(SingleIFrame);
		System.out.println("***Switch to the Frame***");
		textBox.sendKeys(text1);
		
	}
	
	public void SetMultipleFrameFunctionlity(String text2)
	{
		driver.switchTo().defaultContent();
		MultipleiFrameClick.click();
		driver.switchTo().frame(OuterFrame);
		driver.switchTo().frame(InnerFrame);
		InnerFrameTextBox.sendKeys(text2);
		
	}

	
}
