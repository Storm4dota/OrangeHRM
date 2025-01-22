package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{
	
	public MyAccountPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//img[@alt='client brand banner']") WebElement ClientBrandBanner;
	@FindBy(xpath="//span[@class='oxd-userdropdown-tab']") WebElement optionsprofile;
	@FindBy(xpath="//a[normalize-space()='Logout']") WebElement logoutbutton;
	public Boolean ClientBanner()
	{
		return ClientBrandBanner.isDisplayed();
	}
	
	public void click_optionsprofile()
	{
		optionsprofile.click();
	}
	
	public void Logoutbtn()
	{
		logoutbutton.click();
	}

}
