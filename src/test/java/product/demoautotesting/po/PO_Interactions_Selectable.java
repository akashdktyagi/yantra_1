package com.visionit.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_Interactions_Selectable 
{
	WebDriver driver;

	public PO_Interactions_Selectable(WebDriver d)
	{
		this.driver = d;
	}
	//Locators for DefaultFunctionality
	@FindBy(how=How.XPATH,using="//a[@href='Selectable.html']")
	private WebElement SelectableClick;
	
	@FindBy(how=How.XPATH,using="//b[text()='Sakinalium - Readability']")
	private WebElement DefaultFuncReadab;
	
	@FindBy(how=How.XPATH,using="//b[text()='Sakinalium - Data Driven Testing']")
	private WebElement DefaultFunctDDT;
	
	//Method of defaultFunct
	public void SelectDefaultFunc()
	{
		SelectableClick.click();
		Actions sel=new Actions(driver);
		sel.click(DefaultFuncReadab).click(DefaultFunctDDT).build().perform();
	}
	
	//Locators for serialize
	@FindBy(how=How.XPATH,using="//a[@href='#Serialize']")
	private WebElement serialize_click;
	
	@FindBy(how=How.XPATH,using="//b[text()='Sakinalium - Readability']")
	private WebElement Readability;
	@FindBy(how=How.XPATH,using="//b[text()='Sakinalium - Single Line Coding']")
	private WebElement  Single_Line_Coding;
	@FindBy(how=How.XPATH,using="//b[text()='Sakinalium - Method Chaining']")
	private WebElement  Method_Chaining;
	@FindBy(how=How.XPATH,using="//b[text()='Sakinalium - Cross Browser Testing']")
	private WebElement Cross_Browser_Testing;
	@FindBy(how=How.XPATH,using="//b[text()='Sakinalium - Extent Reports']")
	private WebElement Extent_Reports;
	@FindBy(how=How.XPATH,using="//b[text()='Sakinalium - Data Driven Testing']")
	private WebElement Data_Driven_Testing;
	@FindBy(how=How.XPATH,using="//b[text()='Sakinalium - Functional Testing']")
	private WebElement Functional_Testing;
	
	
	
	public void SelectSerializafunc()
	{   
		serialize_click.click();
		driver.switchTo().defaultContent();
		Readability.click();
		/*driver.switchTo().defaultContent();
		Actions sel=new Actions(driver);
		
		sel.click(Readability);*/
		
	}
	
}
