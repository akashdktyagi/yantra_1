package com.visionit.tc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.visionit.po.PO_Widgets_AutoComplete;

public class TC_Widget_AutoComplete
{
    WebDriver driver;
    
    PO_Widgets_AutoComplete PO_AutoComplete;
    
    @Test
    public void T_07_AutoComplete()
    {
    	driver.findElement(By.linkText("Widgets")).click();
    	PO_AutoComplete=PageFactory.initElements(driver,PO_Widgets_AutoComplete.class );
    	PO_AutoComplete.SetAutoCompleteFunction("in");
    	/*PO_AutoComplete.SetAutoComplete_click();
    	PO_AutoComplete.SetFrame();
    	PO_AutoComplete.SetAutoCompleteTextBox("ind");*/
    	
    	
    }
    @BeforeMethod
    public void AutocompletePage()
    {
    	driver=new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
}
