package testBase;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	public WebDriver driver;
	public Logger logger;
	public Properties prop;
	
	
	@BeforeClass
	@Parameters({"os", "browser"})
	public void setup(String os, String br) throws IOException
	
		{
			//Loading properties file
			FileReader fr;
			
			fr = new FileReader(".//src/test/resourcesconfig.properties");
			
			prop = new Properties();
			prop.load(fr);
			
			//Loading log4j2 file
			logger = LogManager.getLogger(this.getClass());
			
			//Launching browser based on condition
			switch(br.toLowerCase())
			{
			case "chrome": driver = new ChromeDriver(); break;
			case "edge": driver = new EdgeDriver(); break;
			case "firefox": driver = new FirefoxDriver(); break;
			default: System.out.println("No marching browser...");
			return;
			}
			
			
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(prop.getProperty("appURL"));
			driver.manage().window().maximize();
		
		}
	
	
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}
	
	
	public String randomString()
	{
		String newString = RandomStringUtils.randomAlphabetic(7);
		return newString;
	}
	
	
	public String randomNumber()
	{
		String newNumber = RandomStringUtils.randomNumeric(7);
		return newNumber;
	}
	
	public String randomAlphaNumeric()
	{
		String newNumeric = RandomStringUtils.randomNumeric(5);
		String newAlpha = RandomStringUtils.randomAlphabetic(5);
		
		return (newNumeric+"&"+newAlpha);
	}

}
