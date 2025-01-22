package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBases.BaseClass;
import utilities.DataProviders;

public class TC_MYINFO_LOGIN_01DDT extends BaseClass {
	
	
	@Test(dataProvider="OrangeHRMlogindata",dataProviderClass=DataProviders.class)
	public void verify_loginDDT(String entUsername, String entpassword, String expResults)
	{
		LoginPage lp=new LoginPage(driver);
		lp.sendTxt_username(entUsername);
		lp.sendTxt_password(entpassword);
		lp.click_Login_btn();
		
		MyAccountPage mcp=new MyAccountPage(driver);
		
		Boolean targetpage=mcp.ClientBanner();
		try {
		if(expResults.equalsIgnoreCase("Valid"))
		{
			if(targetpage==true)
			{
				mcp.click_optionsprofile();
				mcp.Logoutbtn();
			}
			else
			{
				Assert.assertTrue(false);
			}
			
		}
		if(expResults.equalsIgnoreCase("Invalid"))
		{
			if(targetpage==true)
			{
				mcp.click_optionsprofile();
				mcp.Logoutbtn();
				Assert.assertTrue(false);
			}
			else
			{
				Assert.assertTrue(true);
			}
		}
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
		
		
	}

}
