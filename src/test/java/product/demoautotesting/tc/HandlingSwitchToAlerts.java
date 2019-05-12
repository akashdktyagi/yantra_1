package product.demoautotesting.tc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HandlingSwitchToAlerts {

	@Test
	public void HandlingAlerts() {
	
		System.setProperty("webdriver.chrome.driver", "E:\\_AkashStuff\\Automation\\dependencies\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Alerts.html");
		Reporter.log("Site navigated");
		
		//Handle Alert with Ok Button
		driver.findElement(By.linkText("Alert with OK ")).click();
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display an  alert box:')]")).click();
		
		driver.switchTo().alert().accept();
		Reporter.log("Alert with Ok Button handled successfully");
		
		//Handle Alert with Cancel Button
		driver.findElement(By.linkText("Alert with OK & Cancel ")).click();
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box ')]")).click();

		driver.switchTo().alert().dismiss();
		Reporter.log("Alert Box dismissed success");
		
		//Handle Alert with Text Box
		driver.findElement(By.linkText("Alert with Textbox")).click();
		driver.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box ')]")).click();

		 driver.switchTo().alert().sendKeys("Akash");
		Reporter.log("Sent string to Alert Box successfully");
		
	}
	
}
