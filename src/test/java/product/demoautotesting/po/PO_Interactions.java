package product.demoautotesting.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_Interactions 
{
	WebDriver driver;
	public PO_Interactions(WebDriver driver)
	{
		this.driver=driver;

	}
	
	@FindBy(how=How.XPATH,using="//a[@href='Interactions.html']")
	private WebElement click_interaction;
	public void Interaction_link()
	{
		click_interaction.click();
	}
	
	@FindBy(how=How.LINK_TEXT,using="Drag and Drop")
	private WebElement click_drag_and_drop;
	public void Drag_and_Drop()
	{
		click_drag_and_drop.click();
	}
	

	@FindBy(how=How.XPATH,using="//a[@href='Static.html']")
	private WebElement click_static;
	public void Static_Drag_and_Drop()
	{
		click_static.click();
	}
	
	@FindBy(how=How.XPATH,using="//img[@src='logo.png']")
	private WebElement drag_s;
	@FindBy(how=How.XPATH,using="//div[@id='droparea']")
	private WebElement drop_area;
	
	public void Dragging_elements()
	{	
		Actions act1=new Actions(driver);
		//act1.clickAndHold(drag_s).dragAndDropBy(drag_s, 10, 100).build().perform();	
		act1.dragAndDrop(drag_s, drop_area).build().perform();
	}
	
	@FindBy(how=How.XPATH,using="//a[@href='Resizable.html']")
	private WebElement click_resizable;
	public void Resizable()
	{
		click_resizable.click();
	}
	
	@FindBy(how=How.XPATH,using="//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']")
	private WebElement click_resizable_element;
	public void Resizable_field()
	{
		Actions act2=new Actions(driver);
		act2.clickAndHold(click_resizable_element).moveByOffset(50, 50).build().perform();
	}
	
	@FindBy(how=How.XPATH,using="//a[@href='Selectable.html']")
	private WebElement click_selectable;
	public void Selectable()
	{
		click_selectable.click();
	}
	
	@FindBy(how=How.XPATH,using="//ul[@class='deaultFunc']/li[4]")
	private WebElement click_defaul_functlty;
	public void Select_anyOf_default()
	{
		click_defaul_functlty.click();
	}
	
	@FindBy(how=How.XPATH,using="//a[@href='#Serialize']")
	private WebElement click_serialize_functlty;
	public void Serialize()
	{
		click_serialize_functlty.click();
	}
	
	@FindBy(how=How.XPATH,using="//ul[@class='SerializeFunc']/li[5]/b")
	private WebElement click_fieldOf_serialize;
	public void Select_anyOf_Serialize()
	{
		click_fieldOf_serialize.click();
	}

}
