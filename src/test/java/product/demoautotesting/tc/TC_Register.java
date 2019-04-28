package com.visionit.tc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.visionit.po.PO_Register;
public class TC_Register 
{
	WebDriver driver;
	PO_Register PO_Reg;
	
	@Test
	public void TC_01_Register() 
	{
		PO_Reg=PageFactory.initElements(driver,PO_Register.class );
		PO_Reg.SetFirstName("Pallavi");
		PO_Reg.SetLastName("Tandale");
		PO_Reg.SetAddress("Pimpri Chinchwad");
		PO_Reg.SetEmail("pal9@gmail.com");
		PO_Reg.SetTelePhone("9457812544");
		PO_Reg.Setgender();
		PO_Reg.SetHobbies();
		PO_Reg.SetLanguage("English");
		PO_Reg.SetSkills("Java");
		PO_Reg.SetCountry("India");
		PO_Reg.SetCountries("Japan");
		PO_Reg.SetYear("1994");
		PO_Reg.SetMonth("September");
		PO_Reg.SetDay("30");
		PO_Reg.SetFirstPW("Pallavi@123");
		PO_Reg.SetSecondPW("Pallavi@123");
		PO_Reg.SetSubmitbtn();
	}
	@BeforeMethod
	public void RegisterPage()
	{	
		driver=new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void afterMethod()
	{
		//driver.quit();

	}
}
