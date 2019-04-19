package product.demoautotesting.po;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class PO_Register 
{
    WebDriver driver;
    public PO_Register(WebDriver driver)
    {
    	this.driver=driver;
    }
   
    @FindBy(how=How.XPATH,using="//input[@type='text' and @placeholder='First Name']")
    private WebElement txtbx_first_name;
    public void enter_first_name(String firstName)
    {
    	txtbx_first_name.sendKeys(firstName);
    }
    
    @FindBy(how=How.XPATH,using="//input[@type='text' and @placeholder='Last Name']")
    private WebElement txtbx_last_name;
    public void enter_last_name(String lastName)
    {
    	txtbx_last_name.sendKeys(lastName);
    }
    
    @FindBy(how=How.XPATH,using="//textarea[@rows='3']")
    private WebElement txtbx_address;
    public void enter_address(String address)
    {
    	txtbx_address.sendKeys(address);
    }
    
    @FindBy(how=How.XPATH,using="//input[@type='email']")
    private WebElement txtbx_email_id;
    public void enter_email_add(String email_id)
    {
    	txtbx_email_id.sendKeys(email_id);
    }
    @FindBy(how=How.XPATH,using="//input[@type='tel']")
    private WebElement txtbx_phone;
    public void enter_phone_no(String phoneNo)
    {
    	txtbx_phone.sendKeys(phoneNo);
    }
    @FindBy(how=How.XPATH,using="//input[@type='radio' and @class='ng-pristine ng-untouched ng-valid']")
    private WebElement radio_btn_female;
    public void click_radio_btn()
    {
    	radio_btn_female.click();
    }
    
    @FindBy(how=How.XPATH,using="//input[@id='checkbox1']")
    private WebElement check_bx_1;
    public void click_check_bx_cricket()
    {
    	check_bx_1.click();
    }
    
    @FindBy(how=How.XPATH,using="//input[@id='checkbox2']")
    private WebElement check_bx_2;
    public void click_check_bx_movie()
    {
    	check_bx_2.click();
    }
    @FindBy(how=How.XPATH,using="//input[@id='checkbox3']")
    private WebElement check_bx_3;
    public void click_check_bx_hocky()
    {
    	check_bx_3.click();
    }
    
    @FindBy(how=How.XPATH,using="//div[@class='ui-autocomplete-multiselect ui-state-default ui-widget' and @id='msdd']")
    private WebElement language;
    public void select_language()
    {
    	language.click();
    	List<WebElement> list=driver.findElements(By.xpath("//a[@style='text-decoration:none' and @class='ui-corner-all']"));
    	for(int i=0;i<list.size();i++)
    	{
    		WebElement element=list.get(i);
    		String value=element.getText();
    		if(value.equals("English"))
    		{
    			element.click();
    		}
    		System.out.println("values from dropdwn is : "+value);
    		
    	}
    }
    
    @FindBy(how=How.XPATH,using="//select[contains(@id,Skills)][@class='form-control ng-pristine ng-valid ng-touched']")
    private WebElement dropdwn_skills;
    public void set_skills(String skills)
	{
		
		dropdwn_skills.click();
		Select select1=new Select(dropdwn_skills);
		select1.selectByValue(skills);
	}
    
    @FindBy(how=How.XPATH,using="//select[@id='countries']")
    private WebElement dropdwn_countries;
    public void set_country(String country)
	{
		Select select2=new Select(dropdwn_countries);
		select2.selectByValue(country);
	}
    
    @FindBy(how=How.XPATH,using="//span[@class='select2-selection select2-selection--single']")
    private WebElement dropdwn_select_countries;
    public void set_select_country(String select_country)
	{
		Select select3=new Select(dropdwn_countries);
		select3.selectByValue(select_country);
	}
    
    
    @FindBy(how=How.XPATH,using="//select[@id='yearbox' and @placeholder='Year']")
    private WebElement select_year;
    public void set_select_year(String year)
	{
    	select_year.click();
		Select select4=new Select(select_year);
		select4.selectByValue(year);
	}
    
    @FindBy(how=How.XPATH,using="//select[@placeholder='Month']")
    private WebElement select_month;
    public void set_select_month(String month)
	{
		Select select5=new Select(select_month);
		select5.selectByValue(month);
	}
    
    @FindBy(how=How.XPATH,using="//select[@id='daybox']")
    private WebElement select_date;
    public void set_select_date(String date)
	{
		Select select5=new Select(select_date);
		select5.selectByValue(date);
	}
    
    @FindBy(how=How.XPATH,using="//input[@id='firstpassword']")
    private WebElement select_first_password;
    public void set_select_password1(String password1)
	{
    	select_first_password.sendKeys(password1);
	}
    
    @FindBy(how=How.XPATH,using="//input[@id='secondpassword']")
    private WebElement select_second_password;
    public void set_select_password2(String password2)
	{
    	select_second_password.sendKeys(password2);
	}
    
    @FindBy(how=How.XPATH,using="//input[@id='imagesrc']")
    private WebElement choose_file;
    public void set_choose_file()
    {
    	choose_file.sendKeys("C:\\Users\\krishna\\Desktop\\6949019-flowers-wallpaper-desktop.jpg");
    }
    
    @FindBy(how=How.XPATH,using="//button[@id='submitbtn']")
    private WebElement click_submit;
    public void set_submit()
	{
    	click_submit.click();
	}
    
    @FindBy(how=How.XPATH,using="//button[@id='Button1' and @value='Refresh']")
    private WebElement click_refresh;
    public void set_refresh()
	{
    	click_refresh.click();
	}
}
