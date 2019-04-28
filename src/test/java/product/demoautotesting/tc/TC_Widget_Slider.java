package com.visionit.tc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.visionit.po.PO_Widget_Slider;

public class TC_Widget_Slider
{
  WebDriver driver;
  PO_Widget_Slider PO_slider;
  
  @Test
  public void T_09_slider() throws Exception
  {
	  driver.findElement(By.linkText("Widgets")).click();
	  PO_slider=PageFactory.initElements(driver, PO_Widget_Slider.class);
	  PO_slider.SetSliderFunctionality();  
	  Thread.sleep(1000);
  }
  @BeforeMethod
  public void SliderPage()
  {
	  driver=new FirefoxDriver();
	  driver.get("http://demo.automationtesting.in/Register.html");
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
  
}
