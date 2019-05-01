package product.demoautotesting.tc;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TC_Register 
{
	 WebDriver driver;

	
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
	public void registration()
	{
		register=PageFactory.initElements(driver, PO_Register.class);
		register.enter_first_name("Sneha");
		register.enter_last_name("Funde");
		register.enter_address("warje,pune");
		register.enter_email_add("snehafunde7@gmail.com");
		register.enter_phone_no("7262816854");
		register.click_radio_btn();
		register.click_check_bx_cricket();
		register.click_check_bx_hocky();
		register.click_check_bx_movie();
		register.select_language();
		//register.set_skills("Android");
		register.set_country("India");
		register.set_select_country("New Zealand");//bug
		register.set_select_year("1992");
		register.set_select_month("June");
		register.set_select_date("10");
		register.set_select_password1("Sneha123*");
		register.set_select_password2("Sneha123*");
		register.set_choose_file();
		//register.set_submit();
		
	}

}
