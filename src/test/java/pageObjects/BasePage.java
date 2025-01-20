package pageObjects;
import org.apache.logging.log4j.Logger;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BasePage {
	
	public static WebDriver driver;
	public Logger logger;
	public Properties p;
	
	
	@BeforeClass
	public void setup(String os, String br) throws IOException
	{
		//Config.properties file
		FileReader file=new FileReader(".src//test//resources//config.properties");
		p=new Properties();
		p.load(file);
		
		
		//OS and Browser
		if(p.getProperty("execution_envir").equalsIgnoreCase("remote"))
		{
			DesiredCapabilities cap=new DesiredCapabilities();
			
			if(os.equalsIgnoreCase("windows"))
			{
				cap.setPlatform(Platform.WIN10);
			}
			else if(os.equalsIgnoreCase("linux"))
			{
				cap.setPlatform(Platform.LINUX);
			}
			else if(os.equalsIgnoreCase("mac"))
			{
				cap.setPlatform(Platform.MAC);
			}
			else
			{
				System.out.println("no matching os");
				return;
			}
			
			
			//browser
			switch(br.toLowerCase())
			{
			case "chrome"  : cap.setBrowserName("chrome"); break;
			case "firefox" : cap.setBrowserName("Firefox"); break;
			case "edge"    : cap.setBrowserName("MicrosoftEdge"); break;
			default : System.out.println("No matching browser"); break;
			}
			
			
					
		}
		
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(p.getProperty("AppURL"));
		
		
		
		
	}
	
	@AfterClass
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	}
	
	public String randomString()
	{
		String generatedname=RandomStringUtils.randomAlphabetic(5);
		return generatedname;
	}
	
	public String randomnumber()
	{
		String generatednum=RandomStringUtils.randomAlphanumeric(10);
		return generatednum;
	}
	
	public String alphanumber()
	{
		String randomname=RandomStringUtils.randomAlphabetic(3);
		String randomnum=RandomStringUtils.randomAlphanumeric(4);
		return(randomname+"!@"+randomnum);
	}
	
	

}
