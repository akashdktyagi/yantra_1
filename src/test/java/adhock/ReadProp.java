package adhock;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import adhock.constatnts.ConstantsVariables;



public class ReadProp {

	public static void main(String[] args) 
	{
		WebDriver driver = null;
		
		Properties prop = new Properties();
		try 
		{
			FileInputStream ip = new FileInputStream( System.getProperty("user.dir") +  "/src/test/java/adhock/config.peoperties");
			//this FileInputStream will connect the .properties file with java code
			prop.load(ip);
			// loading all the properties form .properties file to an object prop 
		} 
		catch (FileNotFoundException e) 
		{
			// FileNotFoundException thrown when the file is not present at its given path
			e.printStackTrace();
		} catch (IOException e) {
			// IOException will occur if by any chance the file got  it throws the exception 
			e.printStackTrace();
		}
		
		String browserName = prop.getProperty("browser");
		System.out.println("Test is Running On Browser : " + browserName);
		String headLess = prop.getProperty("headless");
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			 if(headLess.equalsIgnoreCase("yes"))
			 {
				 ChromeOptions options = new ChromeOptions();
				 options.addArguments("--headless");
				 driver = new ChromeDriver(options);
			 }
			 else
			 {
				 driver = new ChromeDriver();
			 }
				
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			 driver = new FirefoxDriver();
		}
		else 
		{
			System.out.println(ConstantsVariables.NO_BROWSER_FOUND);
		}
		
		driver.get(prop.getProperty("url"));
		System.out.println("Entered URL's Title is : " + driver.getTitle());
		
	}

}
