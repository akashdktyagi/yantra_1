package com.visionit.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_Widget_Slider {
	WebDriver driver;

	public PO_Widget_Slider(WebDriver d) {
		this.driver = d;
	}
		@FindBy(how=How.LINK_TEXT,using="Slider")
		private WebElement SliderClick;
		
		@FindBy(how=How.XPATH,using="//div[@id='slider']/a[@href='#']")
		private WebElement SliderHandle;
		
		public void SetSliderFunctionality()
		{
			SliderClick.click();
			
			Actions act=new Actions(driver);
			driver.switchTo().defaultContent();
			act.moveToElement(SliderHandle).click(SliderHandle).dragAndDropBy(SliderHandle, 70, 0).build().perform();
			
			
		}
		
	

}
