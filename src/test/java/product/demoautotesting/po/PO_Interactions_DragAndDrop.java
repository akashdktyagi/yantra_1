package com.visionit.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_Interactions_DragAndDrop {

	WebDriver driver;

	public PO_Interactions_DragAndDrop(WebDriver d)
	{
		this.driver=d;
	}
	//locators for static
	@FindBy(how=How.XPATH,using="//a[@href='Interactions.html']")
	private WebElement Interactions_click;

	@FindBy(how=How.LINK_TEXT,using="Drag and Drop")
	private WebElement Drag_Drop_click;

	@FindBy(how=How.XPATH,using="//a[@href='Static.html'] ")
	private WebElement Static_click;

	@FindBy(how=How.XPATH,using="//img[@style='width: 120px;heigh:120px !important;margin-bottom: 30px']")
	private WebElement DragLogoImg;

	@FindBy(how=How.XPATH,using="//img[@style='width: 120px;heigh:120px;margin-bottom: 30px']")
	private WebElement DragOriginalImg;

	@FindBy(how=How.XPATH,using="//img[@style='width: 120px;heigh:120px']")
	private WebElement DragseleniumImg;

	@FindBy(how=How.XPATH,using="//div/p")
	private WebElement DropArea;

	//Locators for dynamic
	@FindBy(how=How.XPATH,using="//a[@href='Dynamic.html'] ")
	private WebElement Dynamic_click;

	@FindBy(how=How.XPATH,using="//img[@src='logo.png']")
	private WebElement DragLogoImg1;

	@FindBy(how=How.XPATH,using="//img[@src='original.png']")
	private WebElement DragOriginalImg2;

	@FindBy(how=How.XPATH,using="//img[@src='selenium.png']")
	private WebElement DragseleniumImg3;

    //declare methods for static
	public void StaticDragAndDrop() throws Exception
	{
		Interactions_click.click();

		Drag_Drop_click.click();

		Static_click.click();
		driver.switchTo().defaultContent();
		Actions Static=new Actions(driver);
		Static.dragAndDrop(DragLogoImg, DropArea).perform();
		Thread.sleep(1000);
		Static.dragAndDrop(DragOriginalImg, DropArea).perform();
		Thread.sleep(1000);
		Static.dragAndDrop(DragseleniumImg, DropArea).perform();
		Thread.sleep(1000);


		driver.switchTo().defaultContent();
	}	
	//for dynamic
	public void DynamicDragAndDrop() throws Exception
	{
		Interactions_click.click();
		Drag_Drop_click.click();
		Dynamic_click.click();

		Actions Dynamic=new Actions(driver);driver.switchTo().defaultContent();
		Dynamic.clickAndHold(DragLogoImg1).moveToElement(DragLogoImg1).release(DropArea).build().perform();
		Thread.sleep(1000);
		Dynamic.dragAndDrop(DragOriginalImg2, DropArea).perform();
		Thread.sleep(1000);
		Dynamic.dragAndDrop(DragseleniumImg3, DropArea).perform();
		Thread.sleep(1000);



	}

}
