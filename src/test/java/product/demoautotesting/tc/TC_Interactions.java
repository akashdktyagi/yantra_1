package product.demoautotesting.tc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.visionit.po.PO_Interactions;

public class TC_Interactions 
{
	static WebDriver driver;
	PO_Interactions interactions=new PO_Interactions(driver);
	
	@BeforeMethod
	public void open_url()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Webdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Register.html");
	}
	
	@Test
	public void Interactions_Drag_and_Drop_Static()
	{
		interactions=PageFactory.initElements(driver, PO_Interactions.class);
		interactions.Interaction_link();
		interactions.Drag_and_Drop();
		interactions.Static_Drag_and_Drop();
		interactions.Dragging_elements();
	}
	@Test
	public void Interactions_Resizable()
	{
		interactions=PageFactory.initElements(driver, PO_Interactions.class);
		interactions.Interaction_link();
		interactions.Resizable();
		interactions.Resizable_field();
	}
	
	@Test
	public void Interactions_Selectable()
	{
		interactions=PageFactory.initElements(driver, PO_Interactions.class);
		interactions.Interaction_link();
		interactions.Selectable();
		interactions.Select_anyOf_default();
		interactions.Serialize();
		interactions.Select_anyOf_Serialize();
		
	}

}
