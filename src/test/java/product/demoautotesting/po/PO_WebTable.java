package product.demoautotesting.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_WebTable 
{
	WebDriver driver;
    public PO_WebTable(WebDriver driver)
    {
    	this.driver=driver;
    }
    
    @FindBy(how=How.XPATH,using="//div[@class='ui-grid-viewport ng-isolate-scope']//div[contains(@id,'0-uiGrid-000B')]//div/button")
    private WebElement edit_1;
    public void edit_btn_1()
    {
    	Actions act=new Actions(driver);
    	act.doubleClick(edit_1).perform();
    	
    }
  //div[@class='col-xs-12 myGrid ui-grid ng-isolate-scope grid1554904624992']//div[@class='ui-grid-viewport ng-isolate-scope']//div[@class='ui-grid-row ng-scope'][1]//div[@class='ui-grid-cell ng-scope ui-grid-coluiGrid-000B']//div[@class='avddbl'][1]//button[@class='btn btn-xs btn-custom']//i
   

}
