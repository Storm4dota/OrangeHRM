package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Help_Page extends BasePage {
	
	public Help_Page(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//span[normalize-space()='Admin User Guide']") WebElement Admin_User_Guide_button;
	
	@FindBy(xpath="//span[normalize-space()='Employee User Guide']") WebElement Employee_User_Guide_button;
	
	@FindBy(xpath="//span[normalize-space()='Mobile App']") WebElement Mobile_App_button;
	
	@FindBy(xpath="//span[normalize-space()='AWS Guide']") WebElement AWS_Guide_button;
	
	@FindBy(xpath="//span[normalize-space()='FAQs']") WebElement FAQs_button;
	
	@FindBy(xpath="//input[@id='query']") WebElement Query_Search_button;
	
	public void Admin_User_Guide_click()
	{
		Admin_User_Guide_button.click();
	}
	
	public void Employee_User_Guide_click()
	{
		Employee_User_Guide_button.click();
	}
	
	public void Mobile_App_click()
	{
		Mobile_App_button.click();
	}
	
	public void AWS_Guide_click()
	{
		AWS_Guide_button.click();
	}
	public void FAQs_click()
	{
		FAQs_button.click();
	}
	public void Query_Search_click(String entertext)
	{
		Query_Search_button.sendKeys(entertext);
	}

}
