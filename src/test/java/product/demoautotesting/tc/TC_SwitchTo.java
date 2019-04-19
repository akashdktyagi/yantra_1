package product.demoautotesting.tc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.visionit.po.PO_Register;
import com.visionit.po.PO_SwitchTo;

public class TC_SwitchTo 
{
	static WebDriver driver;
	PO_SwitchTo switchTo=new PO_SwitchTo(driver);
	
	@BeforeMethod
	public void open_url()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Webdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Register.html");
		//driver.findElement(By.linkText("SwitchTo")).click();
	}
	@Test
	public void perform_click_actions_on_switchto() throws Exception
	{
		switchTo=PageFactory.initElements(driver, PO_SwitchTo.class);
		switchTo.navigateTo_switchTo();
		switchTo.click_alert();
		switchTo.click_alert_and_ok();
		switchTo.click_alert_ok_and_cancle();
		switchTo.click_alert_with_textbx();
		switchTo.navigateTo_switchTo();
		switchTo.click_windows();
		switchTo.click_windows1();
		switchTo.check_windows_nw_seperate();
		switchTo.click_frames();
		switchTo.check_single_frame_functionlity("automation");
		switchTo.check_multiple_frame_functionlity("testing");
		
	}	

}
