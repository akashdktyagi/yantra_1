package com.visionit.po;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;


public class PO_Widgets_AutoComplete 
{
	WebDriver driver;

	public  PO_Widgets_AutoComplete (WebDriver d)
	{
		this.driver=d;
	}
	@FindBy(how=How.LINK_TEXT,using="AutoComplete")
	private WebElement AutoComplete_click;
	
	/*@FindBy(how=How.XPATH,using="//div[@class='container']")
	private WebElement Frame;*/
	
	@FindBy(how=How.ID,using="searchbox")
	private WebElement AutoCompleteTextBox;
	
	
	public void SetAutoCompleteFunction(String key)
	{
		
		AutoComplete_click.click();
		AutoCompleteTextBox.sendKeys(key);
		
		
		List<WebElement> li= driver.findElements(By.className("ui-menu-item"));
		for(WebElement list :li)
		   {

		   if(list.getText().equals("India"))
		   {
		   list.click();
		   }
		   
		   } 
		
	}
}	
	/*public void SetFrame()
	{
		driver.switchTo().frame(Frame);
		System.out.println("Switch to frame");
	}
	public void SetAutoCompleteTextBox(String key)
	{
		//driver.switchTo().frame(0);
		AutoCompleteTextBox.sendKeys(key);*/
		
	
	

