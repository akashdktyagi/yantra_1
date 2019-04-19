package product.demoautotesting.po;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_Video 
{
	WebDriver driver;
	public PO_Video(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Video")
	private WebElement click_video;
	public void click_video_link()
	{
		click_video.click();
	}
	
	@FindBy(how=How.XPATH,using="//a[@href='Youtube.html']")
	private WebElement click_vdo_drpdwn;
	public void click_video_drpdwn()
	{
		click_vdo_drpdwn.click();
	}

	@FindBy(how=How.XPATH,using="//button[@class='ytp-large-play-button ytp-button']")
	private WebElement click_play_btn;
	@FindBy(how=How.XPATH,using="//div[@class='col-xs-9 col-xs-offset-3']/iframe")
	private WebElement frame1;
	@FindBy(how=How.XPATH,using="//button[@class='ytp-play-button ytp-button']")
	private WebElement click_pause_btn;
	@FindBy(how=How.XPATH,using="//div[@class='ytp-scrubber-container']")
	private WebElement pause_ele;
	@FindBy(how=How.XPATH,using="//button[@class='ytp-mute-button ytp-button']")
	private WebElement mute;
	public void click_play_button() throws Exception
	{
	    driver.switchTo().frame(frame1);
		click_play_btn.click();
		Thread.sleep(30000);
		click_pause_btn.click();
		Thread.sleep(1000);
		click_pause_btn.click();
		mute.click();
		Thread.sleep(35000);
		mute.click();
		Thread.sleep(1000);
		click_pause_btn.click();
	}
	
	@FindBy(how=How.XPATH,using="//a[@class='ytp-title-link yt-uix-sessionlink']")
	private WebElement new_window;
	public void open_new_window() 
	{
		driver.switchTo().frame(frame1);
		new_window.click();
		String parent=driver.getWindowHandle();
		Set<String> s1=driver.getWindowHandles();
		Iterator<String> i=s1.iterator();
		while(i.hasNext())
		{
			String child_window=i.next();
			if(!parent.equals(child_window)) 
			{
			driver.switchTo().window(child_window);
			System.out.println(driver.switchTo().window(child_window).getTitle());
			driver.close();
			}
		}
		driver.switchTo().window(parent);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
