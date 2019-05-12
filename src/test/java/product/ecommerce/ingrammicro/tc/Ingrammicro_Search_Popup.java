package product.ecommerce.ingrammicro.tc;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Ingrammicro_Search_Popup {
	WebDriver driver;
	@BeforeMethod
	public void before_method()
	{
		System.setProperty("webdriver.chrome.driver","E:\\\\_AkashStuff\\\\Automation\\\\dependencies\\\\chromedriver\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);
		driver.get("https://ca.ingrammicro.com");
	}
	@Test
	public void search_popup() throws Exception 
	{
		WebElement search_box1 =driver.findElement(By.xpath("//input[@id='searchBox_Global']"));
		search_box1.sendKeys("Apple");
		//***Search Apple Keyword**************
		List<WebElement> apple_prod_list=driver.findElements(By.xpath("//div[@id='live-search']//tr[@class='selectable']"));
		//*********Apply Assertions************************
		/* String s_title_expected= "apple_prod_lists.getText()";
 String s_title_actual="Apple_product_list displayed";
 Assert.assertEquals(s_title_expected,s_title_actual);*/
		//By Using Enhanced For Loop
		for(WebElement apple_prod_lists: apple_prod_list)
		{
			System.out.println(apple_prod_lists.getText());
		}
		WebElement search_box =driver.findElement(By.linkText("Search:"));
		search_box.click();
		//************List Of Apple_Product********************
		List<WebElement> apple_prod_list1=driver.findElements(By.xpath("//a[@class='ellipsis-multiline tooltip-clickable']"));
		List<WebElement> Arr_list= new ArrayList<WebElement>();
		System.out.println(apple_prod_list1.size());
		for(int j=0;j<apple_prod_list1.size();j++)
		{
			Arr_list.add(apple_prod_list1.get(j));
			System.out.println(apple_prod_list1.get(j).getText());
			//String s1_Actual=apple_prod_list1.get(j).getText();
			if(j==3)
				break;
		}

		//**************List Of SKU No*************
		List<WebElement> Sku_no=driver.findElements(By.xpath("//div[@class='product-information']/div/span[2]"));
		List<WebElement> Arr= new ArrayList<WebElement>();
		System.out.println(Sku_no.size());
		// By Using Enhanced For Loop

		// By using for loop
		for(int i=0;i<Sku_no.size();i++)
		{
			Arr.add(Sku_no.get(i));
			// System.out.println(Arr.get(i).getText());
			if(Arr.get(i).getText()!=null)
			{
				System.out.println("SKU_No Found:");
			}
			else
			{
				System.out.println("SKU_No Not found:");
			}
		}

		List<WebElement> checkbox =driver.findElements(By.xpath("//div[@class='prod-compare-checkbox']"));

		//List<WebElement> Arr1= new ArrayList<WebElement>();
		System.out.println(checkbox.size());
		for(int l=0;l<checkbox.size();l++)
		{
			//Arr1.add(checkbox.get(l)); 
			checkbox.get(l).click();
			if(l==3)
				break;
		}
		WebElement compare=driver.findElement(By.xpath("//div[@id='top-paging-container']//div[@class='pager-container']//div[@class='compare']"));
		compare.click();
		List<WebElement> compare_product_list =driver.findElements(By.xpath("//a[@class='tooltip-clickable']"));
		System.out.println(compare_product_list.size());
		List<WebElement>prod_list =new ArrayList<WebElement>();
		for(int k=0;k<compare_product_list.size();k++)
		{
			prod_list.add(compare_product_list.get(k));
			System.out.println(compare_product_list.get(k).getText());
 
		}
	}
}