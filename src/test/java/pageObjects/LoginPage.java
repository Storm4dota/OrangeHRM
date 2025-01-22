package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
	
	public LoginPage(WebDriver driver)
	{
		super(driver);	
	}
	
	

	@FindBy(xpath="//input[@placeholder='Username']") WebElement txt_username;
	@FindBy(xpath="//input[@placeholder='Password']") WebElement txt_password;
	@FindBy(xpath="//button[normalize-space()='Login']") WebElement login_button;
	
	
	public void sendTxt_username(String username)
	{
		txt_username.sendKeys(username);
	}
	
	public void sendTxt_password(String password)
	{
		txt_password.sendKeys(password);
	}
	
	public void click_Login_btn()
	{
		login_button.click();
	}
	
	public void GetTitle()
	{
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
	}


}
