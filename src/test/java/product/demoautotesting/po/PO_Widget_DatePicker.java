package com.visionit.po;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class PO_Widget_DatePicker 
{
	WebDriver driver;
	public  PO_Widget_DatePicker (WebDriver d)
	{
		this.driver=d;
	}
    //Locators for Disabled
	@FindBy(how=How.LINK_TEXT,using="Datepicker")
	private WebElement DatePickerClick;

	@FindBy(how=How.XPATH,using="//div[@class='col-xs-1']")
	private WebElement DatePickerDisabledClick;

	@FindBy(how=How.XPATH,using="//div[@class='ui-datepicker-title']")
	private WebElement CurrMonth;

	@FindBy(how=How.XPATH,using="//span[@class='ui-icon ui-icon-circle-triangle-e']")
	private WebElement NextButton;

	@FindBy(how=How.XPATH,using="//tr/td/a[text()='30']")
	private WebElement SelectDate;
	
    public void SetDatePickerDisabled() throws Exception
	{
		DatePickerClick.click();
		DatePickerDisabledClick.click();

		String ExpMonth="September 2019";
		String currentMonth=CurrMonth.getText();

		if(ExpMonth.equals(currentMonth))
		{
			System.out.println("Month is already selected");

		}
		else
		{
			for(int i=0;i<5;i++)
			{
				NextButton.click();
				Thread.sleep(1000);
				currentMonth=CurrMonth.getText();
				if(ExpMonth.equals(currentMonth))
				{
					System.out.println("month selected");
					break;
				}
			}

		}
		Thread.sleep(1000);
		Actions act=new Actions(driver);
		act.moveToElement(SelectDate).click(SelectDate).build().perform();

	}
	//Locators for Enabled
		@FindBy(how=How.ID,using="datepicker2")
		private WebElement datepicker2Click;
		
		@FindBy(how= How.XPATH,using="//select[@title='Change the month']")
		private WebElement SelectMonth;
		
		@FindBy(how=How.XPATH,using="//select[@title='Change the year']")
		private WebElement SelectYear;
		
		@FindBy(how=How.XPATH,using="//select[@class='datepick-month-year']")
        private WebElement OptionSelect;
		
		@FindBy(how=How.LINK_TEXT,using="5")
		private WebElement Select_Date;
        
		public void SetDatePickerEnabledMonth(String month)
		{
			datepicker2Click.click();
			Select mon=new Select(SelectMonth);
			mon.selectByVisibleText(month);
		}
		public void SetDatePickerYear(String year)
		{
			SelectYear.click();
			Select yr=new Select( SelectYear);
			yr.selectByVisibleText(year);
		}
		public void SetDate()
		{
			Select_Date.click();
		}

}
