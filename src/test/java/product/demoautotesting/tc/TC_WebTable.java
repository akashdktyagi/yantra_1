package product.demoautotesting.tc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.visionit.po.PO_WebTable;

public class TC_WebTable 
{
	static WebDriver driver;
	PO_WebTable web_table=new PO_WebTable(driver);
	
	@BeforeMethod
	public void open_url()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Webdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//a[@href='WebTable.html']")).click();
	}
	
	@Test
	public void click_edit_button() throws InterruptedException
	{
		web_table=PageFactory.initElements(driver, PO_WebTable.class);
		Thread.sleep(3000);
		web_table.edit_btn_1();
	}

}
