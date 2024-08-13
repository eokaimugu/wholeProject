package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	
	//Identifying elements on the page	
	@FindBy(xpath="//a[@class='btn btn-black navbar-btn']")
	WebElement register_btn;
	
	//Action method for the identified element
	public void clickRegister() {
		register_btn.click();
	}
		
}
