package product.demoautotesting.tc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.visionit.po.PO_SwitchTo;
import com.visionit.po.PO_Widget;

public class TC_Widget 
{

	static WebDriver driver;
	PO_Widget widget=new PO_Widget(driver);
	
	@BeforeMethod
	public void open_url()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Webdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.findElement(By.linkText("Widgets")).click();
	}
	@Test
	public void perform_click_actions_on_switchto() throws Exception
	{
		widget=PageFactory.initElements(driver, PO_Widget.class);
		widget.click_accordion();
		widget.click_collapse1();
		widget.click_collapse2();
		widget.click_collapse3();
		widget.naviagate_back();
		widget.click_autocomplete();
		widget.click_autocomplete_txtbx();
		widget.naviagate_back();
		widget.click_datepicker();
		widget.click_datepicker_field();
		widget.click_slider();
		widget.move_slider();
	}	


}
