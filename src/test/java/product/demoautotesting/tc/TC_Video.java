package product.demoautotesting.tc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.visionit.po.PO_Video;

public class TC_Video
{
	WebDriver driver;
	PO_Video video=new PO_Video(driver);
	
	@BeforeTest
	public void open_url()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Webdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");		
	}

	/*@Test
	public void you_tube_functionality() throws Exception
	{
		video=PageFactory.initElements(driver, PO_Video.class);
		video.click_video_link();
		video.click_video_drpdwn();
		video.click_play_button();
	}*/
	
	@Test
	public void you_tube_new_window()
	{
		video=PageFactory.initElements(driver, PO_Video.class);
		video.click_video_link();
		video.click_video_drpdwn();
		video.open_new_window();
	}


}
