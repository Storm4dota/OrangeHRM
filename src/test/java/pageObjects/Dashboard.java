package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboard extends BasePage {
	
	public Dashboard(WebDriver driver)
	{
		super(driver);
	}
	

	@FindBy(xpath="//li[1]//a[1]//span[1]") WebElement Admin_button;
	@FindBy(xpath="//span[normalize-space()='Leave']") WebElement Leave_button;
	@FindBy(xpath="//span[normalize-space()='PIM']") WebElement PIM_button;
	@FindBy(xpath="//span[normalize-space()='Time']") WebElement Time_button;
	@FindBy(xpath="//span[normalize-space()='Recruitment']") WebElement Recuritment_button;
	@FindBy(xpath="//span[normalize-space()='Directory']") WebElement Directory_button;
	@FindBy(xpath="//span[normalize-space()='Maintenance']") WebElement Maintenance_button;
	@FindBy(xpath="//span[normalize-space()='Claim']") WebElement Claim_button;
	@FindBy(xpath="//span[normalize-space()='Buzz']") WebElement Buzz_button;
	@FindBy(xpath="//input[@placeholder='Search']") WebElement Search_textbox;

	@FindBy(xpath="//button[@title='Timesheets']//*[name()='svg']") WebElement Timesheets_button;
	@FindBy(xpath="//button[@title='Leave List']//*[name()='svg']") WebElement Leave_list_button;
	@FindBy(xpath="//button[@title='Assign Leave']//*[name()='svg']") WebElement Assign_Leave_button;
	@FindBy(xpath="//button[@title='Apply Leave']//*[name()='svg']") WebElement Apply_leave_button;
	@FindBy(xpath="//button[@title='My Leave']//*[name()='svg']") WebElement My_leave_button;
	@FindBy(xpath="//button[@title='My Timesheet']//*[name()='svg']") WebElement My_Timesheet_button;
	@FindBy(xpath="//button[@title='Help']") WebElement help_button;
	
	public void Admin_click()
	{
		Admin_button.click();
	}
	
	public void Leave_click()
	{
		Leave_button.click();
	}
	
	public void PIM_click()
	{
		PIM_button.click();
	}
	
	public void Time_click()
	{
		Time_button.click();
	}
	public void Recuritment_click()
	{
		Recuritment_button.click();
	}
	public void Directory_click()
	{
		Directory_button.click();
	}
	
	public void Maintenance_click()
	{
		Maintenance_button.click();
	}
	
	public void Claim_click()
	{
		Claim_button.click();
	}
	public void Buzz_click()
	{
		Buzz_button.click();
	}
	public void Send_Search_textBox(String text)
	{
		Search_textbox.sendKeys(text);
	}
	public void Timesheets_click()
	{
		Timesheets_button.click();
	}
	public void Leave_list_click()
	{
		Leave_list_button.click();
	}
	
	public void Assign_Leave_click()
	{
		Assign_Leave_button.click();
	}
	
	public void Apply_leave_click()
	{
		Apply_leave_button.click();
	}
	public void My_leave_click()
	{
		My_leave_button.click();
	}
	public void My_Timesheet_click()
	{
		My_Timesheet_button.click();
	}
	public void Help_click()
	{
		help_button.click();
	}

}
