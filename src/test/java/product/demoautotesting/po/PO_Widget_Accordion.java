package com.visionit.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_Widget_Accordion 
{
	WebDriver driver;
	
    public PO_Widget_Accordion (WebDriver driver)
    {
    	this.driver=driver;
    }
    @FindBy(how=How.XPATH,using="//a[@href='Widgets.html']")
    private WebElement Widget_click;
   
    @FindBy(how=How.XPATH,using="//a[@href='Accordion.html']")
    private WebElement accordion;
    @FindBy(how=How.XPATH,using="//a[@href='#collapse1']")
    private WebElement Collapse_Readability ;
    @FindBy(how=How.XPATH,using="//a[@href='#collapse2']")
    private WebElement Collapse_SingleLineCode ;
    @FindBy(how=How.XPATH,using="//a[@href='#collapse3']")
    private WebElement Collapse_MethodChaining ;
    
    
    public void click_accordion()
    {
    	Widget_click.click();
    	accordion.click();
    }
    
    
    public void CollapseReadability()
    {
    	Collapse_Readability.click();
    }
   
    public void CollapseSingleLineCode() throws Exception
    {
    	Collapse_SingleLineCode.click();
    	Thread.sleep(1000);
    	Collapse_SingleLineCode.click();
    }
    
     public void CollapseMethodChaining() throws Exception
    {
    	Collapse_MethodChaining.click();
    	Thread.sleep(1000);
    	Collapse_MethodChaining.click();
    }
    
    
    
}
