package sauceLabsTest;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestCase1 {
	
	//public WebDriver driver = null;
	
	/*ChromeOptions browserOptions = new ChromeOptions();
	browserOptions.setPlatformName("Windows 11");
	browserOptions.setBrowserVersion("latest");
	Map<String, Object> sauceOptions = new HashMap<>();
	sauceOptions.put("username", "oauth-eokaim6vrs33-eb63b");
	sauceOptions.put("accessKey", "f21ae6d3-666f-4102-92a0-e952a659c6c5");
	sauceOptions.put("build", "selenium-build-FEK7L");
	sauceOptions.put("name", "SauceLabsTest");
	browserOptions.setCapability("sauce:options", sauceOptions);*/
	
	
	// start the session
		//URL url = new URL("https://ondemand.us-west-1.saucelabs.com:443/wd/hub");
		//RemoteWebDriver driver = new RemoteWebDriver(url, browserOptions);

	
	
	ChromeOptions options = new ChromeOptions();
	options.setPlatformName("Windows 11");
	options.setBrowserVersion("latest");

	Map<String, Object> sauceOptions = new HashMap<>();
	sauceOptions.put("username" , System.getenv("oauth-eokaim6vrs33-eb63b"));
	sauceOptions.put("accessKey", System.getenv("f21ae6d3-666f-4102-92a0-e952a659c6c5"));
	sauceOptions.put("name", "SauceLabsTest");
	options.setCapability("sauce:options", sauceOptions);
	
	// start the session
		URL url = new URL("https://ondemand.us-west-1.saucelabs.com:443/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(url, options);
	
	
	// run commands and assertions
	driver.get("https://saucedemo.com");
	String title = driver.getTitle();
	boolean titleIsCorrect = title.contains("Swag Labs");
	String jobStatus = titleIsCorrect ? "passed" : "failed";

	// end the session
	driver.executeScript("sauce:job-result=" + jobStatus);
	driver.quit();
	

}
