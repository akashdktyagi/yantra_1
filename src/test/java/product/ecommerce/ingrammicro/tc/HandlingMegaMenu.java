package product.ecommerce.ingrammicro.tc;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import product.demoautotesting.tc.TestingLog4J;

public class HandlingMegaMenu {
	private static final Logger LOG = LogManager.getLogger(HandlingMegaMenu.class);

	//@Test
	public void ValidateSearch() {
		
		try {
			String PRODUCT = "HP";
			
			//Browser Set Up and navigate
			System.setProperty("webdriver.chrome.driver", "E:\\_AkashStuff\\Automation\\dependencies\\chromedriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://ca.ingrammicro.com/");//difference btw and naviogate/get
			
			//Checkpoint
			String expected_title = "Computer and Technology Products - Services for Business to Business Needs - Ingram Micro";
			String actual_title = driver.getTitle();
			Assert.assertEquals(actual_title, expected_title, "Title is correct");
			

			//Search for item
			WebElement txtbx_search = driver.findElement(By.id("searchBox_Global"));
			txtbx_search.sendKeys(PRODUCT);
			
			driver.findElement(By.id("search-submit-anchor")).click();
			
			//Check point
			expected_title = "Product Search";
			actual_title = driver.getTitle();
			Assert.assertEquals(actual_title, expected_title, "Product search Title is correct");
			
			
			//a[contains(@rel,'#product-title-' )]
			
			//Fetch all the links Title
			List<WebElement> collection_product_links = 
					driver.findElements(By.xpath("//a[contains(@rel,'#product-title-')]"));
			
			
			for(int i = 0; i<collection_product_links.size();i++) {
				String temp = collection_product_links.get(i).getText();
				
				//(temp.toLowerCase().contains(PRODUCT.toLowerCase()))/
				
				if (temp.contains(PRODUCT)){
					Assert.assertTrue(true, PRODUCT +" is displayed on product title Product Title: " + temp);
				}else {
					Assert.assertTrue(false, PRODUCT + " is not displayed on product title Product Title: " + temp);
		
				}
				
			}
			////div[@class = 'prod-number-container vpn_breakword']/span[2]/
		}catch(Exception e) {
			Assert.assertFalse(false, "Exception thrown. Exception: " + e.toString());;	
		}

		

		
		
	}
	
	//@Test
	public void AutomateMegaMenuStucture_ForLoop() throws InterruptedException {
		//try {

			String category = "Software";
			String sub_category = "Computer Cables";
			String vendor = "Apple";

			LOG.info("========>Execution Triggered=========");

			System.setProperty("webdriver.chrome.driver", "E:\\_AkashStuff\\Automation\\dependencies\\chromedriver\\chromedriver.exe");

			//1. Invoke Browser
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			LOG.info("Chrome Browser Invoked");

			//2. Navigate to URl
			driver.get("https://ca.ingrammicro.com/");
			LOG.info("Navigated to URl: https://ca.ingrammicro.com/ ");

			//3. Click on the Product Link
			driver.findElement(By.id("product-activate")).click();
			LOG.info("Clicked on Product link");

			//4. Check if Category Block is displayed
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("products-menu-container")));
			LOG.info("Clicked on Product link");

			//5. Get list of all the links
			List<WebElement> primary_menu_links = driver.findElements(By.xpath("//ul[@id = 'primary-menu-links']/li/a"));
			LOG.info("Fetched all the primary links");

			//6. Hover on the link provided by the user
			for(WebElement product_link:primary_menu_links) {
				if (product_link.getText().contains(category) ) {					
					
					Actions action = new Actions(driver);
					action.moveToElement(product_link).perform();
					LOG.info("Hovered on product: " + category);
					break;
				}
			}//end for

			//6. Check secondary menu is displayed
			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("secondary-menu")));
			LOG.info("Wait for Sub category pop up complete.");

			//7. Get List of all the links in secondary menu
			List<WebElement> secondry_menu_links = driver.findElements(By.xpath("//div[@id = 'secondary-menu']//li/a"));
			//Hover on the link
			for(WebElement sub_category_link:secondry_menu_links) {
				if (sub_category_link.getText().contains(sub_category) ) {
					//product_link.click();
					Actions action = new Actions(driver);
					action.moveToElement(sub_category_link).perform();
					LOG.info("Hovered on sub category: " + sub_category);
					break;
				}
			}//end for

			//8. Check tertiary menu is displayed
			WebDriverWait wait2 = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("products-vendor-menu")));
			LOG.info("Wait for vendor pop up complete.");

			//Get List of all the links in secondary menu
			List<WebElement> tertiary_menu_links = driver.findElements(By.xpath("//div[@id = 'products-vendor-menu']//li/a"));
			//Hover on the link
			for(WebElement vendor_link:tertiary_menu_links) {
				if (vendor_link.getText().contains(vendor) ) {
					vendor_link.click();
					LOG.info("Clicked on Vendor: " + vendor);
					break;
				}
			}//end for
			LOG.info("========>Execution Completed=========");
	//	}catch(Exception e) {
			//LOG.fatal("Exception Caught : " +  e.getStackTrace());
			//e.printStackTrace();
	//	}
	}
	
	@Test
	public void AutomateMegaMenuStucture_UsingXPATH() {
		try {


			String category = "Cables";
			String sub_category = "Computer Cables";
			String vendor = "Apple";

			LOG.info("========>Execution Triggered=========");

			System.setProperty("webdriver.chrome.driver", "E:\\_AkashStuff\\Automation\\dependencies\\chromedriver\\chromedriver.exe");

			//1. Invoke Browser
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			LOG.info("Chrome Browser Invoked");

			//2. Navigate to URl
			driver.get("https://ca.ingrammicro.com/");
			LOG.info("Navigated to URl: https://ca.ingrammicro.com/ ");

			//3. Click on the Product Link
			driver.findElement(By.id("product-activate")).click();
			LOG.info("Clicked on Product link");

			//4. Check if Category Block is displayed
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("products-menu-container")));
			LOG.info("Clicked on Product link");

			//5. Find the category element 
			WebElement category_link = 
					driver.findElement(By.xpath("//ul[@id='primary-menu-links']/li/a[contains(text(),'" + category + "')]"));
			Actions action = new Actions(driver);
			action.moveToElement(category_link).perform();
			LOG.info("Hovered on product: " + category);

			//6. Check secondary menu is displayed
			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("secondary-menu")));
			LOG.info("Wait for Sub category pop up complete.");

			//7. Get Sub category of all the links in secondary menu
			WebElement sub_category_link = 
					driver.findElement(By.xpath("//div[@id = 'secondary-menu']//li/a[contains(text(),'" + sub_category + "')]"));
			Actions action1 = new Actions(driver);
			action1.moveToElement(sub_category_link).perform();
			LOG.info("Hovered on Sub category: " + sub_category);

			//8. Check tertiary menu is displayed
			WebDriverWait wait2 = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("products-vendor-menu")));
			LOG.info("Wait for vendor pop up complete.");

			//9. Get List of all the links in tertiary menu
			WebElement vendor_link = 
					driver.findElement(By.xpath("//div[@id = 'products-vendor-menu']//li/a[contains(text(),'" + vendor + "')]"));
			vendor_link.click();
			LOG.info("Hovered on vendor: " + vendor);
			LOG.info("========>Execution Completed=========");
		}catch(Exception e) {
			LOG.fatal("Exception Caught : " +  e.getStackTrace());
			e.printStackTrace();
		}
	}

	//@Test
	public void HandleAjaxSearch() {
		String PRODUCT = "HP";
		
		//Browser Set Up and navigate
		System.setProperty("webdriver.chrome.driver", "E:\\_AkashStuff\\Automation\\dependencies\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://ca.ingrammicro.com/");//difference btw and naviogate/get
		Reporter.log("Browser opned and navigated",true);
		
		//Checkpoint
		String expected_title = "Computer and Technology Products - Services for Business to Business Needs - Ingram Micro";
		String actual_title = driver.getTitle();
		Assert.assertEquals(actual_title, expected_title, "Title is correct");
		
		//Soft Assert-Used only in cases where checkpointy failure has an
		//impact on the subsequent steps execution
		SoftAssert obj = new SoftAssert();
		obj.assertEquals(actual_title, expected_title, "Title is correct");
		
		//Search for item
		WebElement searchbox = driver.findElement(By.id("searchBox_Global"));;
		searchbox.sendKeys(PRODUCT);
		
		//Sync-wait for pop up to appear
		WebElement search_ajax_list = driver.findElement(By.id("live-search"));

		WebDriverWait wait = new WebDriverWait(driver, 60) ;
		wait.until(ExpectedConditions.visibilityOf(search_ajax_list));
		
		//Validate ajax pop with search list items is displayed
		boolean expected = search_ajax_list.isDisplayed();
		boolean actual = true;
		Assert.assertEquals(expected, actual,"List did not appear"); 
		
		//Fetch all the items in the list and check their text
		List<WebElement> collection = driver.findElements(By.xpath("//div[@id = 'live-search']//tr"));
		for(int i=0;i<collection.size();i++) {
			SoftAssert softassert = new SoftAssert();
			softassert.assertEquals(collection.get(i).getText(), PRODUCT);
		}
		

		
		

	}
}
