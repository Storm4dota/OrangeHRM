package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;


import pageObjects.LoginPage;
import testBases.BaseClass;

public class TC_MYINFO_LOGIN_01 extends BaseClass {
	
	
	@Test
	public void verify_login() throws InterruptedException
	{
		try 
		{
			
		
		LoginPage lp=new LoginPage(driver);
		
		
		logger.info("******Login Test case started****");
		Thread.sleep(2000);
		logger.info("get logo");
		lp.GetTitle();
		logger.info("enter username");
		lp.sendTxt_username(p.getProperty("username"));
		logger.info("enter password");
		lp.sendTxt_username(p.getProperty("password"));
		logger.info("click login button");
		lp.click_Login_btn();
		
		Assert.assertTrue(true);
		}
		catch(Exception e)
		{
			Assert.fail();
		}
	
		
	}
	
	

}
