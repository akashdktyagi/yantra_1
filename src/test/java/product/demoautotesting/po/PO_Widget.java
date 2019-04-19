package product.demoautotesting.po;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_Widget 
{
	WebDriver driver;
    public PO_Widget(WebDriver driver)
    {
    	this.driver=driver;
    }
   
    @FindBy(how=How.XPATH,using="//a[@href='Accordion.html']")
    private WebElement accordion;
    public void click_accordion()
    {
    	accordion.click();
    }
    
    @FindBy(how=How.XPATH,using="//a[@href='#collapse1']")
    private WebElement collapse1 ;
    public void click_collapse1()
    {
    	collapse1.click();
    }
    
    @FindBy(how=How.XPATH,using="//a[@href='#collapse2']")
    private WebElement collapse2 ;
    public void click_collapse2() throws Exception
    {
    	collapse2.click();
    	Thread.sleep(500);
    	collapse2.click();
    }
    
    @FindBy(how=How.XPATH,using="//a[@href='#collapse3']")
    private WebElement collapse3 ;
    public void click_collapse3()
    {
    	collapse3.click();
    }
    
    @FindBy(how=How.XPATH,using="//a[@href='Widgets.html']")
    private WebElement back_to_widget ;
    public void naviagate_back()
    {
    	back_to_widget.click();
    }
    
    @FindBy(how=How.XPATH,using="//a[@href='AutoComplete.html']")
    private WebElement autocomplete;
    public void click_autocomplete()
    {
    	
    	autocomplete.click();   	
    }
    @FindBy(how=How.XPATH,using="//input[@id='searchbox']")
    private WebElement autocomplete_functn;
    @FindBy(how=How.XPATH,using="//a[@id='ui-id-45']")
    private WebElement select_india;
    public void click_autocomplete_txtbx()
    {
    	
    	autocomplete_functn.sendKeys("India");
    	/*Actions act=new Actions(driver);
    	act.keyDown(select_india, Keys.ARROW_DOWN).build().perform();*/
    }
    
    
    @FindBy(how=How.XPATH,using="//a[@href='Datepicker.html']")
    private WebElement datepicker;
    public void click_datepicker()
    {
    	
    	datepicker.click();   	
    }
    
    @FindBy(how=How.XPATH,using="//input[@id='datepicker1']")
    private WebElement datepicker_txt_bx;
    public void click_datepicker_field()
    {
    	datepicker_txt_bx.click();   	
    }
    
    @FindBy(how=How.XPATH,using="//a[@href='Slider.html']")
    private WebElement slider;
    public void click_slider()
    {
    	
    	slider.click();   	
    }
    
    @FindBy(how=How.XPATH,using="//a[@class='ui-slider-handle ui-state-default ui-corner-all']")
    private WebElement slider_bar;
    public void move_slider()
    {
    	Actions act=new Actions(driver);
    	act.click(slider_bar).moveToElement(slider_bar, 90, 0).perform();  	
    }
    

}
