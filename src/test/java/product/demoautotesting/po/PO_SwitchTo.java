package product.demoautotesting.po;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_SwitchTo 
{

	WebDriver driver;
	public PO_SwitchTo(WebDriver driver)
	{
		this.driver=driver;
	}
	@FindBy(how=How.LINK_TEXT,using="SwitchTo")
	private WebElement switchto;
	public void navigateTo_switchTo()
	{
		switchto.click();
	}
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Alerts')]")
	private WebElement alert;
	public void click_alert()
	{
		alert.click();				
	}	
	@FindBy(how=How.XPATH,using="//button[@class='btn btn-danger']")
	private WebElement alert_with_ok;
	public void click_alert_and_ok() throws Exception
	{
		alert_with_ok.click();
		Thread.sleep(500);
		Alert alert=driver.switchTo().alert();
		alert.accept();

	}

	@FindBy(how=How.XPATH,using="//a[@href='#CancelTab']")
	private WebElement alert_with_ok_cancle;
	@FindBy(how=How.XPATH,using="//button[@class='btn btn-primary']")
	private WebElement confrm_bx_btn;
	@FindBy(how=How.XPATH,using="//div[@id='CancelTab']")
	private WebElement alert_cancleTab;
	public void click_alert_ok_and_cancle() throws Exception
	{
		alert_with_ok_cancle.click();
		Thread.sleep(500);
		confrm_bx_btn.click();
		Thread.sleep(500);
		//alert_cancleTab.click(); ???????????????
		Alert alert2=driver.switchTo().alert();
		alert2.accept();

	}

	@FindBy(how=How.XPATH,using="//a[@href='#Textbox']")
	private WebElement alert_with_txt_bx_btn;
	@FindBy(how=How.XPATH,using="//button[@class='btn btn-info']")
	private WebElement prompt_bx;
	public void click_alert_with_textbx() throws Exception
	{
		alert_with_txt_bx_btn.click();
		Thread.sleep(500);
		prompt_bx.click();
		Thread.sleep(500);
		//alert_cancleTab.click(); ???????????????
		Alert alert3=driver.switchTo().alert();
		alert3.sendKeys("Sneha");
		alert3.accept();			
	}
	@FindBy(how=How.XPATH,using="//a[@href='Windows.html']")
	private WebElement windows;
	public void click_windows() throws Exception
	{
		windows.click();
	}
	@FindBy(how=How.XPATH,using="//a[@href='http://www.sakinalium.in']")
	private WebElement click_btn_open_nw_window;
	public void click_windows1() throws Exception
	{
		
		String parent=driver.getWindowHandle();
		System.out.println("parent window is : "+parent);
		click_btn_open_nw_window.click();
		Set<String> allWindows=driver.getWindowHandles();
		int count=allWindows.size();
		System.out.println("new windows count is : "+count);
		for(String child:allWindows)
		{
			if(!parent.equalsIgnoreCase(child))
			{
				driver.switchTo().window(child);
				driver.close();
			}
			driver.switchTo().window(parent);
			System.out.println("parent window title is : "+parent);
		}
		
		
		
	}
	@FindBy(how=How.XPATH,using="//a[@href='#Seperate']")
	private WebElement nw_seperate_window;
	@FindBy(how=How.XPATH,using="//button[@class='btn btn-primary']")
	private WebElement click_btn;
	public void check_windows_nw_seperate() throws Exception
	{
		nw_seperate_window.click();
		String parent2=driver.getWindowHandle();
		System.out.println("parent window is : "+parent2);
		click_btn.click();
		Set<String> allWindows2=driver.getWindowHandles();
		int count=allWindows2.size();
		System.out.println("new windows count is : "+count);
		for(String child2:allWindows2)
		{
			if(!parent2.equalsIgnoreCase(child2))
			{
				driver.switchTo().window(child2);
				driver.close();
			}
			driver.switchTo().window(parent2);
			System.out.println("parent window title is : "+parent2);
		}
	}	
	
	@FindBy(how=How.XPATH,using="//a[@href='Frames.html']")
	private WebElement frames_drpdwn;
	public void click_frames() 
	{
		frames_drpdwn.click();
	}
	
	@FindBy(how=How.XPATH,using="//iframe[@id='singleframe']")
	private WebElement switchTo_single_frame;
	@FindBy(how=How.XPATH,using="//input[@type='text']")
	private WebElement check_txtbx;
	public void check_single_frame_functionlity(String text) 
	{
		driver.switchTo().frame(switchTo_single_frame);
		check_txtbx.sendKeys(text);
	}
    
	
	
	@FindBy(how=How.XPATH,using="//a[@href='#Multiple']")
	private WebElement click_multiple_iframe_btn;
	@FindBy(how=How.XPATH,using="//iframe[@src='MultipleFrames.html']")
	private WebElement switchTo_mutiple_frame1;
	@FindBy(how=How.XPATH,using="//iframe[@src='SingleFrame.html']")
	private WebElement switchTo_multiple_frame2;
	@FindBy(how=How.XPATH,using="//input[@type='text']")
	private WebElement check_txtbx2;
	public void check_multiple_frame_functionlity(String text2) 
	{
		click_multiple_iframe_btn.click();
		
		driver.switchTo().frame(switchTo_mutiple_frame1);
		driver.switchTo().frame(switchTo_multiple_frame2);
	
			check_txtbx2.sendKeys(text2);	
		
		
	}
}
