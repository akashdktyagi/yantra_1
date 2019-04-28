package PO;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class PO_Register
{
    //initialize the driver
	WebDriver driver;
	
	//parameterize the constructor 
	public PO_Register(WebDriver d)
	{
		this.driver=d;
	}
	
	//declare locators of PO_Register
	@FindBy(how=How.XPATH,using="//input[@placeholder='First Name']")
	private WebElement txtbox_firstName;
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Last Name']")
	private WebElement txtbox_lastName;
	
	@FindBy(how=How.XPATH,using="//textarea[@rows='3']")
	private WebElement txtbox_add;
	
	@FindBy(how=How.XPATH,using="//input[@type='email']")
	private WebElement txtbox_email;
	
	@FindBy(how=How.XPATH,using="//input[@type='tel']")
	private WebElement txtbox_tel;
	
	@FindBy(how=How.XPATH,using="//input[@value='FeMale']")
	private WebElement radioButton_gender;
	
	@FindBy(how=How.ID,using="checkbox2")
	private WebElement Checkbox_hobbies;
	
	@FindBy(how=How.XPATH,using="//div[@class='ui-autocomplete-multiselect ui-   state-default ui-widget']")
	private WebElement Sel_Language;
	
	@FindBy(how=How.ID,using="Skills")
	private WebElement Sel_skills;
	
	@FindBy(how=How.ID,using="countries")
	private WebElement Sel_country;
	
	@FindBy(how=How.XPATH,using="//select[@class='select2-hidden-accessible']")
	private WebElement Select_country;
	
	@FindBy(how=How.ID,using="yearbox")
	private WebElement Sel_year;
	
	@FindBy(how=How.XPATH,using="//select[@placeholder='Month']")
	private WebElement Sel_month;
	
	@FindBy(how=How.ID,using="daybox")
	private WebElement Sel_day;
	
	@FindBy(how=How.ID,using="firstpassword")
	private WebElement Sel_firstpassword;
	
	@FindBy(how=How.ID,using="secondpassword")
	private WebElement Sel_secondpassword;
	
	@FindBy(how=How.ID,using="submitbtn")
	private WebElement Click_submitbtn;
	
       //declare methods

	public void SetFirstName(String FN)
	{
		txtbox_firstName.sendKeys(FN);
	
	}
	
	public void SetLastName(String LN)
	{
		txtbox_lastName.sendKeys(LN);
	}
	
	public void SetAddress(String add)
	{
		txtbox_add.sendKeys(add);
	}
	
	public void SetEmail(String email)
	{
		txtbox_email.sendKeys(email);
	}
	
	
	public void SetTelePhone(String tel)
	{
		txtbox_tel.sendKeys(tel);
	}
	
	public void Setgender()
	{
		
		radioButton_gender.click();
	}
	
	public void SetHobbies()
	{
		Checkbox_hobbies.click();
	}
	
	public void SetLanguage(String lang)
	{
		//driver.findElement(By.xpath("Sel_Language]")).click();
		List<WebElement>langList=driver.findElements(By.xpath("//select[@type='text']"));
		for(int i=0;i<1;i++)
		{
			WebElement element=langList.get(i);
			element.getAttribute(lang);
			System.out.println("value from drop down is:"+lang);
		}
		
	}
	
	public void SetSkills(String skills)
	{
		Select sel=new Select(Sel_skills);
		sel.selectByVisibleText(skills);
	}
	
	public void SetCountry(String coun)
	{
		Select sel=new Select(Sel_country);
		sel.selectByVisibleText(coun);
	}
	
	public void SetCountries(String country1)
	{
		Select sel=new Select(Select_country);
		sel.selectByVisibleText(country1);
		
	}
	
	public void SetYear(String year)
	{
		Select sel=new Select(Sel_year);
		sel.selectByVisibleText(year);
	}
	
	public void SetMonth(String month)
	{
		Select sel=new Select(Sel_month);
		sel.selectByVisibleText(month);
		
	}
	public void SetDay(String day)
	{
		Select sel=new Select(Sel_day);
		sel.selectByVisibleText(day);
	}
	
	public void SetFirstPW(String Firstpw)
	{  
		Sel_firstpassword.sendKeys(Firstpw);
	}
	
	public void SetSecondPW(String secondpw)
	{
		
		Sel_secondpassword.sendKeys(secondpw);
	}
	
	public void SetSubmitbtn()
	{
		
		Click_submitbtn.click();
	}
	
}
